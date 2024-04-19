package oop2.tp3.ejercicio1;

public class LibroNuevo implements Libro {

    private String nombre;
    private int requisitoDiaAlquilado = 1;

    public LibroNuevo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double calcularCosto(double monto, int diasAlquilado) {
        monto += diasAlquilado * 3;
        return monto;
    }

    @Override
    public int calcularPuntos(int diasAlquilados)
    {
        if(diasAlquilados > requisitoDiaAlquilado){
            return 1;
        }

        return 0;

    }
}
