package models;

import Interfaces.ITransporte;

public class TransporteAereo implements ITransporte {
    @Override
    public void realizarEntrega(Encomenda encomenda) {
        if (encomenda.getPeso() <= 20 && encomenda.getDimensao() <= 200) {
            System.out.println("Realizando entrega aérea. Peso e dimensões dentro dos limites.");
        } else {
            System.out.println("Entrega aérea não disponível. Peso ou dimensões excedem os limites.");
        }
    }
}