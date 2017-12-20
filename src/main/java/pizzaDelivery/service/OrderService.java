package pizzaDelivery.service;

import pizzaDelivery.entity.Order;
import pizzaDelivery.entity.Pizza;
import pizzaDelivery.entity.User;

import java.util.List;

public interface OrderService {
    void placeOrder(User user, Pizza... pizzas);
    List<Order> allOrders();
}
