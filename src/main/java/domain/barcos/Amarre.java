package domain.barcos;

//Clase Amarre (0,5 Puntos)
//Atributos: id (unico y autoincrementado), float tamaño, boolean ocupado, Barco barco

public class Amarre {

    // DEBE SER STATIC PARA INCREMENTARLO CADA VEZ QUE SE CREE UNA NUEVA INSTANCIA DE AMARRE

    public static int id = 0;
    public float tamaño;
    public boolean ocupado;
    public Barco barco;

    @Override
    public String toString() {
        return "Amarre{" +
                "id=" + id +
                ", tamaño=" + tamaño +
                ", ocupado=" + ocupado +
                ", barco=" + barco +
                '}';
    }

    public Amarre(float tamaño, boolean ocupado, Barco barco) {
        id++;
        this.tamaño = tamaño;
        this.ocupado = ocupado;
        this.barco = barco;
    }
}
