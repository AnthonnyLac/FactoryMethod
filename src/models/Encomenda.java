package models;

public class Encomenda {
    private double peso;
    private double dimensao;
    private boolean internacional;
    private boolean metropolitana;

    // Construtores, getters e setters
    public Encomenda(double peso, double dimensao, boolean internacional, boolean metropolitana) {
        this.peso = peso;
        this.dimensao = dimensao;
        this.internacional = internacional;
        this.metropolitana = metropolitana;
    }

    public double getPeso() {
        return peso;
    }

    public double getDimensao() {
        return dimensao;
    }

    public boolean isInternacional() {
        return internacional;
    }

    //transportadora local.
    public boolean isMetropolitana() {
        return metropolitana;
    }
}
