package orijin;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Objects;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent parent;

    public void switch2MainMenu(javafx.event.ActionEvent event) throws IOException {
        parent = FXMLLoader.load((Objects.requireNonNull(getClass().getResource("main.fxml"))));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void switch2Reservation(javafx.event.ActionEvent event) throws IOException {
        parent = FXMLLoader.load(((Objects.requireNonNull(getClass().getResource("reservation.fxml")))));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }

}
