package org.uniquindio.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import org.uniquindio.domain.Producto;

public class AdminController {


    @FXML
    private TableView<Producto> tblProd;

    @FXML
    private TextField txtCodProd;

    @FXML
    private TextField txtMarcaProd;

    @FXML
    private TextField txtNomProd;

    @FXML
    private TextField txtPrecioProd;

    @FXML
    void actualizarProducto(ActionEvent event) {
        System.out.println("actualizarProducto");
    }

    @FXML
    void crearProducto(ActionEvent event) {
        System.out.println(" crear producto" );
    }

    @FXML
    void eliminarProducto(ActionEvent event) {
        System.out.println("eliminarProducto");
    }

    @FXML
    void initialize() {


    }
}
