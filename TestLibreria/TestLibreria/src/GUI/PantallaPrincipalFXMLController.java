/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Pablo
 */
public class PantallaPrincipalFXMLController implements Initializable {
    private Stage primaryStage = new Stage();
    @FXML
    private Button botonAlumnos;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void irAlumnos(ActionEvent event) {
          try{  FXMLLoader cargador = new FXMLLoader(getClass().getResource("/GUI/PantallaAlumnosFXML.fxml"));         
            Parent root = (Parent) cargador.load();
            PantallaAlumnosFXMLController ventana = cargador.<PantallaAlumnosFXMLController>getController();
            ventana.initStage(primaryStage);
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();  
          }catch(IOException e){}
    }
    
}
