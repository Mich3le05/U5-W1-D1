package it.epicode.pizzeria.ordine;

import it.epicode.pizzeria.tavolo.Tavolo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ordine {

    private int numeroOrdine;
    private double prezzoOrdine;
    private Tavolo tavolo;
    private int NumeroCoperti;

}
