package Factorys;

import Interfaces.ITransporte;
import models.TransporteMaritimo;

public class TransporteMaritimoFactory extends TransporteFactory {
    @Override
    public ITransporte criarTransporte() {
        return new TransporteMaritimo();
    }
}