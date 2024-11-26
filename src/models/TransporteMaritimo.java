package models;

import Interfaces.ITransporte;

public class TransporteMaritimo implements ITransporte {
    @Override
    public void realizarEntrega(Encomenda encomenda) {
        if (encomenda.isInternacional()) {
            System.out.println("Realizando entrega marítima para destino internacional.");
        } else {
            System.out.println("Entrega marítima disponível apenas para destinos internacionais.");
        }
    }
}
