package ejercicio1;

import oop2.tp3.ejercicio1.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PruebaTest {


    //1. En el primer ejercicio primero escriba test unitarios del calculo de pago y luego comience a
    //refactorizar.
    LibroRegular elTunel = new LibroRegular("El Túnel");
    LibroRegular antesDelFin = new LibroRegular("Antes del Fin");
    LibroNuevo juegosDeEnder = new LibroNuevo("juegos de ender");
    LibroInfatiles elLobo = new LibroInfatiles("el lobo");
    CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
    CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);
    CopiaLibro juegosDeEnderCopia = new CopiaLibro(juegosDeEnder);
    CopiaLibro elLoboCopia = new CopiaLibro(elLobo);

    Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
    Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
    Alquiler alquilerJuegosDeEnder = new Alquiler(juegosDeEnderCopia, 2);
    Alquiler alquilerElLobo = new Alquiler(elLoboCopia, 6);
    Cliente yo = new Cliente("Javier");


    @Test
    public void Testprueba(){
        yo.alquilar(alquilerElTunel);
        yo.alquilar(alquilerAntesDelFin);
        yo.alquilar(alquilerJuegosDeEnder);
        yo.alquilar(alquilerElLobo);


        assertEquals(22.0, yo.calcularDeuda());
        assertEquals(5, yo.calcularPuntosObtenidos());
    }

}
