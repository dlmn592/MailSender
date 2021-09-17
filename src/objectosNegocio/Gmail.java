
package objectosNegocio;

import interfaces.Servicio;

public class Gmail implements Servicio{

    @Override
    public String getDescripcion() {
        return "@gmail.com";
    }
    
}
