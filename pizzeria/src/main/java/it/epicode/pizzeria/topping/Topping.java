package it.epicode.pizzeria.topping;

import it.epicode.pizzeria.menu.ElementoMenu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Topping implements ElementoMenu {

    private String nomeTopping;
    private int calorie;
    private double prezzo;

    @Override
    public String getNome() {
        return nomeTopping;
    }

}
