package pizzaDelivery.service;

import pizzaDelivery.PizzaType;
import pizzaDelivery.entity.Pizza;
import pizzaDelivery.repository.PizzaRepo;

import java.util.List;

public class PizzaServiceImpl implements PizzaService {
    private PizzaRepo pizzaRepo;

    public PizzaServiceImpl(PizzaRepo pizzaRepo) {
        this.pizzaRepo = pizzaRepo;
    }

    @Override
    public List<Pizza> getAllPizza() {
        return pizzaRepo.getAllPizza();
    }

    @Override
    public Pizza getPizzaByName(String title) {
        return pizzaRepo.getPizzaByName(title);
    }

    @Override
    public List<Pizza> getPizzasByType(PizzaType pizzaType) {
        return pizzaRepo.getPizzasByType(pizzaType);
    }
}
