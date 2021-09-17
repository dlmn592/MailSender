
package objectosNegocio;

import interfaces.Protocolo;


public class SMTP implements Protocolo{
    @Override
    public String getDescripcion() {
        return "SMTP: <Protocolo-TPC,Puerto-25>";
    }
}
