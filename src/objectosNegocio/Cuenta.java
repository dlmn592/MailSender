package objectosNegocio;

import interfaces.Servicio;

public class Cuenta {

    private String nombreCuenta;
    private String direccionCorreo;
    private Servicio servicio;

    public Cuenta() {
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public String getDireccionCorreo() {
        return direccionCorreo;
    }

    public void setDireccionCorreo(String direccionCorreo) {
        this.direccionCorreo = direccionCorreo;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nombreCuenta=" + nombreCuenta + ", direccionCorreo=" + direccionCorreo + ", servicio=" + servicio + '}';
    }

}
