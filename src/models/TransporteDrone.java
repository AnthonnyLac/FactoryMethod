package models;

import Interfaces.ITransporte;

public class TransporteDrone implements ITransporte {
    @Override
    public void realizarEntrega(Encomenda encomenda) {
        if (encomenda.isMetropolitana() && encomenda.getPeso() <= 2) {
            System.out.println("Entrega por drone realizada. Pacote pequeno e dentro da área metropolitana.");
        } else {
            System.out.println("Entrega por drone não disponível. Verifique o peso ou a área de entrega.");
        }
    }
}