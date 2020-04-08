
package churchdb.controllers;

import databse.ConnectionDB;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javax.imageio.ImageIO;


public class AttendController implements Initializable{
    
       @FXML
    private Label lbAttendName;

    @FXML
    private ImageView lbDashPict;

    @FXML
    private HBox hboxDash;

    @FXML
    private Label lbDashZone;

    @FXML
    private Label lbDashDOB;
    
    
    Connection conn = null;
    PreparedStatement preparedStatement = null;
     PreparedStatement preparedStatement1 = null;
    ResultSet resultSet = null;
     ResultSet resultSet2 = null;
     Statement stat = null;
     
    public void initialize(URL location, ResourceBundle resources) {
        
        lbDashDOB.setText(date());
           try {
               attend();
           } catch (SQLException | ClassNotFoundException | IOException ex) {
               Logger.getLogger(AttendController.class.getName()).log(Level.SEVERE, null, ex);
           }
        
       

    }
    
     public Connection connn() throws SQLException, ClassNotFoundException {
        conn = ConnectionDB.conDB();
        return conn;

    }
    
        public String select() throws SQLException, ClassNotFoundException{
        
     String sql = "SELECT idNum FROM indexof WHERE id =?";
     
     preparedStatement = connn().prepareStatement(sql);

     preparedStatement.setInt(1, 1);
     
     resultSet=preparedStatement.executeQuery();
     
     
     if(resultSet.next()){
       delete();
       //update(i);
     return resultSet.getString("idNum");
     
     
     }
     else{
         return"Error";
     }
     
    }
     
     public void delete() throws SQLException, ClassNotFoundException{
         
         String sql ="DELETE FROM indexof WHERE id =?";
         
          preparedStatement = connn().prepareStatement(sql);

        preparedStatement.setInt(1, 1);
          boolean r;
         
             r=preparedStatement.execute();
        //resultSet= preparedStatement.executeUpdate();
        
        if(!r){
          
           
            
        }else{
          
        }

    
         
     }
     
    
    public void attend() throws SQLException, ClassNotFoundException, IOException{
        
        String fname,lname,name;
         int ind = Integer.parseInt(select());
         
         String sql ="SELECT * FROM members WHERE id =?";
         
         preparedStatement = connn().prepareStatement(sql);

        preparedStatement.setInt(1,ind);
        
        
        resultSet= preparedStatement.executeQuery();
        
        if(resultSet.next()){
        fname=resultSet.getString("fname");
        lname=resultSet.getString("lname");
        name=fname+" "+lname;
        
        lbAttendName.setText(name);
         lbDashPict.setImage(imageDisplay(resultSet));
            
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
    
    public String date(){
        DateFormat df= new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String dd = df.format(date);
        System.out.println(dd);
        return dd;
    }
    
}
