package com.tecnara.negocios.negocios;

public class Negocio {
    String nombre;
    float facturacion;
    int numeroEmpleados;

    public Negocio(String nombre, float facturacion, int numeroEmpleados) {
        this.nombre = nombre;
        this.facturacion = facturacion;
        this.numeroEmpleados = numeroEmpleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(float facturacion) {
        this.facturacion = facturacion;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public void abrir(){
        System.out.println("He abierto, soy " + nombre);
    }

    public float facturacionPorEmpleado(){
        return this.facturacion/this.numeroEmpleados;
    }
}
