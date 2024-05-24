package org.uniquindio.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.uniquindio.domain.Domiciliario;
import org.uniquindio.domain.Gangazo;
import org.uniquindio.domain.Pedido;
import org.uniquindio.domain.Producto;

public class DomiciliarioController {

    @FXML
    private TableColumn<?, ?> colDireccion;

    @FXML
    private TableColumn<?, ?> colEstado;

    @FXML
    private TableColumn<?, ?> colPedidos;

    @FXML
    private TableView<?> tblPedidos;


    @FXML
    void entregar(ActionEvent event) {

        Pedido pedidoSeleccionado = (Pedido) tblPedidos.getSelectionModel().getSelectedItem();

        Gangazo.getInstance().eliminarPedido(pedidoSeleccionado);
    }


}
