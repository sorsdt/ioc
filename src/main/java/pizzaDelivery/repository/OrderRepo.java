package pizzaDelivery.repository;

import pizzaDelivery.domain.Order;

import java.util.List;

public interface OrderRepo {
    List<Order> allOrders();
    void saveOrder(Order order);
}
