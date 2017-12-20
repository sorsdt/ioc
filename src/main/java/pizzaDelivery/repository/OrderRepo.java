package pizzaDelivery.repository;

import pizzaDelivery.entity.Order;

import java.util.List;

public interface OrderRepo {
    List<Order> allOrders();
    void saveOrder(Order order);
}
