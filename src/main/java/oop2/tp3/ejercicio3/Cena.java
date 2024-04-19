package oop2.tp3.ejercicio3;

public class Cena implements TipoDeGasto {

    String nombre;

    public Cena(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int calculoComida(int monto) {
        return monto;
    }


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
