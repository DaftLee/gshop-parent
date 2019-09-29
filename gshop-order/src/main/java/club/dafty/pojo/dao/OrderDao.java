package club.dafty.pojo.dao;

import club.dafty.gshop.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDao {
    public boolean addDept(Order dept);
    public Order findById(Long id);
    public List<Order> findAll();
}
