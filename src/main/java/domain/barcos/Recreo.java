package domain.barcos;

public class Recreo extends Barco{

    public String permiso;

    @Override
    public String toString() {
        return "Recreo{" +
                "permiso='" + permiso + '\'' +
                ", matricula='" + matricula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tamaño=" + tamaño +
                '}';
    }

    public Recreo (String matricula, String nombre, float tamaño, String permiso) {

        super(matricula, nombre, tamaño);
        this.permiso = permiso;
    }
}
