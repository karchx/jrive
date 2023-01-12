package com.karchx;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

  public static final String FXML_HOME = "/fxml/test.fxml";

  @Override
  public void start(Stage stage) throws IOException {
    URL path = getClass().getResource(FXML_HOME);

    if (path != null) {
      Parent root = FXMLLoader.load(path);
      Scene scene = new Scene(root);

      stage.setScene(scene);
      stage.show();
    } else {
      System.err.println("Error initializing FXML Home");
      System.exit(-1);
    }

  }

  public static void main(String[] args) {
    launch();
  }

}
