package dal;

import Model.OrderDetail;

import java.util.List;
import java.util.Optional;

public class OrderDetailDao implements Dao<OrderDetail> {
    @Override
    public Optional<OrderDetail> get(Integer id) {
        return Optional.empty();
    }

    @Override
    public List<OrderDetail> getAll() {
        return null;
    }

    @Override
    public void save(OrderDetail orderDetail) {

    }

    @Override
    public void update(OrderDetail orderDetail, String[] params) {

    }

    @Override
    public void delete(OrderDetail orderDetail) {

    }
}
