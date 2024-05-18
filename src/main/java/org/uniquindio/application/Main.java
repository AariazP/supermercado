package org.uniquindio.application;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.uniquindio.utils.Paths;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    private static Stage view;
    public static Main main;

    public static void main(String[] args) {

        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        main = this;
        view = stage;
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(getClass().getResource(Paths.INICIAR_SESION)));
        Pane pane = loader.load();
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }


    public static void actualizarVista(String path) throws IOException {


        FXMLLoader loader = new FXMLLoader((Main.class.getResource(path)));
        Pane pane = loader.load();
        Scene scene = new Scene(pane);
        view.setScene(scene);
        view.show();

    }


    public static Main getMain(){
        return main;
    }

}