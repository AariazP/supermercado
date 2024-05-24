package org.uniquindio.domain;

import org.uniquindio.domain.interfaces.Persona;

import java.util.ArrayList;

public class Domiciliario implements Persona {
    private String nombre;
    private String identificacion;
    private ArrayList<Pedido> listaPedidos;

    @Override
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }


    private void iniciarPedidos() {

        Pedido pe1 = new Pedido();
        Pedido pe2 = new Pedido();
        Pedido pe3 = new Pedido();

        pe1.setDireccion("calle 20 #14");
        pe1.setEstado(false);

        pe2.setDireccion("calle 17 #24");
        pe2.setEstado(false);

        pe3.setDireccion("calle 40 #5");
        pe3.setEstado(true);

        listaPedidos.add(pe1);
        listaPedidos.add(pe2);
        listaPedidos.add(pe3);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }
}
