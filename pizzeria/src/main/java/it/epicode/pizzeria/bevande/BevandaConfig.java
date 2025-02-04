package it.epicode.pizzeria.bevande;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class BevandaConfig {

    @Bean
    public Bevanda aranciata() {
        Bevanda b = new Bevanda();
        b.setNomeBevanda("Aranciata");
        b.setCalorie(20);
        b.setPrezzo(3.99);
        return b;
    }

    @Bean
    public Bevanda cocaCola() {
        Bevanda b = new Bevanda();
        b.setNomeBevanda("CocaCola");
        b.setCalorie(20);
        b.setPrezzo(3.99);
        return b;
    }
}
