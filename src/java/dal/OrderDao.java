package dal;

import Model.Order;

import java.util.List;
import java.util.Optional;

public class OrderDao implements Dao<Order> {


    @Override
    public Optional<Order> get(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<Order> getAll() {
        return null;
    }

    @Override
    public void save(Order order) {

    }

    @Override
    public void update(Order order, String[] params) {

    }

    @Override
    public void delete(Order order) {

    }

    @Override
    public List<Order> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
