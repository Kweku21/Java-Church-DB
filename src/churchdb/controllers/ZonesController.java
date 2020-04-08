/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package churchdb.controllers;

import databse.ConnectionDB;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;


public class ZonesController implements Initializable {

   
     @FXML
    private Label lbZonesName;

    @FXML
    private Label lbZoneNum;

    @FXML
    private HBox hboxDash;
    
      
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
    public void initialize(URL url, ResourceBundle rb) {
         try {
             // TODO
             zones();
         } catch (SQLException ex) {
            
         } catch (ClassNotFoundException ex) {
            
         }
    }
    
       
     public String select() throws SQLException, ClassNotFoundException{
        
     String sql = "SELECT idNum FROM indexof WHERE id =?";
     
     preparedStatement = connn().prepareStatement(sql);

     preparedStatement.setInt(1, 1);
     
     resultSet=preparedStatement.executeQuery();
     
     
     if(resultSet.next()){
         
       delete();
       
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
        
        if(!r){
           
           
            
        }else{
           
        }

    
         
     }

  void zones() throws SQLException, ClassNotFoundException{
         
          
         int index=Integer.parseInt(select());
         String sql ="SELECT * FROM zone WHERE id =?";
         
         preparedStatement = connn().prepareStatement(sql);
         preparedStatement.setInt(1, index);
        
        
        
        resultSet= preparedStatement.executeQuery();
        
        if(resultSet.next()){
       
        
        lbZonesName.setText(resultSet.getString("name"));
        int number= zoneMemNum(index);
        
        if(number==0){
        lbZoneNum.setText("0");
        }else {
         lbZoneNum.setText(number+"");
        }
      
        
        }
     }
  
   int zoneMemNum(int k) throws SQLException{
 
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
                c++;
            }
                    
             return c;
             
           }
           
        
     }else{
            return 0;
        }
        //return 0;
    }
   
    
}
