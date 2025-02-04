package it.epicode.pizzeria.menu;

import it.epicode.pizzeria.bevande.Bevanda;
import it.epicode.pizzeria.pizze.Pizza;
import it.epicode.pizzeria.topping.Topping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration

public class MenuConfig {

    @Autowired
    private Bevanda aranciata;
    @Autowired
    private Bevanda cocaCola;

    @Autowired
    private Pizza pizzaMargherita;
    @Autowired
    private Pizza pizzaFunghi;
    @Autowired
    private Pizza pizzaSalame;

    @Autowired
    private Topping abbondanteMozzarella;
    @Autowired
    private Topping salame;

    @Bean
    public Menu creaMenu() {
        Menu m = new Menu();
        m.setNome("Menu Pranzo");
        m.getBevande().add(aranciata);
        m.getBevande().add(cocaCola);
        m.getPizze().add(pizzaMargherita);
        m.getPizze().add(pizzaFunghi);
        m.getPizze().add(pizzaSalame);
        m.setToppings(List.of(abbondanteMozzarella, salame));
        return m;
    }

}
