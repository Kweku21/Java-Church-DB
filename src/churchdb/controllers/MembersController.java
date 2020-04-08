
package churchdb.controllers;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;


public class MembersController implements Initializable{
    
    
    @FXML
    private Label lbMemDOB;

    @FXML
    private Label lbMemGen;

    @FXML
    private HBox itemMember;

    @FXML
    private Label lbMemName;
    
    private String index;

    public MembersController(String i) {
        
        index =i;
    }
    
    
    Connection conn = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
       
        
       
        lbMemGen.setText(memGender());
        lbMemDOB.setText(memDOB());

    }
    
    private String memName(){
        
        return "";
    }
    
    private String memGender(){
        
        return "";
    }
    
    private String memDOB(){
        
        return "";
    }
    
   
    
    
    
}
