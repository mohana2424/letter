/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package post;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MOHANA.J
 */
public class script {
    public int insert(String qry) throws SQLException{
        Connection con;
        Statement st;
        dbconnect db=new dbconnect();
        con=db.connect();
        String sql=qry;
        st=con.createStatement();
        int i=st.executeUpdate(sql);
        return i;
        
    }
    
}
