package pizzaDelivery.service;

import pizzaDelivery.PizzaType;
import pizzaDelivery.entity.Pizza;

import java.util.List;

public interface PizzaService {
    List<Pizza> getAllPizza();
    Pizza getPizzaByName(String title);
    List<Pizza> getPizzasByType(PizzaType pizzaType);
}
