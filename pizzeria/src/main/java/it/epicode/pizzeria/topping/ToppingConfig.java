package it.epicode.pizzeria.topping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class ToppingConfig {
    @Bean
    public Topping abbondanteMozzarella() {
        Topping t = new Topping();
        t.setNomeTopping("Abbondante Mozzarella");
        t.setCalorie(40);
        t.setPrezzo(1.99);
        return t;
    }

    @Bean
    public Topping salame() {
        Topping t = new Topping();
        t.setNomeTopping("Salame");
        t.setCalorie(40);
        t.setPrezzo(1.99);
        return t;
    }
}
