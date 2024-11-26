package Factorys;

import Interfaces.ITransporte;
import models.TransporteDrone;

public class TransporteDroneFactory extends TransporteFactory {
    @Override
    public ITransporte criarTransporte() {
        return new TransporteDrone();
    }
}