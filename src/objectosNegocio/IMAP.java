package objectosNegocio;

import interfaces.Protocolo;

public class IMAP implements Protocolo {

    @Override
    public String getDescripcion() {
        return "IMAP: <Protocolo-TPC,Puerto-143>";
    }
}
