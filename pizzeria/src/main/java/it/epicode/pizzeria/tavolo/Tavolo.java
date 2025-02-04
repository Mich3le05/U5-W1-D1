package it.epicode.pizzeria.tavolo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Tavolo {
    private int numero;
    private int copertiMassimi;
    private boolean occupato;
}
