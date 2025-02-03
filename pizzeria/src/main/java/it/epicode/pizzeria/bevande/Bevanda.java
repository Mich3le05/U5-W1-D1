package it.epicode.pizzeria.bevande;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Bevanda {

    private String bevanda;
    private int calorie;
    private double prezzo;

}
