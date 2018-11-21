/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsimulator;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author lokesh
 */
public class Connections {
    
    public Connection con=null;
    String path=null;    
    String p=null;  
    

        
    public Connection setConnection() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, IOException{
           try {
                    path = new File(".").getCanonicalPath();
               } catch (IOException ex) {
                                                 Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
                                        }
           
              p="jdbc:sqlite:"+path+"\\ATM.db";
             Class.forName("org.sqlite.JDBC");
                con=DriverManager.getConnection(p);
       
      return con;
    }
 
}
