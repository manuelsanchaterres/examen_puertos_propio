package domain.barcos;

//Clase Pantalan (0,5 Puntos)
//Atributos: id (unico y autoincrimentado), ArrayList(Amarre) listaAmarres, String tipo (Comercial o Recreo);

import java.util.ArrayList;

public class Pantalan {
    // DEBE SER STATIC PARA INCREMENTARLO CADA VEZ QUE SE CREE UNA NUEVA INSTANCIA DE PANTALAN
    public static int id = 0;
    public ArrayList<Amarre> listaAmarres;
    public String tipo = "Comercial";

    public Pantalan (ArrayList<Amarre> listaAmarres, String tipo) {

        id++;
        this.listaAmarres = listaAmarres;
        this.tipo = tipo;

    }
}
