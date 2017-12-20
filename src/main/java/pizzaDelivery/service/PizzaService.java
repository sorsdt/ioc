package pizzaDelivery.service;

import pizzaDelivery.domain.PizzaType;
import pizzaDelivery.domain.Pizza;

import java.util.List;

public interface PizzaService {
    List<Pizza> getAllPizza();
    Pizza getPizzaByName(String title);
    List<Pizza> getPizzasByType(PizzaType pizzaType);
}
