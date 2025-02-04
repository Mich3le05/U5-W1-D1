package it.epicode.pizzeria.menu;

import it.epicode.pizzeria.bevande.Bevanda;
import it.epicode.pizzeria.pizze.Pizza;
import it.epicode.pizzeria.topping.Topping;

import lombok.RequiredArgsConstructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@RequiredArgsConstructor

public class MenuConfig {

    private final Bevanda aranciata;
    private final Bevanda cocaCola;

    private final Pizza pizzaMargherita;
    private final Pizza pizzaFunghi;
    private final Pizza pizzaSalame;

    private final Topping abbondanteMozzarella;
    private final Topping salame;

    @Bean
    public Menu creaMenu() {
        Menu m = new Menu();
        m.setNome("Menu Pranzo");
        m.setElementiMenu(List.of(aranciata, cocaCola, pizzaMargherita, pizzaFunghi,
                pizzaSalame, abbondanteMozzarella, salame));
        return m;
    }

}
