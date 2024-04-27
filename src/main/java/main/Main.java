package main;

import domain.barcos.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Barco.cargarBarcosEntrantes();
        for (Barco barco: Puerto.barcosEntrantes) {

            System.out.println(barco);
        }
        ;
    }
}
