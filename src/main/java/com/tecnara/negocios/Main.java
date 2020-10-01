package com.tecnara.negocios;

import com.tecnara.negocios.negocios.Negocio;
import com.tecnara.negocios.negocios.Panaderia;
import com.tecnara.negocios.negocios.Supermercado;
import com.tecnara.negocios.negocios.Taller;

public class Main {
    public static void main(String[] args) {

        Negocio panaderia = new Panaderia("Panishop",127000,6);
        Negocio taller = new Taller("Talleres Paco",325000,8);
        Negocio supermercado = new Supermercado("Mercadona",650000,25);

        panaderia.abrir();
        taller.abrir();
        supermercado.abrir();


    }
}
