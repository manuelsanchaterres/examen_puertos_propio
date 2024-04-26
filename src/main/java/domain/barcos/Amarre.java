package domain.barcos;

//Clase Amarre (0,5 Puntos)
//Atributos: id (unico y autoincrementado), float tamaño, boolean ocupado, Barco barco

public class Amarre {

    // DEBE SER STATIC PARA INCREMENTARLO CADA VEZ QUE SE CREE UNA NUEVA INSTANCIA DE AMARRE

    public static int id = 0;
    public float tamaño;
    private boolean ocupado;
    private Barco barco;

    public Amarre (float tamaño) {
        this.tamaño = tamaño;
    }
}
