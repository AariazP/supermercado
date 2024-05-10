package org.uniquindio.domain;

import java.util.ArrayList;

public class Gangazo {


    private Administrador administrador;
    private Cajero cajero;
    private static Gangazo gangazo;
    private ArrayList<Producto> listaProductos;
    private ArrayList<Cliente> listaClientes;

    private Gangazo(){

        iniciarTienda();
    }

    private void iniciarTienda() {
        administrador = new Administrador();
        listaClientes = new ArrayList<>();
        listaProductos = new ArrayList<>();
        cajero = new Cajero();

        iniciarProductos();
        administrador.setIdentificacion("12345");
    }

    private void iniciarProductos() {

        Producto p1 = new Producto();
        Producto p2 = new Producto();
        Producto p3 = new Producto();

        p1.setNombre("Frijoles");
        p1.setPrecio(5000.0);
        p1.setMarca("Diana");
        p1.setCodigo("1");


        p2.setNombre("Arroz");
        p2.setPrecio(4000.0);
        p2.setMarca("Roa");
        p2.setCodigo("2");

        p3.setNombre("Frijoles");
        p3.setPrecio(5000.0);
        p3.setMarca("Diana");
        p3.setCodigo("3");

        listaProductos.add(p1);
        listaProductos.add(p2);
        listaProductos.add(p3);
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

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void eliminarProducto(Producto productoSeleccionado) {
        listaProductos.remove(productoSeleccionado);
    }

    public void actualizarProducto(Producto productoSeleccionado, Double precio, String nombre, String marca) {
        String codigo = productoSeleccionado.getCodigo();


        for(Producto p : listaProductos){
            if (p.getCodigo().equals(codigo)){
                p.setPrecio(precio);
                p.setNombre(nombre);
                p.setMarca(marca);
            }
        }

    }
}
