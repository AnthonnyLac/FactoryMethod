package Service;

import Factorys.*;
import Interfaces.ITransporte;
import models.Encomenda;

public class TransporteService {

    public void selecionarETerirTransporte(Encomenda encomenda) {
        // Seleção do tipo de transporte baseado nas características da encomenda
        TransporteFactory transporteFactory;

        if (encomenda.isInternacional()) {
            transporteFactory = new TransporteMaritimoFactory();
        } else if (encomenda.getPeso() <= 2 && encomenda.isMetropolitana()) {
            transporteFactory = new TransporteDroneFactory();
        } else if (encomenda.getPeso() <= 20 && encomenda.getDimensao() <= 10) {
            transporteFactory = new TransporteAereoFactory();
        } else {
            transporteFactory = new TransporteTerrestreFactory();
        }

        // Criando o transporte selecionado
        ITransporte transporte = transporteFactory.criarTransporte();
        transporte.realizarEntrega(encomenda);
    }
}