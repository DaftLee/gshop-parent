package club.dafty.pojo.control;

import club.dafty.gshop.pojo.Order;
import club.dafty.pojo.service.impl.OrderServiceImpl;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author leechengchao@foxmail.com
 * @date 2019
 */
@RestController
public class OrderController {
    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
    @Autowired
    private OrderServiceImpl service;
    @Value("${server.port}")
    private String port;
    @Value("${spring.application.name}")
    private String applicationName;

    @RequestMapping(value = "order/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Order dept) {
        return service.add(dept);
    }

    @HystrixCommand(fallbackMethod = "getError")
    @RequestMapping(value = "order/get/{id}",method = RequestMethod.GET)
    public Order get(@PathVariable("id") Long id ){
        Order order = service.getById(id);
        if (order == null){
            throw new RuntimeException("error");
        }
        return order;
    }

    @RequestMapping(value = "order/list",method = RequestMethod.GET)
    public List<Order> get(){
        List<Order> list = service.getAll();
        logger.info("查询dept list结果:"+list);
        return service.getAll();
    }
}
