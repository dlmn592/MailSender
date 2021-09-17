
package test;

import interfaces.Servicio;
import objectosNegocio.Gmail;
import objectosNegocio.Outlook;
import objectosNegocio.Yahoo;


public class Test {
    public static void main(String[] args) {
        Servicio a = new Gmail();
        System.out.println(a.getDescripcion());
        
        a = new Outlook();
        System.out.println(a.getDescripcion());
        
        a = new Yahoo();
        System.out.println(a.getDescripcion());
    }
}
