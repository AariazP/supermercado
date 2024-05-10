package org.uniquindio.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.uniquindio.domain.Gangazo;
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
    private TableColumn<Producto, String> colCodigo;

    @FXML
    private TableColumn<Producto, String> colNombre;

    @FXML
    private TableColumn<Producto, Double> colPrecio;

    @FXML
    void actualizarProducto(ActionEvent event) {
        System.out.println("actualizarProducto");
    }

    @FXML
    void crearProducto(ActionEvent event) {


        Producto producto = new Producto();
        producto.setCodigo(txtCodProd.getText());
        producto.setMarca(txtMarcaProd.getText());
        producto.setNombre(txtNomProd.getText());
        producto.setPrecio(Double.parseDouble(txtPrecioProd.getText()));

        Gangazo.getInstance().agregarProducto(producto);

        tblProd.getItems().add(producto);
    }

    @FXML
    void eliminarProducto(ActionEvent event) {
        System.out.println("eliminarProducto");
    }

    @FXML
    void initialize() {

        this.colCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        this.colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));

    }



    public void refrescarTabla(){

    }
}
