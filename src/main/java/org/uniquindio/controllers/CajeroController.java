package org.uniquindio.controllers;



import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import org.uniquindio.application.Main;
import org.uniquindio.domain.Producto;
import org.uniquindio.utils.Paths;

public class CajeroController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Producto> tblRegistro;

    @FXML
    private TableColumn<Producto, String> colRegMarca;

    @FXML
    private TableColumn<Producto, String> colRegNombre;

    @FXML
    private TableColumn<Producto, Double> colRegPrecio;

    @FXML
    private TextField txtCodigo;

    @FXML
    void registrarProducto(ActionEvent event) {


    }


    @FXML
    void irLogin(ActionEvent event) throws IOException {
        Main.actualizarVista(Paths.INICIAR_SESION);
    }
    @FXML
    void initialize() {

    }

}

