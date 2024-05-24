package org.uniquindio.domain;

public class Pedido extends Domiciliario {

    private boolean estado;
    private String direccion;

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;


    }

    public boolean verificarEnvio () {

        if (estado) {
            System.out.println("el pedido ya esta realizado");
            return estado;
        }

        System.out.println("el pedido esta pendiente");
        return false;
    }
}
