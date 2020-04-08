
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


public class ZoneController implements Initializable {

       @FXML
    private HBox hboxDash;

    @FXML
    private ImageView lbZonePict;

    @FXML
    private Label lbZoneName;

    @FXML
    private Label lbZonePosition;

    @FXML
    private Label lbZoneNum;

    @FXML
    private Label lbZoneGender;
    
     public Connection connn() throws SQLException, ClassNotFoundException {
        conn = ConnectionDB.conDB();
        return conn;

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
           try {
               // TODO

               zone();
           } catch (SQLException | ClassNotFoundException | IOException ex) {
               Logger.getLogger(ZoneController.class.getName()).log(Level.SEVERE, null, ex);
           }
    }    
    
      
    Connection conn = null;
    PreparedStatement preparedStatement = null;
    PreparedStatement preparedStatement1 = null;
    ResultSet resultSet = null;
    ResultSet resultSet2 = null;
    Statement stat = null;
    
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
    
    public void zone() throws SQLException, ClassNotFoundException, IOException{
        
           
         int index=Integer.parseInt(select());
         String sql ="SELECT * FROM name WHERE zone =? AND id=?";
         
         preparedStatement = connn().prepareStatement(sql);
         preparedStatement.setString(1,"");
         preparedStatement.setInt(2, index);
        
        
        
        resultSet= preparedStatement.executeQuery();
        
        if(resultSet.next()){
            lbZoneName.setText(resultSet.getString("fname")+resultSet.getString("lname"));
            lbZoneGender.setText(resultSet.getString("gender"));
             lbZoneNum.setText(resultSet.getString("number"));
              lbZonePict.setImage(imageDisplay(resultSet));
            
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
    
}
