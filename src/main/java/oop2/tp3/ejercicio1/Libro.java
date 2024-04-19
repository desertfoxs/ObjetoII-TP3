package oop2.tp3.ejercicio1;

public interface Libro {

    public double calcularCosto(double monto, int diasAlquilado);

    default public int calcularPuntos(int diasAlquilados)
    {
        return 0;
    }

}
