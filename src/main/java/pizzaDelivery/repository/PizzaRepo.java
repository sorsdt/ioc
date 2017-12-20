package pizzaDelivery.repository;

import pizzaDelivery.PizzaType;
import pizzaDelivery.entity.Pizza;

import java.util.List;

public interface PizzaRepo {
    List<Pizza> getAllPizza();
    Pizza getPizzaByName(String title);
    List<Pizza> getPizzasByType(PizzaType pizzaType);
}
