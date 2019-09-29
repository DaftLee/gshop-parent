package club.dafty.gshop.service;

import club.dafty.gshop.hystrix.ShopServiceFallbackFactory;
import club.dafty.gshop.pojo.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author leechengchao@foxmail.com
 * @version 1.0
 * @date 2019/9/16 9:17
 */
@FeignClient(value = "MICROSERVICE-PROVIDER",fallbackFactory = ShopServiceFallbackFactory.class)
public interface ShopService {
    @RequestMapping(value = "dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Order order);

    @RequestMapping(value = "dept/get/{id}",method = RequestMethod.GET)
    public Order get(@PathVariable("id") Long id);
    @RequestMapping(value = "dept/list",method = RequestMethod.GET)
    public List<Order> list();

}
