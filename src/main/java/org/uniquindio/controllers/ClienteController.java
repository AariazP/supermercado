package org.uniquindio.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.uniquindio.domain.Domiciliario;
import org.uniquindio.domain.Gangazo;
import org.uniquindio.domain.Pedido;
import org.uniquindio.domain.Producto;

import java.awt.event.ActionEvent;

public class ClienteController {

    @FXML
    private TableColumn<Producto, Integer> colCantidad;

    @FXML
    private TableColumn<Producto, String> colCodigo;

    @FXML
    private TableColumn<Producto, String> colNombre;

    @FXML
    private TableColumn<Producto, Double> colPrecio;

    @FXML
    private TableColumn<Producto, Double> colPrecioCarrito;

    @FXML
    private TableColumn<Producto, String> colProducto;

    @FXML
    private TableView<Producto> tblCarrito;

    @FXML
    private TableView<Producto> tblProd;

    @FXML
    void addCarrito(ActionEvent event) {

    }

    @FXML
    void cargarInfo(MouseEvent event) {
        System.out.println("cargarInfo");
    }

    @FXML
    void comprar(ActionEvent event) {
        System.out.println("comprar");
    }
}
