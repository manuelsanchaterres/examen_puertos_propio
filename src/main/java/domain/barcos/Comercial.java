package domain.barcos;

public class Comercial extends Barco{

    public String carga;

    @Override
    public String toString() {
        return "Comercial{" +
                "carga='" + carga + '\'' +
                ", matricula='" + matricula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tamaño=" + tamaño +
                '}';
    }

    public Comercial (String matricula, String nombre, float tamaño, String carga) {
        super(matricula, nombre, tamaño);
        this.carga = carga;
    }

}
