package models;

import Interfaces.ITransporte;

public class TransporteTerrestre implements ITransporte {
    @Override
    public void realizarEntrega(Encomenda encomenda) {
        System.out.println("Realizando entrega terrestre. Transportadora local selecionada.");
    }
}