package ioc;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pizzaDelivery.domain.User;
import pizzaDelivery.service.OrderService;
import pizzaDelivery.service.PizzaService;


public class SpringIoCRunner {
    public static void main(String[] args) {
        ConfigurableApplicationContext repo = new ClassPathXmlApplicationContext("repo.xml");
        ConfigurableApplicationContext service = new ClassPathXmlApplicationContext("service.xml");
        final User user = new User("qwe", "rty");

        PizzaService pizzaService = (PizzaService) ioC.getBean("pizzaService");
        OrderService orderService = (OrderService) ioC.getBean("orderService");

        orderService.placeOrder(user
                , pizzaService.getPizzaByName("test1")
                , pizzaService.getPizzaByName("test2"));
        System.out.println(orderService.allOrders());
    }
}
