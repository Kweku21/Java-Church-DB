
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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javax.imageio.ImageIO;


public class AbsentController implements Initializable{
    
     @FXML
    private Label lbAttendName;

    @FXML
    private Label lbAbsentDate;

    @FXML
    private HBox hboxDash;

    @FXML
    private ImageView lbAbsentPict;

    @FXML
    private Label lbAbsentZone;

    
    Connection conn = null;
    PreparedStatement preparedStatement = null;
     PreparedStatement preparedStatement1 = null;
    ResultSet resultSet = null;
     ResultSet resultSet2 = null;
     Statement stat = null;
    
     public Connection connn() throws SQLException, ClassNotFoundException {
        conn = ConnectionDB.conDB();
        return conn;

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
         try {
             absent();
         } catch (SQLException ex) {
             Logger.getLogger(AbsentController.class.getName()).log(Level.SEVERE, null, ex);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(AbsentController.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(AbsentController.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
      public String select() throws SQLException, ClassNotFoundException{
        
     String sql = "SELECT idNum FROM indexofpre WHERE id =?";
     
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
    
     void absent() throws SQLException, ClassNotFoundException, IOException{
         
           String fname,lname,name;
         int ind = Integer.parseInt(select());
         
         String sql ="SELECT * FROM attendance WHERE attendance =?";
         
         preparedStatement = connn().prepareStatement(sql);

        preparedStatement.setString(1,"ABSENT");
        
        
        resultSet= preparedStatement.executeQuery();
        
        if(resultSet.next()){
        fname=resultSet.getString("fname");
        lname=resultSet.getString("lname");
        name=fname+" "+lname;
        
        lbAttendName.setText(name);
        lbAbsentDate.setText(todayDate());
        lbAbsentZone.setText(resultSet.getString("zone"));
         lbAbsentPict.setImage(imageDisplay(resultSet));
        
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
      
       String todayDate(){
         DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        Date dated = new Date();
         
        String dat;
        
        dat = date.format(dated);
        
        return dat;
    }
}
