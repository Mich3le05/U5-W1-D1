package it.epicode.pizzeria.pizze;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class PizzaConfig {

    @Bean
    public Pizza pizzaMargherita() {
        Pizza p = new Pizza();
        p.setNomePizza("Pizza Margherita");
        p.setCalorie(400);
        p.setPrezzo(5.0);
        return p;
    }

    @Bean
    public Pizza pizzaSalame() {
        Pizza p = new Pizza();
        p.setNomePizza("Pizza Salame");
        p.setCalorie(400);
        p.setPrezzo(5.0);
        return p;
    }

    @Bean
    public Pizza pizzaFunghi() {
        Pizza p = new Pizza();
        p.setNomePizza("Pizza Funghi");
        p.setCalorie(400);
        p.setPrezzo(5.0);
        return p;
    }
}
