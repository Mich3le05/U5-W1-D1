package it.epicode.pizzeria.runner;

import it.epicode.pizzeria.menu.Menu;
import it.epicode.pizzeria.ordine.Ordine;
import it.epicode.pizzeria.ordine.StatoOrdine;
import it.epicode.pizzeria.tavoli.Tavolo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ApplicationRunner implements CommandLineRunner {
    @Autowired
    private Menu menuPranzo;

    @Value("${costo.coperto}")
    private double costoCoperto;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(menuPranzo);

        Tavolo tavolo = new Tavolo();
        tavolo.setNumeroTavolo(1);

        Ordine ordine = new Ordine();
        ordine.setNumeroOrdine(1);
        ordine.setTavolo(tavolo);
        ordine.setStatoOrdine(StatoOrdine.IN_CORSO);
        ordine.setNumeroCoperti(2);
        ordine.setCostoCopeto(costoCoperto);
        ordine.setElementiOrdine(List.of(
                menuPranzo.getElementiMenu().get(0),
                menuPranzo.getElementiMenu().get(1),
                menuPranzo.getElementiMenu().get(2)));

        ordine.stampaOrdine();
    }


}
