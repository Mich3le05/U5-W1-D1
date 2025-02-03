package it.epicode.pizzeria.topping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class PizzaConfig {
    @Bean
    public Topping abbondanteMozzarella() {
        Topping t = new Topping();
        t.setName("Abbondante Mozzarella");
        t.setCalorie(40);
        t.setPrice(1.99);
        return t;
    }

    @Bean
    public Topping salame() {
        Topping t = new Topping();
        t.setName("Salame");
        t.setCalorie(40);
        t.setPrice(1.99);
        return t;
    }
}
