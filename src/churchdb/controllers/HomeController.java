
package churchdb.controllers;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import databse.ConnectionDB;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.imageio.ImageIO;



public class HomeController implements Initializable {
    
   @FXML
    private ImageView btnCloseLogin;

    @FXML
    private Label lbHomeAbsent;

    @FXML
    private ImageView btnMiniDash;

    @FXML
    private Pane pnlHomePage;

    @FXML
    private TextField txtEditfname;

    @FXML
    private ImageView btnHomeClose;

    @FXML
    private Label lbMemPOB;

    @FXML
    private TextField txtEditZone;

    @FXML
    private Pane pnlBtn;

    @FXML
    private ImageView btnMiniZone;

    @FXML
    private Label lbMem11;

    @FXML
    private Label lbMemTele;

    @FXML
    private Label lbMemSpName;

    @FXML
    private ImageView btnMemDetMini;

    @FXML
    private Label lbNumDash;

    @FXML
    private Label lbMemZone;

    @FXML
    private Button btnHome;

    @FXML
    private TextField txtAddfname;

    @FXML
    private ImageView btnCloseCheck;

    @FXML
    private Label lbPresentAttendence;

    @FXML
    private ImageView btnCloseAddMem;

    @FXML
    private Label lbMem12;

    @FXML
    private ImageView btnCloseAttend;

    @FXML
    private Label lbHomeMale;

    @FXML
    private TextField txtAddBapt;

    @FXML
    private Label lbMem13;

    @FXML
    private Label lbHomePresent;

    @FXML
    private TextField txtEditLocation;

    @FXML
    private ImageView btnCloseZone;

    @FXML
    private ImageView btnCloseEditMem;

    @FXML
    private Label lbMem113111;

    @FXML
    private Pane pnlAddMem;

    @FXML
    private Button btnAddMem;

    @FXML
    private Label btnForgot111;

    @FXML
    private Label lbMem131;

    @FXML
    private Label lbMalZone;

    @FXML
    private TextField txtAddFarherName;

    @FXML
    private Label lbMemMarried;

    @FXML
    private ImageView btnHomeMini;

    @FXML
    private Label lbMem1;

    @FXML
    private TextField txtZoneAgenda;

    @FXML
    private TextField txtEditdob;

    @FXML
    private ImageView txtEditFinger;

    @FXML
    private TextField txtEditFarherName;

    @FXML
    private TextField txtAddChurchPo;

    @FXML
    private TextField txtAddChildNum;

    @FXML
    private TextField txtZoneMotto;

    @FXML
    private Label lbNumAttendence;

    @FXML
    private TextField txtAddMotherName;

    @FXML
    private Button btnAddZone;

    @FXML
    private TextField txtEditChildNum;

    @FXML
    private Pane pnlZoneMem;

    @FXML
    private Label lbMemfname;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private Label lbHomeTotal;

    @FXML
    private VBox pnlDash;

    @FXML
    private ImageView btnMemDetClose;

    @FXML
    private TextField txtEditBapt;

    @FXML
    private Pane pnlEditMem;

    @FXML
    private TextField txtEditOccu;

    @FXML
    private Button btnZone;

    @FXML
    private TextField txtEditChurchPo;

    @FXML
    private Label lbError;

    @FXML
    private Label lbMemDOB;

    @FXML
    private Pane pnlZone;

    @FXML
    private TextField txtUsername;

    @FXML
    private TextField txtAddlname;

    @FXML
    private Button btnFinger;

    @FXML
    private TextField txtAddHT;

    @FXML
    private TextField txtAddZone;

    @FXML
    private TextField txtEditHT;

    @FXML
    private ImageView btnCloseDash;

    @FXML
    private ImageView txtAddFinger;

    @FXML
    private TextField txtEditMotherName;

    @FXML
    private Label lbMem111;

    @FXML
    private TextField txtEditlname;

    @FXML
    private Label lbMem112;

    @FXML
    private Label lbMem113;

    @FXML
    private TextField txtEditpob;

    @FXML
    private VBox vBoxCheck;
    
    
    @FXML
    private VBox vBoxZones;

    @FXML
    private ImageView txtEditPic;

    @FXML
    private ImageView btnMiniAttend;

    @FXML
    private TextField txtAdddobp;

    @FXML
    private Label lbMemNOB;

    @FXML
    private Label lbMemNOC;

    @FXML
    private Button btnMan;

    @FXML
    private Label lbMemLoca;

    @FXML
    private VBox vBoxZone;

    @FXML
    private ImageView btnMiniAddZone;

    @FXML
    private Label lbMemLname;

    @FXML
    private TextField txtZone;

    @FXML
    private Label lbFemaleZone;

    @FXML
    private Label lbHomeFemale;

    @FXML
    private Label lbMem1122;

    @FXML
    private TextField txtEditNum;

    @FXML
    private TextArea txtZoneDesc;

    @FXML
    private ImageView btnCloseAddZone;

    @FXML
    private TextField txtEditSpName;

    @FXML
    private Pane pnlHome;

    @FXML
    private Pane pnlMemPage;

    @FXML
    private Button btnDashboard;

    @FXML
    private TextField txtEditMarri;

    @FXML
    private Pane pnlAttendance;

    @FXML
    private Button btnAttend;

    @FXML
    private Label lbMemChild4;

    @FXML
    private Label lbFemaleDash;

    @FXML
    private Label lbMemHomeTown;

    @FXML
    private Label lbMemChild2;

    @FXML
    private Label lbMemChild1;

    @FXML
    private TextField txtAddMari;

    @FXML
    private Label lbMem1131;

    @FXML
    private Label lbMemDad;

    @FXML
    private ImageView lbMemPic;

    @FXML
    private ImageView txtAddPic;

    @FXML
    private Pane pnlLogin;

    @FXML
    private Label btnForgot1;

