package oop2.tp3.ejercicio1;

public class CopiaLibro {
    private Libro libro;
    public CopiaLibro(Libro libro) {
        this.libro = libro;
    }

    public double calculoCosto(double monto, int diasAlquilado) {
        return libro.calcularCosto(monto, diasAlquilado);
    }

    public int calculoPuntos(int diasAlquilados) {
        return libro.calcularPuntos(diasAlquilados);
    }
}