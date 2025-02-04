package it.epicode.pizzeria.runner;

import it.epicode.pizzeria.ordine.ElementoOrdine;
import it.epicode.pizzeria.ordine.Ordine;
import it.epicode.pizzeria.ordine.OrdineConfig;
import it.epicode.pizzeria.tavolo.Tavolo;

import lombok.RequiredArgsConstructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;

@RequiredArgsConstructor
@Component
public class ApplicationRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(ApplicationRunner.class);

    private final OrdineConfig ordineConfig;

    @Override
    public void run(String... args) throws Exception {
        // Creazione menu
        ElementoOrdine pizza = new ElementoOrdine("Margherita", 8.50);
        ElementoOrdine bibita = new ElementoOrdine("Coca-Cola", 3.00);

        Tavolo tavolo1 = new Tavolo(1, 4, false);

        // Creazione ordine
        Ordine ordine1 = new Ordine(1, Arrays.asList(pizza, bibita), tavolo1, LocalDateTime.now());

        // Stampa ordine
        logger.info("Ordine creato: {}", ordine1);
    }
}
