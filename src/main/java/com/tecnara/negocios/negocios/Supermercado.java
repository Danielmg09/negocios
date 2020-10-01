package com.tecnara.negocios.negocios;

public class Supermercado extends Negocio {

    public Supermercado(String nombre, float facturacion, int numeroEmpleados) {
        super(nombre, facturacion, numeroEmpleados);
    }

    public void reponerEstantes(){
        System.out.println("Reponer estantes");
    }

    public String hornearPan(){
        return"Estamos horneando pan";
    }

    public String hacerPropaganda(){
        return  "Venga a visitar " + nombre + ", es un estupendo negocio";
    }
}
