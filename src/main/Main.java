package main;

/**
 *  Main.java
 * @author Allen Moore
 * initial class
 * sets Title, scene and initializes main menu as well as
 *
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("init() called...");
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/MainMenu.fxml"));
        stage.setTitle("WGU Project • Allen Moore");
        stage.setScene(new Scene(root, 900,600));
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
