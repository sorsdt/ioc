package pizzaDelivery.repository;

import pizzaDelivery.domain.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderRepoInMemory implements OrderRepo {
    private List<Order> orders = new ArrayList<>();

    @Override
    public List<Order> allOrders() {
        return orders;
    }

    @Override
    public void saveOrder(Order order) {
        orders.add(order);
    }
}
