package oop2.tp3.ejercicio3;

import java.time.LocalDate;
import java.util.List;

public class ReporteDeGastos {

    int total;
    int gastosDeComida;

    public ReporteDeGastos() {
    }

    public String imprimir(List<Gasto> gastos) {
        total = 0;
        gastosDeComida = 0;
        String ticket;

        ticket = "Expenses " + LocalDate.now() + "\n";

        for (Gasto gasto : gastos) {

            gastosDeComida += gasto.calculoComida();
            String nombreGasto = gasto.nombreGasto();;
            String marcaExcesoComidas = gasto.exceso();

            ticket += nombreGasto + "\t" + gasto.gastoDelServicio() + "\t" + marcaExcesoComidas + "\n";

            total += gasto.gastoDelServicio();
        }

        ticket += "Gastos de comida: " + gastosDeComida + "\n";
        ticket += "Total de gastos: " + total;

        System.out.println(ticket);
        return ticket;
    }
}
