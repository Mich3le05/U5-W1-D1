package it.epicode.pizzeria.pizze;

import it.epicode.pizzeria.menu.ElementoMenu;
import it.epicode.pizzeria.topping.Topping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Pizza implements ElementoMenu {

    private String nomePizza;
    private int calorie;
    private double prezzo;
    private List<Topping> topping = new ArrayList<>();

    @Override
    public String getNome() {
        return nomePizza;
    }
}
