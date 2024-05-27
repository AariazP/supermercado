package org.uniquindio.domain;

import org.uniquindio.domain.interfaces.MetodoPago;

public class Efectivo implements MetodoPago {


    private double total;

    @Override
    public double aceptar(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
