package club.dafty.pojo.service.impl;

import club.dafty.gshop.pojo.Order;
import club.dafty.pojo.dao.OrderDao;
import club.dafty.pojo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public boolean add(Order dept) {
        return orderDao.addDept(dept);
    }

    @Override
    public Order getById(Long id) {
        return orderDao.findById(id);
    }

    @Override
    public List<Order> getAll() {
        return orderDao.findAll();
    }
}
