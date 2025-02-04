package it.epicode.pizzeria.bevande;

import it.epicode.pizzeria.menu.ElementoMenu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Bevanda implements ElementoMenu {

    private String nomeBevanda;
    private int calorie;
    private double prezzo;

    @Override
    public String getNome() {
        return nomeBevanda;
    }
}
