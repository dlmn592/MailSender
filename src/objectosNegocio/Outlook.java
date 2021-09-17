
package objectosNegocio;

import interfaces.Servicio;


public class Outlook implements Servicio{
    
    @Override
    public String getDescripcion() {
        return "@outlook.com";
    }
    
}
