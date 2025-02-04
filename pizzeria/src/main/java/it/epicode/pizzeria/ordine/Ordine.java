package it.epicode.pizzeria.ordine;

import it.epicode.pizzeria.menu.ElementoMenu;
import it.epicode.pizzeria.tavoli.Tavolo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Ordine {

    private int numeroOrdine;
    private Tavolo tavolo;
    private StatoOrdine statoOrdine;
    private int numeroCoperti;
    private LocalDateTime oraAquisizioneOrdine = LocalDateTime.now();
    private List<ElementoMenu> elementiOrdine = new ArrayList<>();

    private double costoCopeto = 0.0;

    public double calcolaCostoCoperto() {

        double totaleCoperto = numeroCoperti * costoCopeto;
        double sommaPrezzi = elementiOrdine.stream().mapToDouble(ElementoMenu::getPrezzo).sum();
        return totaleCoperto + sommaPrezzi;

    }

    public void stampaOrdine() {
        System.out.println("Numero ordine: " + numeroOrdine);
        System.out.println("Tavolo: " + tavolo.getNumeroTavolo());
        System.out.println("Stato ordine: " + statoOrdine);
        System.out.println("Numero coperti: " + numeroCoperti);
        System.out.println("Ora aquisizione ordine: " + oraAquisizioneOrdine);

        System.out.println("Elementi ordine: ");
        for (ElementoMenu e : elementiOrdine) {
            System.out.println(e);

        }

        System.out.println("Costo coperto: " + costoCopeto);
        System.out.println("Calcolo costo coperto: " + calcolaCostoCoperto());

    }
}
