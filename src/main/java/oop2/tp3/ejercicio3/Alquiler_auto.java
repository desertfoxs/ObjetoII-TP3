package oop2.tp3.ejercicio3;

public class Alquiler_auto implements TipoDeGasto{

    String nombre;

    public Alquiler_auto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int calculoComida(int monto) {
        return 0;
    }

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public int calculoCosto(int monto) {
        return monto;
    }

    @Override
    public String exceso(int monto) {
        return "";
    }
}
