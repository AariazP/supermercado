package org.uniquindio.domain;

public class Cajero implements Persona{

    private String nombre;
    private String identificacion;

    @Override
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
}
