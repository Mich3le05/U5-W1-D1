package it.epicode.pizzeria.tavoli;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Tavolo {
    private int numeroTavolo;
    private int numeroCoperti;
    private int copertiMassimi;
    private StatoTavolo statoTavolo;
}
