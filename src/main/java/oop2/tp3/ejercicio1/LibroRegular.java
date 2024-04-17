package oop2.tp3.ejercicio1;

public class LibroRegular implements Libro{

    private String nombre;

    public LibroRegular(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double calcularCosto(double monto, int diasAlquilado) {
        monto += 2;
        if (diasAlquilado > 2) {
            monto += (diasAlquilado - 2) * 1.5;
        }
        return monto;
    }
}
