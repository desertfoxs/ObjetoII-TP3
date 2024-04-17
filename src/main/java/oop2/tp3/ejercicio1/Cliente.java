package oop2.tp3.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private List<Alquiler> alquileres = new ArrayList<Alquiler>();
    private String name;

    public Cliente(String nombre) {
        this.name = nombre;
    }

    public double calcularDeuda(){
        double total = 0;

        for (Alquiler alquiler : alquileres) {
            double monto = 0;
            monto = alquiler.getMonto(monto);
            total += monto;
        }
        return total;
    }

    public int calcularPuntosObtenidos(){
        int puntosAlquilerFrecuente = 0;

        for (Alquiler alquiler : alquileres) {
            // sumo puntos por alquiler
            puntosAlquilerFrecuente++;
            // bonus por dos días de alquiler de un nuevo lanzamiento
            puntosAlquilerFrecuente += alquiler.getPuntosAlquilerFrecuente(puntosAlquilerFrecuente);
        }
        return puntosAlquilerFrecuente;
    }

    public void alquilar(Alquiler rental) {
        alquileres.add(rental);
    }

}