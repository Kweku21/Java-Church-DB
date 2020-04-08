
package churchdb.controllers;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import databse.ConnectionDB;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import javax.imageio.ImageIO;



public class DashController implements Initializable{
    
     @FXML
    private ImageView lbDashPict;

    @FXML
    private Label lbDashName;

    @FXML
    private Label lbDash;

    @FXML
    private Label lbDashZone;

    @FXML
    private HBox index;

    @FXML
    private Label lbDashNum;

    @FXML
    private Label lbDashDOB;

    @FXML
    private Label lbDashGen;
    

   

    
    public Connection connn() throws SQLException, ClassNotFoundException {
        conn = ConnectionDB.conDB();
        return conn;

    }
 
     @Override
    public void initialize(URL url, ResourceBundle rb)  {
         
          try {
              dashName();
          } catch (SQLException | ClassNotFoundException ex) {
              Logger.getLogger(DashController.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) {
             Logger.getLogger(DashController.class.getName()).log(Level.SEVERE, null, ex);
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
     
     public void update(int i) throws SQLException, ClassNotFoundException{
         
         String sql = "UPDATE indexof SET id =1 WHERE idNum=?";
         
        preparedStatement = connn().prepareStatement(sql);

        preparedStatement.setInt(1, i);
       //  preparedStatement.setInt(2, i);
          boolean r;
         
             r=preparedStatement.execute();
       // resultSet= preparedStatement.executeQuery();
        
        if(!r){
            System.out.println("Updated");
        }else{
            System.out.println("Didnt");
        }

    
         
         
     }
     
     
    public void dashName() throws SQLException, ClassNotFoundException, IOException{
      //  HomeController home= new HomeController();
        
         //resultSet= preparedStatement.executeQuery();
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
        
        lbDashName.setText(name);
        lbDashGen.setText(resultSet.getString("gender"));
        lbDashDOB.setText(resultSet.getString("dob"));
        lbDashNum.setText(resultSet.getString("number"));
        lbDashZone.setText(resultSet.getString("zone"));
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
    
}
