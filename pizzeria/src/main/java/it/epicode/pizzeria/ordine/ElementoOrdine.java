package it.epicode.pizzeria.ordine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ElementoOrdine {

    private String nome;
    private double prezzo;

}