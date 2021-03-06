package pizzaDelivery.service;

import pizzaDelivery.domain.Order;
import pizzaDelivery.domain.Pizza;
import pizzaDelivery.domain.User;
import pizzaDelivery.repository.OrderRepo;

import java.util.Arrays;
import java.util.List;

public class OrderServiceImpl implements OrderService {
    private OrderRepo orderRepo;

    public OrderServiceImpl(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @Override
    public void placeOrder(User user, Pizza... pizzas) {
        Order order = new Order(user, Arrays.asList(pizzas));
        orderRepo.saveOrder(order);
    }

    @Override
    public List<Order> allOrders() {
        return orderRepo.allOrders();
    }
}
