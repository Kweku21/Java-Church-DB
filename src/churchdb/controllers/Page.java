
package churchdb.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


public class Page {
    
        @FXML
    private Button btnEvents;

    @FXML
    private Label lbFemale1;

    @FXML
    private Button btnAddMember;

    @FXML
    private VBox pnItems2;

    @FXML
    private Button btnSettings;

    @FXML
    private Pane pnlBtn;

    @FXML
    private ImageView btnMini;

    @FXML
    private TextField fdSearchMem11;

    @FXML
    private Label lbMem11;

    @FXML
    private VBox pnItems1;

    @FXML
    private Label lbFemale2;

    @FXML
    private TextField fdSearchMem111111;

    @FXML
    private Label lbMale1;

    @FXML
    private Label lbMale2;

    @FXML
    private Pane pnlSettings;

    @FXML
    private Label lbNum;

    @FXML
    private TextField fdSearchMem2;

    @FXML
    private TextField fdSearchMem1111;

    @FXML
    private TextField fdSearchMem1;

    @FXML
    private TextField fdSearchMem111;

    @FXML
    private Pane pnlEvent;

    @FXML
    private Button btnDashboard;

    @FXML
    private Button btnMembers;

    @FXML
    private Label lbFemale;

    @FXML
    private Label lbPresent;

    @FXML
    private Button btnAttend;

    @FXML
    private Pane pnlAttend;

    @FXML
    private TextField fdSearchMem11111;

    @FXML
    private Pane pnlMembers;

    @FXML
    private Label lbMem1;

    @FXML
    private Label lbMem2;

    @FXML
    private VBox pnItems;

    @FXML
    private TextField fdSearchMem;

    @FXML
    private Label lbNum1;

    @FXML
    private Pane pnlDashBoard;

    @FXML
    private Label lbMem11111;

    @FXML
    private Label lbNum3;

    @FXML
    private Label lbNum2;

    @FXML
    private Button btnGroup;

    @FXML
    private Label lbMem;

    @FXML
    private ImageView btnClose;

    @FXML
    private Pane pnlEditEvent;

    @FXML
    private Button btnSignout;

    @FXML
    private Label lbAbsent;

    @FXML
    private Pane pnlAddMember;

    @FXML
    private Label lbMem111111;

    @FXML
    private Pane pnlEditMember;

    @FXML
    private Label lbPage;

    @FXML
    private Label lbMale;

    @FXML
    private Pane pnlAddEvent;

    @FXML
    private Button btnAddMember1;

    @FXML
    private Label lbMem111;

    @FXML
    private Label lbMem1111;
    
    @FXML
    private Label lbNumAttend;
    
   
     
    public void dashboard(){
        
    }
    
    @FXML
    public void members(){
        
        String nmOfMem="",numOfMale="",numOfFemale="";
        
        lbNum.setText(nmOfMem);
        lbFemale.setText(numOfFemale);
        lbMale.setText(numOfMale);
        
        
        
        
        
    }
    
    @FXML
    public void attend(){
        
        String numOfMem="", numOfPresent ="",numOfAbsent="";
        
        lbAbsent.setText(numOfAbsent);
        lbPresent.setText(numOfPresent);
        lbNumAttend.setText(numOfMem);
        
    }
    
}
