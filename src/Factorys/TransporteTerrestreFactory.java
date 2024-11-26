package Factorys;

import Interfaces.ITransporte;
import models.TransporteTerrestre;

public class TransporteTerrestreFactory extends TransporteFactory {
    @Override
    public ITransporte criarTransporte() {
        return new TransporteTerrestre();
    }
}