package oop2.tp3.ejercicio3;

import java.time.LocalDate;
import java.util.List;

public class ReporteDeGastos {

    int total;
    int gastosDeComida;

    public ReporteDeGastos() {
    }

    public int imprimir(List<Gasto> gastos) {
        total = 0;
        gastosDeComida = 0;

        for (Gasto gasto : gastos) {

            gastosDeComida += gasto.calculoComida();
            String nombreGasto = gasto.nombreGasto();;
            String marcaExcesoComidas = gasto.exceso();

            System.out.println(nombreGasto + "\t" + gasto.gastoDelServicio() + "\t" + marcaExcesoComidas);

            total += gasto.gastoDelServicio();
        }

        System.out.println("Gastos de comida: " + gastosDeComida);
        System.out.println("Total de gastos: " + total);
        return total;
    }
}
