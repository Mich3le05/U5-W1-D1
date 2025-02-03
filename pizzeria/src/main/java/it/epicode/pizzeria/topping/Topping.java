package it.epicode.pizzeria.topping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Topping {

    private String name;
    private int calorie;
    private double price;

}
