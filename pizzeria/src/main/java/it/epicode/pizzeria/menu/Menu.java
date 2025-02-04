package it.epicode.pizzeria.menu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Menu {

    private String nome;
    List<ElementoMenu> elementiMenu = new ArrayList<>();

}
