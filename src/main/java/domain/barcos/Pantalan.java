package domain.barcos;

//Clase Pantalan (0,5 Puntos)
//Atributos: id (unico y autoincrimentado), ArrayList(Amarre) listaAmarres, String tipo (Comercial o Recreo);

import java.util.ArrayList;

public class Pantalan {
    // DEBE SER STATIC PARA INCREMENTARLO CADA VEZ QUE SE CREE UNA NUEVA INSTANCIA DE PANTALAN
    public static int id = 0;
    public ArrayList<Amarre> listaAmarres = new ArrayList<>();
    public String tipo;


    @Override
    public String toString() {
        return "Pantalan{" +
                "id=" + id +
                ", listaAmarres=" + listaAmarres +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public Pantalan (String tipo, ArrayList<Amarre> listaAmarres)  {

        id++;
        this.tipo = tipo;
        this.listaAmarres = listaAmarres;
    }

}
