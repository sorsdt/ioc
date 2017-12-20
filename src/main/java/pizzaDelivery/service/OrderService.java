package pizzaDelivery.service;

import pizzaDelivery.domain.Order;
import pizzaDelivery.domain.Pizza;
import pizzaDelivery.domain.User;

import java.util.List;

public interface OrderService {
    void placeOrder(User user, Pizza... pizzas);
    List<Order> allOrders();
}
