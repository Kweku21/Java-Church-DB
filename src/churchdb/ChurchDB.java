/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package churchdb;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Kweku Debrah
 */
public class ChurchDB extends Application {
    
    private double x,y;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/home.fxml"));
        
        primaryStage.setScene(new Scene(root));
       
        //set stage borderless
       primaryStage.initStyle(StageStyle.UNDECORATED);
      // primaryStage.initStyle(StageStyle.TRANSPARENT);
       primaryStage.setTitle("Church Of Christ");
      // primaryStage.setFullScreen(true);
       primaryStage.setResizable(false);
       primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("church.jpg")));
       
       //Setting minimum width and height
//       primaryStage.setMinWidth(1050.00);
//       primaryStage.setMinHeight(576);

        //drag it here
        root.setOnMousePressed(event -> {
            x = event.getSceneX();
            y = event.getSceneY();
        });
        root.setOnMouseDragged(event -> {

            primaryStage.setX(event.getScreenX() - x);
            primaryStage.setY(event.getScreenY() - y);

        });
        
        
        primaryStage.show();
    }

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
