package main;

import domain.barcos.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Puerto puerto = new Puerto();
        Barco.cargarBarcosEntrantes(puerto.barcosEntrantes);
//        System.out.println(puerto.barcosEntrantes);
        Puerto.simular(puerto.listadoPantalanes);
//        Puerto.verAmarre(puerto.listadoPantalanes);
        Puerto.buscarAmarre(puerto.barcosEntrantes, puerto.listadoPantalanes);
    }
}
