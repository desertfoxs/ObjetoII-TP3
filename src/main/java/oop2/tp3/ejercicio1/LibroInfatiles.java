package oop2.tp3.ejercicio1;

public class LibroInfatiles implements Libro{

    private String nombre;

    public LibroInfatiles(String nombre) {
        this.nombre = nombre;
    }

    public boolean esNuevo() {
        return true;
    }

    @Override
    public double calcularCosto(double monto, int diasAlquilado) {
        monto += 1.5;
        if (diasAlquilado > 3) {
            monto += (diasAlquilado - 3) * 1.5;
        }
        return monto;
    }
}
