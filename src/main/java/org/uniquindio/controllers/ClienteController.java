package org.uniquindio.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import org.uniquindio.application.Main;
import org.uniquindio.domain.*;
import org.uniquindio.utils.Paths;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class ClienteController {

    @FXML
    private TableColumn<Producto, String> colCodigo;

    @FXML
    private TableColumn<Producto, String> colNombre;

    @FXML
    private TableColumn<Producto, Double> colPrecio;

    @FXML
    private TableView<Producto> tblProd;

    @FXML
    private TableColumn<ProdCarrito, Double> colPrecioCarrito;

    @FXML
    private TableColumn<ProdCarrito, String> colProdCarrito;

    @FXML
    private TableColumn<ProdCarrito, Integer> colaCantidadCarrito;

    @FXML
    private TableView<ProdCarrito> tblCarrito;

    @FXML
    private TextField txtCantidad;

    @FXML
    private ComboBox<String> cmbMetodoPago;

    @FXML
    void cargarInfo(MouseEvent event) {

    }

    @FXML
    void addCarrito(MouseEvent event) {

        Producto productoSeleccionado = tblProd.getSelectionModel().getSelectedItem();
        int cantidad = Integer.parseInt(txtCantidad.getText());
        ProdCarrito prodCarrito = new ProdCarrito(productoSeleccionado.getNombre(), cantidad, productoSeleccionado.getPrecio(), productoSeleccionado.getCodigo());
        tblCarrito.getItems().add(prodCarrito);

    }

    @FXML
    void comprar(MouseEvent event) {


        String idCliente = Main.getUsuarioActual();
        String metodoPago = cmbMetodoPago.getValue();

        Gangazo.getInstance().comprar(idCliente, tblCarrito.getItems(), metodoPago);

        Main.mostrarMensaje("Compra realizada con éxito");




    }


    @FXML
    void cancelarCompra(MouseEvent event) {
        tblCarrito.getItems().clear();
    }

    @FXML
    void irLogin(MouseEvent event) throws IOException {
        Main.actualizarVista(Paths.INICIAR_SESION);
    }

    @FXML
    void initialize() {
        this.colCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        this.colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        this.colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));


        this.colaCantidadCarrito.setCellValueFactory(new PropertyValueFactory<>("cantidad"));
        this.colPrecioCarrito.setCellValueFactory(new PropertyValueFactory<>("precio"));
        this.colProdCarrito.setCellValueFactory(new PropertyValueFactory<>("producto"));


        this.tblProd.getItems().addAll(Gangazo.getInstance().getProductos());

        this.cmbMetodoPago.getItems().addAll("Efectivo", "Tarjeta de crédito", "Tarjeta gangazo");
    }

}
