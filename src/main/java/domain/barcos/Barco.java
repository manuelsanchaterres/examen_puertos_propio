package domain.barcos;

import java.util.ArrayList;

abstract class Barco {

    public String matricula;
    public String nombre;
    public float tamaño;

    public Barco(String matricula, String nombre, float tamaño) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public Barco(float tamaño) {
        this.tamaño = tamaño;
    }

    public static String mayorTamaño(ArrayList<Barco> barcosEntrantes) {

        float mayorTamaño = 0;
        String matricula = "";
        // BÚSQUEDA DEL BARCO CON MAYOR TAMAÑO
        for (Barco barcosEntrante : barcosEntrantes) {

            if (barcosEntrante.tamaño > mayorTamaño) {

                mayorTamaño = barcosEntrante.tamaño;
            }
        }
// BUSCAMOS EL BARCO DE MAYOR TAMAÑO Y ACCEDEMOS A SU MATRÍCULA
        for (Barco barcosEntrante : barcosEntrantes) {

            if (barcosEntrante.tamaño == mayorTamaño) {

                matricula = barcosEntrante.matricula;
            }
        }
        return matricula;
    }

    public boolean encajaTipo (Pantalan pantalan) {
//        método encajaTipo (Pantalan pantalan). Devuelve true si el barco es del mismo tipo
//        que el pantalan, en otro caso devuelve false. (1 Punto)

        return this.getClass().getSimpleName().equals(pantalan.tipo);
    }

    public float encajaTamaño (Amarre amarre) {

//        método encajaTamaño(Amarre amarre). Devuelve un float igual a la diferencia de
//        tamaño entre el amarre y el barco. (1 Punto)

        return amarre.tamaño - this.tamaño;
    }
}
