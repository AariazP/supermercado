package org.uniquindio.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.uniquindio.domain.Gangazo;
import org.uniquindio.domain.Pedido;
import org.uniquindio.domain.Producto;

import java.awt.event.ActionEvent;

public class ClienteController {

    @FXML
    private TableView<Producto> tblProd;

    @FXML
    private TableView<Producto> tblProd1;


    @FXML
    private TextField txtMarcaProd;

    @FXML
    private TextField txtNomProd;

    @FXML
    private TextField txtPrecioProd;

    @FXML
    private TableColumn<Producto, String> colCodigo;

    @FXML
    private TableColumn<Producto, String> colNombre;

    @FXML
    private TableColumn<Producto, Double> colPrecio;


@FXML
    void agregarAlCarrito(ActionEvent event){

    Producto producto = new Producto();
    tblProd1.getItems().add(producto);

    limpiarTabla();
}

@FXML
    private void limpiarTabla() {
        this.txtPrecioProd.setText("");
        this.txtNomProd.setText("");
        this.txtMarcaProd.setText("");
    }


}
