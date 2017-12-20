package pizzaDelivery;

import ioc.Config;
import ioc.JavaConfig;
import ioc.SimpleIoC;
import pizzaDelivery.domain.User;
import pizzaDelivery.repository.OrderRepoInMemory;
import pizzaDelivery.repository.PizzaRepoInMemory;
import pizzaDelivery.service.OrderService;
import pizzaDelivery.service.OrderServiceImpl;
import pizzaDelivery.service.PizzaService;
import pizzaDelivery.service.PizzaServiceImpl;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Config config = new JavaConfig(new HashMap<String, Class<?>>(){{
            put("pizzaRepo", PizzaRepoInMemory.class);
            put("pizzaService", PizzaServiceImpl.class);
            put("orderRepo", OrderRepoInMemory.class);
            put("orderService", OrderServiceImpl.class);
        }});
        SimpleIoC ioC = new SimpleIoC(config);
        PizzaService pizzaService = (PizzaService) ioC.getBean("pizzaService");
        OrderService orderService = (OrderService) ioC.getBean("orderService");
        final User user = new User("qwe", "rty");
        orderService.placeOrder(user
                , pizzaService.getPizzaByName("test1")
                , pizzaService.getPizzaByName("test2"));
        System.out.println(orderService.allOrders());
    }
}
