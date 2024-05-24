package org.uniquindio.domain;

import org.uniquindio.domain.interfaces.MetodoPago;

import java.util.ArrayList;

public class Compra {

    private MetodoPago metodoPago;
    private double total;
    private ArrayList<Producto> productos;

    public Compra(MetodoPago metodoPago, double total, ArrayList<Producto> productos, Cliente cliente) {
        this.metodoPago = metodoPago;
        this.total = total;
        this.productos = productos;
    }


    public MetodoPago getMetodoPago() {
        return metodoPago;
    }


    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }


    public double getTotal() {
        return total;
    }


    public void setTotal(double total) {
        this.total = total;
    }


    public ArrayList<Producto> getProductos() {
        return productos;
    }


    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }




}