    @FXML
    private TextField txtAddNum;

    @FXML
    private Label lbMemCild3;

    @FXML
    private TextField txtAddSpName;

    @FXML
    private ImageView btnMiniLogin;

    @FXML
    private Label lbHomeZone;

    @FXML
    private Label lbMem11311;

    @FXML
    private Pane pnlDashBoard;

    @FXML
    private TextField txtAddOccu;

    @FXML
    private Button btnViewMem;

    @FXML
    private Label lbAbsentAttendence;

    @FXML
    private TextField txtEditdobp;

    @FXML
    private Button btnSignin;

    @FXML
    private Label lbMemMother;

    @FXML
    private Label lbMemDOBa;

    @FXML
    private Pane pnlCheck;

    @FXML
    private ImageView btnMiniCheck;

    @FXML
    private ImageView btnMiniEditMem;

    @FXML
    private TextField txtAddpob;

    @FXML
    private Label lbMaleDash;

    @FXML
    private Label lbNumZone;

    @FXML
    private TextField txtAddLocation;

    @FXML
    private Label btnForgot11;

    @FXML
    private ImageView btnMiniAddMem;

    @FXML
    private VBox pnlDash1;

    @FXML
    private TextField txtAdddob;

    @FXML
    private Label lbMem1111;
    
     @FXML
    private Button btnAddSave;
     
     @FXML
     private Button btnAddZoneAddNew;
     
     @FXML
     private Button btnMemDetEdit;
     
     @FXML
     private Button btnEditMemUpdate;
     
     @FXML
     private Button btnAttendStart;
     
     @FXML
     private Button btnDashAdd;
     
     @FXML
     private Button btnZonesAdd;
     
     int index;
     
       @FXML
    private Pane pnlPresentPage;
       
        @FXML
    private Pane pnlAbsentPage;
        
    @FXML
    private Pane pnlZones;
    
    @FXML
    private Label lbNumZone1;
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
    @FXML
    public void handleClicks(ActionEvent event) throws SQLException, IOException{
        
        
        if(event.getSource() == btnDashboard){           
               empty(pnlDash);
               empty(vBoxZone);
               empty(pnlDash1);
              
            pnlBtn.toFront();
            pnlDashBoard.toFront();
            
            String numOfMem=totalMem()+"",numOfMale=male()+"",numOfFemale=female()+"";

            lbNumDash.setText(numOfMem);
            lbMaleDash.setText(numOfMale);
            lbFemaleDash.setText(numOfFemale);
            
            clearSpace();
            
            dashTable();
 
            
        }else if(event.getSource()==btnSignin){
            
            if(login().equals("Success")){
            
               pnlHomePage.toFront();
              String numOfMem=totalMem()+"",numOfMale=male()+"",numOfFemale=female()+"";

                lbHomeTotal.setText(numOfMem);
                lbHomeMale.setText(numOfMale);
                lbHomeFemale.setText(numOfFemale);                               
                lbHomeZone.setText(zoneNum()+"");
                
      
            }
        }else if(event.getSource()==btnHome){
            
               empty(pnlDash1);
               empty(pnlDash);
               empty(vBoxZone);
            
             String numOfMem=totalMem()+"",numOfMale=male()+"",numOfFemale=female()+"";
             
             pnlHome.toFront();

                lbHomeTotal.setText(numOfMem);
                lbHomeMale.setText(numOfMale);
                lbHomeFemale.setText(numOfFemale);
                lbHomeZone.setText(zoneNum()+"");
              
                clearSpace();
            
        }else if(event.getSource()==btnZone){
              empty(pnlDash1);
               empty(pnlDash);
               empty(vBoxZones);
              
              clearSpace();
            pnlZones.toFront();
            
            
            lbNumZone1.setText(zoneNum()+"");
            
            
            zonesTable();
            
            
            
        }else if(event.getSource()==btnAttend){
             empty(pnlDash1);
               empty(pnlDash);
               empty(vBoxZone);
            
             pnlAttendance.toFront();
            
            lbAbsentAttendence.setText(absent()+"");
            lbPresentAttendence.setText(present()+"");
            lbNumAttendence.setText(totalMem()+"");
            
            clearSpace();
            
            attendTable();
            
            
            
            
        }else if(event.getSource()==btnAttendStart){
             empty(pnlDash1);
               empty(pnlDash);
               empty(vBoxZone);
               
               attendDB();
               
            lbAbsentAttendence.setText(absent()+"");
            lbPresentAttendence.setText(present()+"");
            lbNumAttendence.setText(totalMem()+"");

            attendTable();
            
            
        }else if(event.getSource()==btnDashAdd){
            
            clearSpace();
             
            empty(pnlDash1);
               empty(pnlDash);
               empty(vBoxZone);
             
             
             pnlAddMem.toFront();
            
            
            
        }else if(event.getSource()==btnAddSave){
            
            addMember();
            
            clearSpace();
            
            
        }else if(event.getSource()== btnAddZoneAddNew){
            addZone();
        }else if(event.getSource()== btnMemDetEdit){
            
           editMem();
        }else if(event.getSource()== btnEditMemUpdate){
            
            update();
            
        }else if(event.getSource()==btnZonesAdd){
            
            pnlZone.toFront();
        }
    }
 
    Stage stage;
   
     @FXML
    private TextField txtEditGender;
    
    @FXML
    private DatePicker dtDOBp;
    
     @FXML
    private DatePicker dtDOB;
      @FXML 
       private Label lbEditError;
      
     List<String>fname= new ArrayList(); 
     List<String>lname= new ArrayList();
     List<String>zone= new ArrayList();
     
