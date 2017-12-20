package pizzaDelivery.entity;

import pizzaDelivery.PizzaType;

import java.math.BigDecimal;

public class Pizza {
    private Integer id;
    private PizzaType type;
    private String title;
    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PizzaType getType() {
        return type;
    }

    public void setType(PizzaType type) {
        this.type = type;
    }

    public Pizza() {
    }

    public Pizza(Integer id, PizzaType type, String title, BigDecimal price) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pizza pizza = (Pizza) o;

        if (type != pizza.type) return false;
        if (!title.equals(pizza.title)) return false;
        return price.equals(pizza.price);
    }

    @Override
    public int hashCode() {
        int result = type.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + price.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "id=" + id +
                ", type=" + type +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
