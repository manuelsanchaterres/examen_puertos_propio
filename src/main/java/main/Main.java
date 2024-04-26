package main;

import domain.barcos.Amarre;
import domain.barcos.Comercial;
import domain.barcos.Pantalan;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Comercial barcoComercial = new Comercial(30);
        Amarre amarre = new Amarre(25f);
        System.out.println(barcoComercial.tamaño);
        System.out.println(amarre.tamaño);
        System.out.println(barcoComercial.encajaTamaño(amarre));

    }
}
