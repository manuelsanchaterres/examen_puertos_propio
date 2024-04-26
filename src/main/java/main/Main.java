package main;

import domain.barcos.Amarre;
import domain.barcos.Comercial;
import domain.barcos.Pantalan;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Comercial barcoComercial = new Comercial();
        Pantalan pantalan = new Pantalan(new ArrayList<Amarre>(), "Recreo");
        //barcoComercial.encajaTipo(pantalan);
        System.out.println(barcoComercial.encajaTipo(pantalan));
    }
}
