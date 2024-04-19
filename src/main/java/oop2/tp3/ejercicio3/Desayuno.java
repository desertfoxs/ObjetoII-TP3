package oop2.tp3.ejercicio3;

public class Desayuno implements TipoDeGasto {

    String nombre;

    public Desayuno(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int calculoComida(int monto) {
        return monto;
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
        if(monto > 1000){
            return "X";
        }
        else{
            return " ";
        }
    }
}
