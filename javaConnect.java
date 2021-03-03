/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaConnect {
    private static Connection con = null;
    public static Connection connectionDB(){
        try{
            String url = "jdbc:sqlite:temp.db";
            con = DriverManager.getConnection(url);
            return con;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return null;
    }
}
