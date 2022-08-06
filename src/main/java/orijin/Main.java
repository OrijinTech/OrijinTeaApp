//Author: Yongxiang Jin

package orijin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import orijin.SeatBooking;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        Parent root = null;
        try {
            // make sure the .fxml file is in the directory with the same name as the package orjin --> orijin
            root = FXMLLoader.load((Objects.requireNonNull(getClass().getResource("main.fxml"))));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public SeatBooking createBooking(){
        return new SeatBooking(1234, "Josh", 4);
    }

}
