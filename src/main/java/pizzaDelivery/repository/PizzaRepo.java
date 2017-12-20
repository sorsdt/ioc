package pizzaDelivery.repository;

import pizzaDelivery.domain.PizzaType;
import pizzaDelivery.domain.Pizza;

import java.util.List;

public interface PizzaRepo {
    List<Pizza> getAllPizza();
    Pizza getPizzaByName(String title);
    List<Pizza> getPizzasByType(PizzaType pizzaType);
}