     void list() throws SQLException{
         
          String sql ="SELECT * FROM members ";
         
         preparedStatement = conn.prepareStatement(sql);

       // preparedStatement.setInt(1,index);
        
        
        resultSet= preparedStatement.executeQuery();
        
        while(resultSet.next()){
            fname.add(resultSet.getString("fname"));
            lname.add(resultSet.getString("lname"));
            zone.add(resultSet.getString("zone"));
        }
         
     }
     
     void savefingerPrint(){
         
     }
     
     void checkFingerPrint(){
         
     }
     
    void attendDB() throws SQLException{
        list();   
        DateFormat year = new SimpleDateFormat("yyyy");
        DateFormat month = new SimpleDateFormat("MM");
         DateFormat day = new SimpleDateFormat("MM");
        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        Date dated = new Date();
        
        String yr,mnth,dat,d;
        
        yr = year.format(dated);
        mnth = month.format(dated);
        dat = date.format(dated);
        d= day.format(dated);
        
      for(int i=0;i<fname.size();i++){  
        String sql = "INSERT INTO attendance(fname,lname,attendance,day,"
                + "month,date,year,zone,id) VALUES(?,?,?,?,?,?,?,?,?)";
        
        preparedStatement = conn.prepareStatement(sql);
        
        preparedStatement.setString(1, fname.get(i));
        preparedStatement.setString(2, lname.get(i));
        preparedStatement.setString(3, "ABSENT");
        preparedStatement.setString(4, d);
        preparedStatement.setString(5, mnth);
        preparedStatement.setString(6, dat);
        preparedStatement.setString(7, yr);
        preparedStatement.setString(8, zone.get(i));
        preparedStatement.setInt(9, (i+1));
        
           boolean r;
         
             r=preparedStatement.execute();
             if(r){
                 System.out.println("Attendance Worked");
             }else{
                 System.out.println("Attendance Didnt work");
             }
             
             absentId.add(i+1);
        
      }
    }
    
    Image imageDisplay(ResultSet r) throws SQLException, IOException{
        
        byte[] img= r.getBytes("picture");
        BufferedImage buff = ImageIO.read(new ByteArrayInputStream(img));
        Image image=null;
        
        if(buff != null){
            image=SwingFXUtils.toFXImage(buff, null);
            
        }
        return image;
    }
    
    private void editMem() throws SQLException, IOException{
        
         String sql ="SELECT * FROM members WHERE id =?";
         
         preparedStatement = conn.prepareStatement(sql);

        preparedStatement.setInt(1,index);
        
        
        resultSet= preparedStatement.executeQuery();
        
        if(resultSet.next()){
            txtEditfname.setPromptText(resultSet.getString("fname"));
            txtEditlname.setPromptText(resultSet.getString("lname"));
            txtEditGender.setPromptText(resultSet.getString("gender"));
           // dtDOB.setPromptText(resultSet.getString("dob"));
            txtEditLocation.setPromptText(resultSet.getString("location"));
            txtEditHT.setPromptText(resultSet.getString("hometown"));
            txtEditNum.setPromptText(resultSet.getString("number"));
            txtEditOccu.setPromptText(resultSet.getString("job"));
            txtEditChildNum.setPromptText(resultSet.getString("childrenNumber"));
            txtEditMarri.setPromptText(resultSet.getString("maritalStatus"));
            txtEditFarherName.setPromptText(resultSet.getString("dadName"));
            txtEditMotherName.setPromptText(resultSet.getString("momName"));
           // dtDOBp.setValue(resultSet.getString("dateOfBapt"));
            txtEditZone.setPromptText(resultSet.getString("zone"));
            txtEditChurchPo.setPromptText(resultSet.getString("position"));
            txtEditpob.setPromptText(resultSet.getString("placeOfBapt"));
            txtEditPic.setImage(imageDisplay(resultSet));
            
            
            
              pnlEditMem.toFront();
            
        }
        
       
        
    }
    
    private void update() throws SQLException{
        
        String fName = txtEditfname.getText();
        String lName = txtEditlname.getText();
        String loca = txtEditLocation.getText();
        String num = txtEditNum.getText();      
        String gender = txtEditGender.getText().toUpperCase();
        String hTown = txtEditHT.getText();
        String job = txtEditOccu.getText();
        String dob = dtDOB.getValue().toString();
        String status = txtEditMarri.getText();      
        String spName = txtEditSpName.getText();
        String posi = txtEditChurchPo.getText();
        String zones = txtEditZone.getText();
        String bapt = txtEditBapt.getText();
        String place = txtEditpob.getText();      
        String dobp = dtDOBp.getValue().toString();
        String childNum = txtEditChildNum.getText();
        String faName = txtEditFarherName.getText();
        String mName = txtEditMotherName.getText();
        Image img = txtEditPic.getImage();
        File image= images;     
        FileInputStream fin = find;

         String sql ="update members set fname=?, lname=?,gender=?,dob=?,hometown=?,number=?,job=?,childrenNumber=?,maritalStatus=?,dadName=?,momName=?,dateOfBapt=?,baptizim=?,spouse=?,placeOfBapt=?,zone=?,location=?,picture=? where id =?";
         preparedStatement = conn.prepareStatement(sql);
       
  
         preparedStatement.setString(1, fName);
         preparedStatement.setString(2, lName);
         preparedStatement.setString(3, gender);
         preparedStatement.setString(4, dob);
         preparedStatement.setString(5, hTown);
         preparedStatement.setString(6, num);
         preparedStatement.setString(7, job);
         preparedStatement.setString(8, childNum);
         preparedStatement.setString(9, status);
         preparedStatement.setString(10, faName);
         preparedStatement.setString(11, mName);
         preparedStatement.setString(12, dobp);
         preparedStatement.setString(13, bapt);
         preparedStatement.setString(14, spName);
         preparedStatement.setString(15, place);
         preparedStatement.setString(16, zones);
         preparedStatement.setString(17, loca);
         preparedStatement.setBinaryStream(18, (InputStream)fin,(int)image.length());
         preparedStatement.setInt(19, index);
         
         int r;
           r=preparedStatement.executeUpdate();
  
         
         
         if(r>0){
            lbEditError.setTextFill(Color.GREEN);
             lbEditError.setText("Succesfully Edited Details");
                           
         }else {      
             
              lbEditError.setTextFill(Color.TOMATO);
             lbEditError.setText("Unable to Edit Details");
             
         }
       
            
        
    }
    
    
    private void zoneTable(String zone) throws IOException, SQLException{
        
        Node[] nodes =new Node[zoneMemNum(indexZone)];
        
        for(int i=0;i<zoneMemNum(indexZone);i++){
            
            final int j = i;
            
            
            indexOfZone(i);
            
            nodes[i]=FXMLLoader.load(getClass().getResource("zone.fxml"));
            
           
             nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color : #007FFF");
                });
             nodes[i].setOnMouseExited(event -> {
                 nodes[j].setStyle("-fx-background-color : #FFFFFF");
              });
             
