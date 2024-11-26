package Factorys;

import Interfaces.ITransporte;
import models.TransporteAereo;

public class TransporteAereoFactory extends TransporteFactory {
    @Override
    public ITransporte criarTransporte() {
        return new TransporteAereo();
    }
}
