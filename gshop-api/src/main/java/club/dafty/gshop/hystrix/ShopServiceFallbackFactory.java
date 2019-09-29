package club.dafty.gshop.hystrix;

import club.dafty.gshop.pojo.Order;
import club.dafty.gshop.service.ShopService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Hystrix熔断器工厂类
 * @author leechengchao@foxmail.com
 * @version 1.0
 * @date 2019/9/16 14:17
 */
@Component
public class ShopServiceFallbackFactory implements FallbackFactory {
    @Override
    public Object create(Throwable throwable) {
        return new ShopService() {
            @Override
            public boolean add(Order order) {
                return false;
            }

            @Override
            public Order get(Long id) {
                Order order = new Order();
                order.setDname("查询失败哦（断路器）");
                return order;
            }

            @Override
            public List<Order> list() {
                return null;
            }
        };
    }
}
