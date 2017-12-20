package pizzaDelivery.repository;

import pizzaDelivery.domain.PizzaType;
import pizzaDelivery.domain.Pizza;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PizzaRepoInMemory implements PizzaRepo {
    List<Pizza> pizzas = new ArrayList<>();

    public PizzaRepoInMemory() {
        pizzas.add(new Pizza(1, PizzaType.Type1, "test1", new BigDecimal("1.0")));
        pizzas.add(new Pizza(2, PizzaType.Type2, "test2", new BigDecimal("2.0")));
        pizzas.add(new Pizza(3, PizzaType.Type3, "test3", new BigDecimal("3.0")));
        pizzas.add(new Pizza(4, PizzaType.Type2, "test3", new BigDecimal("3.0")));
    }

    @Override
    public List<Pizza> getAllPizza() {
        return pizzas;
    }

    @Override
    public Pizza getPizzaByName(String title) {
        for (Pizza pizza : pizzas) {
            if (title.equals(pizza.getTitle())) {
                return pizza;
            }
        }
        return new Pizza();
    }

    @Override
    public List<Pizza> getPizzasByType(PizzaType pizzaType) {
        List<Pizza> list = new ArrayList<>();
        for (Pizza pizza : pizzas) {
            if (pizza.getType() == pizzaType) {
                list.add(pizza);
            }
        }
        return list;
    }
}
