package club.dafty.pojo.service;


import club.dafty.gshop.pojo.Order;

import java.util.List;

public interface OrderService {
    public boolean add(Order dept);
    public Order getById(Long id);
    public List<Order> getAll();
}
