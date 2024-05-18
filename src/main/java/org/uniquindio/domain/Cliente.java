package org.uniquindio.domain;

public class Cliente implements Persona{
    private String nombre;
    private String identificacion;
    private String direccion;

    @Override
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
}
