/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author 91844
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try
        {
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/tiya ");
            return con;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
        
    }
    
}
