package ejercicio3;

import oop2.tp3.ejercicio3.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testprueba {

    List<Gasto> pedido;

    @Test
    public void test(){

        Desayuno desayuno = new Desayuno("desayuno");
        Cena cena = new Cena("cena");
        AlquilerAuto alquilerAuto = new AlquilerAuto("alquiler de auto");

        Gasto gasto1 = new Gasto(desayuno, 1500);
        Gasto gasto2 = new Gasto(cena, 3000);
        Gasto gasto3 = new Gasto(alquilerAuto, 500);

        List<Gasto> pedido = new ArrayList<>();
        pedido.add(gasto1);
        pedido.add(gasto2);
        pedido.add(gasto3);

        ReporteDeGastos reporte = new ReporteDeGastos();
        assertEquals(reporte.imprimir(pedido), "Expenses 2024-04-19\n" +
                "desayuno\t1500\tX\n" +
                "cena\t3000\tX\n" +
                "alquiler de auto\t500\t\n" +
                "Gastos de comida: 4500\n" +
                "Total de gastos: 5000"

        );
    }

}
