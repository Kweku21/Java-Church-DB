
package churchdb.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;


public class EventController implements Initializable{
    
      @FXML
    private Label lbDate;

    @FXML
    private HBox itemEvent;

    @FXML
    private Label lbAgenda;

    @FXML
    private Label lbEventName;

    @FXML
    private Label lbDays;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        lbEventName.setText("Nana");


    }
    
}
