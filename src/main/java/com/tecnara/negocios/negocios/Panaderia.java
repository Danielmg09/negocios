package com.tecnara.negocios.negocios;

public class Panaderia extends Negocio {

    public Panaderia(String nombre, float facturacion, int numeroEmpleados) {
        super(nombre, facturacion, numeroEmpleados);
    }

    public String hornearPan(){
        return"Estamos horneando pan";
    }


}
