package objectosNegocio;

import interfaces.Servicio;

public class Yahoo implements Servicio {

    @Override
    public String getDescripcion() {
        return "@yahoo.com";
    }

}
