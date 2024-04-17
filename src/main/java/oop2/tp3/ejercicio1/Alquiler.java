package oop2.tp3.ejercicio1;

public class Alquiler {
    private CopiaLibro copia;
    private int diasAlquilados;

    public Alquiler(CopiaLibro copia, int diasAlquilados) {
        this.copia = copia;
        this.diasAlquilados = diasAlquilados;
    }

    public double getMonto(double monto) {
        // determine amounts for each line

        return copia.calculoCosto(monto, diasAlquilados);
    }

    public int getPuntosAlquilerFrecuente(int puntosAlquilerFrecuente) {
        return copia.calculoPuntos(diasAlquilados);


    }


}
