/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package post;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author MOHANA.J
 */
public class dbconnect {
    Connection con;
    public Connection connect()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mohana","root","");
            return con;
        }
        catch(Exception e){
            System.out.print(e);
            
        }
        return con;
    }
    
}
