package org.uniquindio.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.uniquindio.domain.Gangazo;

public class IniciarSesionController {

    @FXML
    private TextField txtIdentificacion;

    @FXML
    private ComboBox<String> cmbRol;

    @FXML
    void iniciarSesion(ActionEvent event) {

        String identificacion = txtIdentificacion.getText();
        String rol = cmbRol.getValue();
        Gangazo.iniciarSesion( identificacion, rol);
    }


    @FXML
    void initialize() {
        cmbRol.getItems().addAll("Administrador", "Cliente","Cajero","Domiciliario");

    }
}