             nodes[i].setOnMouseClicked(event ->{
               
               
               
             });
             
            vBoxZone.getChildren().add(nodes[i]);
            
        }
        
    }
    
    
     private void attendTable() throws IOException, SQLException{
        
        Node[] nodes =new Node[totalMem()];
        
        for(int i=0;i<totalMem();i++){
            
            final int j = i;
            index(i+1);
             nodes[i] = FXMLLoader.load(getClass().getResource("today.fxml"));
            
             nodes[i].setOnMouseClicked(event ->{
                try {
                    checker(j);
                    attendancePresent(j);
                } catch (SQLException ex) {
                   
                }
                 nodes[j].setStyle("-fx-background-color : #007FFF");
                  
                try {
                    lbAbsentAttendence.setText(absent()+"");
                    lbPresentAttendence.setText(present()+"");
                } catch (SQLException ex) {
                   
                }
                 
             });
            pnlDash1.getChildren().add(nodes[i]);
            
        }
        
       
        
    }
     
     List<Integer>presentId= new ArrayList();
     List<Integer>absentId= new ArrayList();
     
     void attendancePresent(int k){
         
         presentId.add(k);
         absentId.remove(k);
     }
     
     public void checker(int i) throws SQLException{
         
          String sql = "UPDATE attendance SET attendance=? WHERE id=?";
         
        preparedStatement = conn.prepareStatement(sql);

        preparedStatement.setString(1, "PRESENT");
        preparedStatement.setInt(2,i);
       //  preparedStatement.setInt(2, i);
          boolean r;
         
             r=preparedStatement.execute();
             
             if(r){
                 System.out.println("Yes");
             }else{
                 System.out.println("No");
             }
         attendancePresent(i);
     }
     
     public void empty(VBox box){
         box.getChildren().clear();
     }
     
   
    public void index(int k) throws SQLException{
        
          preparedStatement=conn.prepareStatement( "INSERT INTO indexof ( id, idNum) VALUES (?,?)");
       
         preparedStatement.setInt(1, 1);
         preparedStatement.setInt(2, k);
         
            boolean r;
         r=preparedStatement.execute();
         
         if(!r){
            
         }else{
             
         }
        
        
    }
    
       
      private void dashTable() throws IOException, SQLException{
        
        Node [] nodes =new Node[totalMem()];
        
        for(int i=0;i<totalMem();i++){
            
          
            final int j = i;
            
           
            index(i+1);
          

             nodes[i] = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
             
             nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color : #007FFF");
                });
             nodes[i].setOnMouseExited(event -> {
                 nodes[j].setStyle("-fx-background-color : #FFFFFF");
              });
             nodes[i].setOnMouseClicked(event ->{
               
                try {
                    pushDet(j);
                } catch (SQLException ex) {
                 
                } catch (IOException ex) {
                    Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
                }
               
             });
            pnlDash.getChildren().add(nodes[i]);
            
        }
        
       
       
        
    }

       @FXML
    private VBox pnlPresent;
       

     private void presentTable() throws IOException, SQLException{
         
         
        
        Node[] nodes =new Node[totalMem()];
        
        for(int i=0;i<present();i++){
            
            final int j = i;
         
            indexOfPre(i);
            nodes[i]=FXMLLoader.load(getClass().getResource("present.fxml"));
            
             nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color :#007FFF");
                });
             nodes[i].setOnMouseExited(event -> {
                 nodes[j].setStyle("-fx-background-color :#FFFFFF");
              });
            pnlPresent.getChildren().add(nodes[i]);
        }
        
    }
     
      @FXML
    private VBox pnlAbsent;
      
      @FXML
      private Label lbMemGender;
    
     private void absentTable() throws IOException, SQLException{
        
        Node[] nodes =new Node[totalMem()];
        
        for(int i=0;i<absent();i++){
            
            final int j = i;
            
           
            indexOfAb(i);
            nodes[i]=FXMLLoader.load(getClass().getResource("absent.fxml"));
            
             nodes[i]=FXMLLoader.load(getClass().getResource("present.fxml"));
            
             nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color :#007FFF");
                });
            pnlAbsent.getChildren().add(nodes[i]);
        }
        
    }
     
     private void zonesTable() throws IOException, SQLException{
        
        Node[] nodes =new Node[zoneNum()];
        
        for(int i=0;i<zoneNum();i++){
            
            final int j = i;
            
            index(i+1);
            
            nodes[i]=FXMLLoader.load(getClass().getResource("zones.fxml"));
            
             nodes[i].setOnMouseEntered(event -> {
                    nodes[j].setStyle("-fx-background-color : #007FFF");
                });
             nodes[i].setOnMouseExited(event -> {
                 nodes[j].setStyle("-fx-background-color : #FFFFFF");
                 
              
              });
             
             nodes[i].setOnMouseClicked(event->{
             pnlZoneMem.toFront();
                indexZone=j;
                try {
                    
                   lbNumZone.setText(zoneMemNum(j)+"");
                   lbFemaleZone.setText(zoneFemMem(j)+"");
                   lbMalZone.setText(zoneMalMem(j)+"");
                   
                } catch (SQLException ex) {
                   
                }
             });
                     
            vBoxZones.getChildren().add(nodes[i]);
        }
        
    }
    
    
     private void pushDet(int k) throws SQLException, IOException{
         
         
         index = k +1;
          String sql ="SELECT * FROM members WHERE id =?";
         
         preparedStatement = conn.prepareStatement(sql);

        preparedStatement.setInt(1,k+1);
        
        
        resultSet= preparedStatement.executeQuery();
        
        if(resultSet.next()){
            
            lbMemfname.setText(resultSet.getString("fname"));
            lbMemLname.setText(resultSet.getString("lname"));
            lbMemGender.setText(resultSet.getString("gender"));
            lbMemDOB.setText(resultSet.getString("dob"));
            lbMemLoca.setText(resultSet.getString("location"));
            lbMemHomeTown.setText(resultSet.getString("hometown"));
            lbMemTele.setText(resultSet.getString("number"));
            //lbMem1.setText(resultSet.getString("job"));
            lbMemMarried.setText(resultSet.getString("maritalStatus"));
            lbMemDad.setText(resultSet.getString("dadName"));
            lbMemMother.setText(resultSet.getString("momName"));
            lbMemDOBa.setText(resultSet.getString("dateOfBapt"));
            lbMemNOB.setText(resultSet.getString("baptizim"));
            lbMemSpName.setText(resultSet.getString("spouse"));
            lbMemPOB.setText(resultSet.getString("placeOfBapt"));
            lbMemZone.setText(resultSet.getString("zone"));
            lbMemPic.setImage(imageDisplay(resultSet));
            
            
           // numOFChild(Integer.parseInt(lbMemNOC),lbMemDad.toString() , lbMemMother.toString());
             pnlMemPage.toFront();
         
        }
        
     }
     
     
     List<String>children= new ArrayList();
     
     void numOFChild(int k,String fn,String mn) throws SQLException{
         
         if(k>0){
             String sql ="SELECT * FROM members WHERE dadName =? and momName=?";
         
         preparedStatement = conn.prepareStatement(sql);

        preparedStatement.setString(1,fn);
        preparedStatement.setString(1,mn);
        
        
        resultSet= preparedStatement.executeQuery();
        
        while(resultSet.next()){
            
           children.add(resultSet.getString("fname")+" "+resultSet.getString("lname"));

        }
        lbMemChild1.setText(children.get(0));
        lbMemChild2.setText(children.get(0));
        lbMemCild3.setText(children.get(0));
        lbMemChild4.setText(children.get(0));
         
         }
         
     }
     
       File images  =null;   
       FileInputStream find ;
       
       @FXML
       private ImageView btnClosePresent;
       
        @FXML
       private ImageView btnCloseAbsent;
        
         @FXML
       private ImageView btnMiniPresent;
         
          @FXML
       private ImageView btnMiniAbsent;
          
        @FXML  
       private ImageView btnCloseZones;
        
         @FXML  
       private ImageView btnMiniZones;
       
     @FXML
    private void handleClose(MouseEvent mouse) throws FileNotFoundException, IOException, SQLException{
        
       
         if(mouse.getSource()==btnCloseLogin){
             
             System.exit(0);
             
         }else if(mouse.getSource()==btnMiniLogin){
             
           ((Stage)((ImageView)mouse.getSource()).getScene().getWindow()).setIconified(true);
           
         }else if(mouse.getSource()== imgAddPic){
             
               
            
            FileChooser chooser = new FileChooser();
            FileChooser.ExtensionFilter ext1 = new  FileChooser.ExtensionFilter("JPG files(*.jpg)", "*.JPG");
             FileChooser.ExtensionFilter ext2 = new  FileChooser.ExtensionFilter("PNG files(*.png)", "*.PNG");
             chooser.getExtensionFilters().addAll(ext1,ext2);
           File file = chooser.showOpenDialog(stage);
           
           if(file != null){
               String fileAsString ="";
                       fileAsString=file.getAbsolutePath();
                       
                //imgAddPic.setImage(new Image(fileAsString));
                       
                  File image= new File(fileAsString);     
                FileInputStream fin = new FileInputStream(image);
             
                Image img = new Image(file.toURI().toString());
              // System.out.println(fileAsString);
               imgAddPic.setImage(img);
              images=image;
              find= fin;
           }
        }else if(mouse.getSource()== txtEditPic){
             
               
            
            FileChooser chooser = new FileChooser();
            FileChooser.ExtensionFilter ext1 = new  FileChooser.ExtensionFilter("JPG files(*.jpg)", "*.JPG");
             FileChooser.ExtensionFilter ext2 = new  FileChooser.ExtensionFilter("PNG files(*.png)", "*.PNG");
             chooser.getExtensionFilters().addAll(ext1,ext2);
           File file = chooser.showOpenDialog(stage);
           
           if(file != null){
               String fileAsString ="";
                       fileAsString=file.getAbsolutePath();
                       
                //imgAddPic.setImage(new Image(fileAsString));
                       
                  File image= new File(fileAsString);     
                FileInputStream fin = new FileInputStream(image);
             
                Image img = new Image(file.toURI().toString());
              // System.out.println(fileAsString);
               txtEditPic.setImage(img);
              images=image;
              find= fin;
           }
        }else if(mouse.getSource()== btnCloseAddMem){
               
                 System.exit(0);
               
           }else if(mouse.getSource()== btnCloseAddZone){
                 System.exit(0);
               
           }else if(mouse.getSource()== btnCloseEditMem){
               
                 System.exit(0);
               
           }else if(mouse.getSource()== btnCloseAttend){
               
                 System.exit(0);
               
           }else if(mouse.getSource()== btnCloseDash){
               
                 System.exit(0);
               
           }else if(mouse.getSource()== btnCloseZone){
               
                 System.exit(0);
               
           }else if(mouse.getSource()== btnCloseCheck){
               
                 System.exit(0);
               
           }else if(mouse.getSource()== btnHomeClose){
               
                 System.exit(0);
               
           }else if(mouse.getSource()== btnMemDetClose){
               
                 System.exit(0);
               
           }else if(mouse.getSource()==btnMiniAddMem){
               
                ((Stage)((ImageView)mouse.getSource()).getScene().getWindow()).setIconified(true);
               
           }else if(mouse.getSource()==btnMiniAddZone){
               
                ((Stage)((ImageView)mouse.getSource()).getScene().getWindow()).setIconified(true);
               
           }
           else if(mouse.getSource()==btnMiniAttend){
               
                ((Stage)((ImageView)mouse.getSource()).getScene().getWindow()).setIconified(true);
               
           }
           else if(mouse.getSource()==btnMiniCheck){
               
                ((Stage)((ImageView)mouse.getSource()).getScene().getWindow()).setIconified(true);
               
           }else if(mouse.getSource()==btnMiniDash){
               
                ((Stage)((ImageView)mouse.getSource()).getScene().getWindow()).setIconified(true);
               
           }else if(mouse.getSource()==btnMiniEditMem){
               
                ((Stage)((ImageView)mouse.getSource()).getScene().getWindow()).setIconified(true);
               
           }else if(mouse.getSource()==btnHomeMini){
               
                ((Stage)((ImageView)mouse.getSource()).getScene().getWindow()).setIconified(true);
               
           }else if(mouse.getSource()==btnMemDetMini){
               
                ((Stage)((ImageView)mouse.getSource()).getScene().getWindow()).setIconified(true);
               
           }else if(mouse.getSource()==lbAbsentAttendence){
               
               pnlAbsentPage.toFront();
               
               absentTable();
               
           }else if(mouse.getSource() == lbPresentAttendence){
               
               pnlPresentPage.toFront();
               presentTable();
               
           }else if(mouse.getSource()== btnClosePresent){
                 System.exit(0);
               
           }else if(mouse.getSource()== btnCloseAbsent){
                 System.exit(0);
               
           } else if(mouse.getSource()==btnMiniPresent){
               
                ((Stage)((ImageView)mouse.getSource()).getScene().getWindow()).setIconified(true);
               
           } else if(mouse.getSource()==btnMiniAbsent){
               
                ((Stage)((ImageView)mouse.getSource()).getScene().getWindow()).setIconified(true);
               
           }else if(mouse.getSource()== btnCloseZones){
               
                 System.exit(0);
               
           }else if(mouse.getSource()==btnMiniZones){
               
                ((Stage)((ImageView)mouse.getSource()).getScene().getWindow()).setIconified(true);
               
           }
                 
         
    }
    
   
    Connection conn = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;
     Statement stat = null;
     
     @FXML
     Label lbAddZoneError;
     
     void addZone() throws SQLException{
         
        String name = txtZone.getText();
        String agenda = txtZoneAgenda.getText();
        String desc = txtZoneDesc.getText();
        String motto = txtZoneMotto.getText();      
        
        
        
         preparedStatement=conn.prepareStatement( "INSERT INTO zone ( name, motto, descript,agenda) VALUES(?,?,?,?)");
       
         preparedStatement.setString(1, name);
         preparedStatement.setString(2, motto);
         preparedStatement.setString(3, desc);
         preparedStatement.setString(4, agenda);
        
          boolean r;
         r=preparedStatement.execute();
         
         
         if(!r){
            lbAddZoneError.setTextFill(Color.GREEN);
             lbAddZoneError.setText("Succesfully added new Zone");
                           
         }else {      
             
              lbAddZoneError.setTextFill(Color.TOMATO);
             lbAddZoneError.setText("Unable to add new Zone");
             
         }
         
     }
     
     boolean checkForImage() throws SQLException{
         String sql;
       
        String fName = txtAddfname.getText();
        String lName = txtAddlname.getText();
        String loca = txtAddLocation.getText();
        String num = txtAddNum.getText();      
        String gender = txtAddGender.getText().toUpperCase();
        String hTown = txtAddHT.getText();
        String job = txtAddOccu.getText();
        String dob = dtAdddob.getValue().toString();
        String status = txtAddMari.getText();      
        String spName = txtAddSpName.getText();
        String posi = txtAddChurchPo.getText();
        String zones = txtAddZone.getText();
        String bapt = txtAddBapt.getText();
        String place = txtAddpob.getText();      
        String dobp = dtAdddobp.getValue().toString();
        String childNum = txtAddChildNum.getText();
        String faName = txtAddFarherName.getText();
        String mName = txtAddMotherName.getText();
        File image= images;     
        FileInputStream fin = find;
        
         if(images != null ){
             

        
        
        preparedStatement=conn.prepareStatement( "INSERT INTO members ( fname, lname, gender,dob,hometown,number,job,"
                + "                               childrenNumber,maritalStatus,dadName,momName,dateOfBapt,baptizim,spouse,placeOfBapt,zone,location,picture)"
                + "                               VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
      
         preparedStatement.setString(1, fName);
         preparedStatement.setString(2, lName);
         preparedStatement.setString(3, gender);
         preparedStatement.setString(4, dob);
         preparedStatement.setString(5, hTown);
         preparedStatement.setString(6, num);
         preparedStatement.setString(7, job);
         preparedStatement.setString(8, childNum);
         preparedStatement.setString(9, status);
         preparedStatement.setString(10, faName);
         preparedStatement.setString(11, mName);
         preparedStatement.setString(12, dobp);
         preparedStatement.setString(13, bapt);
         preparedStatement.setString(14, spName);
         preparedStatement.setString(15, place);
         preparedStatement.setString(16, zones);
         preparedStatement.setString(17, loca);
         preparedStatement.setBinaryStream(18, (InputStream)fin,(int)image.length());
         
         return preparedStatement.execute();
         
         }else{
               preparedStatement=conn.prepareStatement( "INSERT INTO members ( fname, lname, gender,dob,hometown,number,job,"
                + "                               childrenNumber,maritalStatus,dadName,momName,dateOfBapt,baptizim,spouse,placeOfBapt,zone,location)"
                + "                               VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
      
         preparedStatement.setString(1, fName);
         preparedStatement.setString(2, lName);
         preparedStatement.setString(3, gender);
         preparedStatement.setString(4, dob);
         preparedStatement.setString(5, hTown);
         preparedStatement.setString(6, num);
         preparedStatement.setString(7, job);
         preparedStatement.setString(8, childNum);
         preparedStatement.setString(9, status);
         preparedStatement.setString(10, faName);
         preparedStatement.setString(11, mName);
         preparedStatement.setString(12, dobp);
         preparedStatement.setString(13, bapt);
         preparedStatement.setString(14, spName);
         preparedStatement.setString(15, place);
         preparedStatement.setString(16, zones);
         preparedStatement.setString(17, loca);
       
             
             return preparedStatement.execute();
         }
         
         
         
         
     }
     
    
    
     public HomeController() throws SQLException, ClassNotFoundException {
        conn = ConnectionDB.conDB();
        

    }
   
     @FXML
    private Label lbErrorLabel;
     
    private String login() throws SQLException{
        
        String username = txtUsername.getText();
        String pass = txtPassword.getText();
        
        String sql = "SELECT * FROM user Where username = ? and password = ?";
        
       
         preparedStatement = conn.prepareStatement(sql);
         preparedStatement.setString(1, username);
         preparedStatement.setString(2, pass);
         
         resultSet= preparedStatement.executeQuery();
         
         if(!resultSet.next()){
             lbError.setTextFill(Color.TOMATO);
             lbError.setText("Enter Valid Username/Password");
                return "Error";            
         }else {             
             return "Success";
         }
       
       
    }
    
    private int male() throws SQLException{
        
        String sql = "SELECT gender FROM members Where gender = ? ";
        
       
         preparedStatement = conn.prepareStatement(sql);
         preparedStatement.setString(1, "MALE");
         
         resultSet= preparedStatement.executeQuery();
         
         if(!resultSet.next()){
            
                return 0;            
         }else {            

              int c=1;
            while(resultSet.next()){
                c++;
            }
           
             return c;
         }
        
    }
    
    private int female() throws SQLException{
        
        String sql = "SELECT gender FROM members Where gender = ? ";
        
       
         preparedStatement = conn.prepareStatement(sql);
         preparedStatement.setString(1, "FAMALE");
         
         resultSet= preparedStatement.executeQuery();
         
         if(!resultSet.next()){
                return 0;            
         }else {            
           
             int c=1;
            while(resultSet.next()){
                c++;
            }
           
             return c;
         }
        
    }
     
    private int totalMem() throws SQLException{
        
        String sql = "SELECT * FROM members";
        
        
       
         preparedStatement = conn.prepareStatement(sql);

         resultSet= preparedStatement.executeQuery();
         
         if(!resultSet.next()){
           
                return 0;            
         }else {            

               int c=1;
            while(resultSet.next()){
                c++;
            }
          //  System.out.println(c);           
             return c;
         }
        
    }
      
    private int present() throws SQLException{
        presentId.clear();
        
        String sql = "SELECT * FROM attendance Where attendance = ? AND date =? ";
        
       
         preparedStatement = conn.prepareStatement(sql);
         preparedStatement.setString(1, "PRESENT");
          preparedStatement.setString(2, todayDate());
         
         resultSet= preparedStatement.executeQuery();
         
         
         
         if(!resultSet.next()){
                return 0;            
         }else {            
       
           int c=1;
            while(resultSet.next()){
                
                presentId.add(resultSet.getInt("id"));
//                
                c++;
            }
           
             return c;
         }
        
    }
    
     void indexOfAb(int i) throws SQLException{
        
        
          preparedStatement=conn.prepareStatement( "INSERT INTO indexofpre ( id, idNum) VALUES (?,?)");
       
         preparedStatement.setInt(1,1);
         preparedStatement.setInt(2,absentId.get(i));
         
         presentId.remove(i);
         //preparedStatement.setInt(2, presentId.get(i));
         
            boolean r;
         r=preparedStatement.execute();
        
        
    }
    
    void indexOfPre(int i) throws SQLException{
        
        
          preparedStatement=conn.prepareStatement( "INSERT INTO indexofpre ( id, idNum) VALUES (?,?)");
       
         preparedStatement.setInt(1,1);
         preparedStatement.setInt(2,presentId.get(i));
         
         presentId.remove(i);
         //preparedStatement.setInt(2, presentId.get(i));
         
            boolean r;
         r=preparedStatement.execute();
        
        
    }
    
    private int absent() throws SQLException{
        absentId.clear();
        
        String sql = "SELECT * FROM attendance Where attendance = ? AND date =? ";
        
       
         preparedStatement = conn.prepareStatement(sql);
         preparedStatement.setString(1, "ABSENT");
         preparedStatement.setString(2, todayDate());
         
         resultSet= preparedStatement.executeQuery();
         
         if(!resultSet.next()){
                return 0;            
         }else {            
       
          int c=1;
            while(resultSet.next()){
                absentId.add(resultSet.getInt("id"));
                c++;
            }
           
             return c;
         }
        
    }
    
    List<Integer>zoneId=new ArrayList();
    
    void indexOfZone(int i) throws SQLException{
        
      
          preparedStatement=conn.prepareStatement( "INSERT INTO indexOfZone ( id, idNum) VALUES (?,?)");
       
         preparedStatement.setInt(1,i);
         preparedStatement.setInt(2, zoneId.get(i));
         
            boolean r;
         r=preparedStatement.execute();
        
    }
    
    int zoneMemNum(int k) throws SQLException{
         zoneId.clear();
         String sql ="SELECT * FROM zone WHERE id=?";
         
         preparedStatement = conn.prepareStatement(sql);
         preparedStatement.setInt(1, k);

        resultSet= preparedStatement.executeQuery();
        
        if(resultSet.next()){            
        String newSql= "SELECT * FROM members where zone =?";
        preparedStatement= conn.prepareStatement(newSql);
        preparedStatement.setString(1, resultSet.getString("name"));
        
        resultSet= preparedStatement.executeQuery();
           if(!resultSet.next()){
           
                return 0;            
           } else {            

               int c=1;
            while(resultSet.next()){
                zoneId.add(resultSet.getInt("id"));
                c++;
                
            }
                    
             return c;
             
           }
           
        
     }else{
            return 0;
        }
    }
    
    int indexZone;
     int zoneNum() throws SQLException{
         
          
         
         String sql ="SELECT * FROM zone";
         
         preparedStatement = conn.prepareStatement(sql);

        resultSet= preparedStatement.executeQuery();
           if(!resultSet.next()){
           
                return 0;            
         }else {            

               int c=1;
            while(resultSet.next()){
                c++;
            }                   
             return c;
         }
     }    
    
       
      
         @FXML
       private DatePicker dtAdddobp;
         
           @FXML
       private DatePicker dtAdddob;
           
            @FXML
       private TextField txtAddGender;
              @FXML
       private Label txtAddMessage;
       
              @FXML
       private ImageView imgAddPic;
            
        
    
   private void addMember() throws SQLException{
             
        
         boolean r;
         r=checkForImage();
         
         
         if(!r){
            txtAddMessage.setTextFill(Color.GREEN);
             txtAddMessage.setText("Succesfully added new Member");
                           
         }else {      
             
              txtAddMessage.setTextFill(Color.TOMATO);
             txtAddMessage.setText("Unable to add new Member");
             
         }
       
   }
   
   private void imageAdd(final Stage stage){
       
       imgAddPic.setOnMouseClicked(event -> {
       
           FileChooser chooser = new FileChooser();
           File file = chooser.showOpenDialog(stage);
           
           if(file != null){
               String fileAsString = file.toString();
               
           }
       });
       
   }
   
               
  //Method to clear all text feilds and date picker
   
   void clearSpace(){
       txtAddBapt.clear();
       txtAddChildNum.clear();
       txtAddChurchPo.clear();
       txtAddFarherName.clear();
       txtAddGender.clear();
       txtAddHT.clear();
       txtAddLocation.clear();
       txtAddMari.clear();
       txtAddMotherName.clear();
       txtAddNum.clear();
       txtAddOccu.clear();
       txtAddSpName.clear();
       txtAddZone.clear();
       txtAddfname.clear();
       txtAddlname.clear();
       txtAddpob.clear();
       txtEditBapt.clear();
       txtEditChildNum.clear();
       txtEditChurchPo.clear();
       txtEditFarherName.clear();
       txtEditGender.clear();
       txtEditHT.clear();
       txtEditLocation.clear();
       txtEditMarri.clear();
       txtEditMotherName.clear();
       txtEditNum.clear();
       txtEditOccu.clear();
       txtEditOccu.clear();
       txtEditSpName.clear();
       txtEditZone.clear();
       txtEditfname.clear();
       txtEditlname.clear();
       txtEditpob.clear();
       dtAdddobp.setValue(null);
       dtAdddobp.setValue(null);
       dtDOB.setValue(null);
       dtDOBp.setValue(null);
       txtEditPic.setImage(null);
       
   }
       
    String todayDate(){
         DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        Date dated = new Date();
         
        String dat;
        
        dat = date.format(dated);
        
        return dat;
    }
    
    int zoneFemMem(int k) throws SQLException{
        
        String sql ="SELECT * FROM zone WHERE id=?";
         
         preparedStatement = conn.prepareStatement(sql);
         preparedStatement.setInt(1, k);

        resultSet= preparedStatement.executeQuery();
        
        if(resultSet.next()){            
       String newSql= "SELECT * FROM members where zone =? AND gender=?";
        preparedStatement= conn.prepareStatement(newSql);
        preparedStatement.setString(1, resultSet.getString("zone"));
        preparedStatement.setString(2, "FEMALE");
        
        resultSet= preparedStatement.executeQuery();
           if(!resultSet.next()){
           
                return 0;            
           } else {            

               int c=1;
            while(resultSet.next()){
                c++;
            }
                    
             return c;
             
           }
           
        
     }else{
            return 0;
        }
    }
    
    int zoneMalMem(int k) throws SQLException{
        
        String sql ="SELECT * FROM zone WHERE id=?";
         
         preparedStatement = conn.prepareStatement(sql);
         preparedStatement.setInt(1, k);

        resultSet= preparedStatement.executeQuery();
        
        if(resultSet.next()){            
        String newSql= "SELECT * FROM members where zone =? AND gender=?";
        preparedStatement= conn.prepareStatement(newSql);
        preparedStatement.setString(1, resultSet.getString("zone"));
        preparedStatement.setString(2, "MALE");
        
        resultSet= preparedStatement.executeQuery();
           if(!resultSet.next()){
           
                return 0;            
           } else {            

               int c=1;
            while(resultSet.next()){
                c++;
            }
                    
             return c;
             
           }
           
        
     }else{
            return 0;
        }
    }
    
    
}
