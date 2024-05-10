package org.uniquindio.domain;

public class Gangazo {


    private Cajero administrador;
    private static Gangazo gangazo;

    private Gangazo(){
        administrador = new Cajero();
        administrador.setIdentificacion("12345");
    }


    public static Gangazo getInstance(){

        if(gangazo == null){
            gangazo = new Gangazo();
        }
        return gangazo;
    }

    public static void iniciarSesion(String identificacion, String rol) {

        getInstance().login(identificacion, rol);
    }

    public void login(String identificacion, String rol) {
        
        if(administrador.getIdentificacion().equals(identificacion)){
            System.out.println("Iniciando sesion como admin");
        }
        
    }
}
