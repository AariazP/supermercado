package org.uniquindio.domain;

import java.util.ArrayList;

public class Gangazo {


    private Administrador administrador;
    private Cajero cajero;
    private static Gangazo gangazo;
    private ArrayList<Producto> listaProductos;
    private ArrayList<Cliente> listaClientes;

    private Gangazo(){
        administrador = new Administrador();
        listaClientes = new ArrayList<>();
        listaProductos = new ArrayList<>();
        cajero = new Cajero();
        administrador.setIdentificacion("12345");
    }


    public static Gangazo getInstance(){

        if(gangazo == null){
            gangazo = new Gangazo();
        }
        return gangazo;
    }

    public static String iniciarSesion(String identificacion) {

        return getInstance().login(identificacion);
    }

    public String login(String identificacion) {
        
        if(administrador.getIdentificacion().equals(identificacion) ){
            return  "ADMINISTRADOR";
        }

        if(cajero.getIdentificacion().equals(identificacion)){
            return  "CAJERO";
        }

        for(Cliente cliente : listaClientes){
            if(cliente.getIdentificacion().equals(identificacion)){
                return  "CLIENTE";
            }
        }
        return null;
    }
}
