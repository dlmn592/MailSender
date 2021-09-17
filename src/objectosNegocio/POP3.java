
package objectosNegocio;

import interfaces.Protocolo;


public class POP3 implements Protocolo{

    @Override
    public String getDescripcion() {
        return "POP3: <Protocolo-TPC,Puerto-110>";
    }
    
}
