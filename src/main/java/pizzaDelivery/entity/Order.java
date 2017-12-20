package pizzaDelivery.entity;

import java.math.BigDecimal;
import java.util.List;

public class Order {
    private User user;
    private List<Pizza> pizzas;
    private BigDecimal totalprice = new BigDecimal("0");

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(BigDecimal totalprice) {
        this.totalprice = totalprice;
    }

    public Order(User user, List<Pizza> pizzas) {
        this.user = user;
        this.pizzas = pizzas;
        for (Pizza pizza : pizzas) {
            totalprice = totalprice.add(new BigDecimal(String.valueOf(pizza.getPrice())));
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "user=" + user +
                ", pizzas=" + pizzas +
                ", totalprice=" + totalprice +
                '}';
    }
}
