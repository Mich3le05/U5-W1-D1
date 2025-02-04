package it.epicode.pizzeria.ordine;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration

public class OrdineConfig {

    @Value("${costo.coperto}")
    private double costoCoperto;

    public double getCostoCoperto() {
        return costoCoperto;
    }

}