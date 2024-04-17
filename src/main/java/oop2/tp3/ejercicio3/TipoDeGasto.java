package oop2.tp3.ejercicio3;

public interface TipoDeGasto {
    
    int calculoComida(int monto);
    String nombre();
    int calculoCosto(int monto);

    String exceso(int monto);
}
