package oop2.tp3.ejercicio3;

public class Gasto {

    TipoDeGasto tipoGasto;
    int monto;

    public Gasto(TipoDeGasto tipoGasto, int monto) {
        this.tipoGasto = tipoGasto;
        this.monto = monto;

    }

    public int calculoComida() {
        return tipoGasto.calculoComida(monto);
    }

    public String nombreGasto() {
        return tipoGasto.nombre();
    }

    public int gastoDelServicio() {
        return tipoGasto.calculoCosto(monto);
    }

    public String exceso() {
        return tipoGasto.exceso(monto);
    }
}
