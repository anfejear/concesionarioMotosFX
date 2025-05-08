package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ConcesionarioController {

    @FXML
    private TableColumn<?, ?> columnCantidadD;

    @FXML
    private TableColumn<?, ?> columnColorE;

    @FXML
    private TableColumn<?, ?> columnMarcaD;

    @FXML
    private TableColumn<?, ?> columnMarcaE;

    @FXML
    private TableColumn<?, ?> columnModeloD;

    @FXML
    private TableColumn<?, ?> columnModeloE;

    @FXML
    private TableView<?> tableMotosDisponibles;

    @FXML
    private TableView<?> tableMotosNoDisponibles;
    


    @FXML
    void noDisponible(ActionEvent event) {

    }

    @FXML
    void disponible(ActionEvent event) {

    }

}
