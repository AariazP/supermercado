package org.uniquindio.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.uniquindio.application.Main;
import org.uniquindio.domain.Gangazo;
import org.uniquindio.utils.Paths;

import java.io.IOException;

public class IniciarSesionController {

    @FXML
    private TextField txtIdentificacion;


    @FXML
    void iniciarSesion(ActionEvent event) throws IOException {

        String identificacion = txtIdentificacion.getText();
        String rol = Gangazo.iniciarSesion(identificacion);

        switch (rol) {
            case "CLIENTE" -> Main.actualizarVista(Paths.VISTA_CLIENTE);
            case "ADMINISTRADOR" -> Main.actualizarVista(Paths.VISTA_ADMIN);
            case "CAJERO" -> Main.actualizarVista(Paths.VISTA_CAJERO);
            case "DOMICILIARIO" -> Main.actualizarVista(Paths.VISTA_DOMICILIARIO);
            default -> System.out.println("No se encontro con esa identificacion");
        }
    }


    @FXML
    void initialize() {

    }
}
