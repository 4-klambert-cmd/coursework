/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 4-klambert
 */
public class databaseconnection {
    public static Connection ConnectDatabase(){
                
        String url = "jdbc:mysql://185.156.138.148/4-klambert";
        String user = "4-klambert";
        String password = "Duty3-Palace-Area";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        } catch (Exception e){
            // stack trace shows errors
            e.printStackTrace();
            System.out.println("driver instance not successful");
            return null;
        }
        Connection myconnection = null;
        try {
            myconnection = DriverManager.getConnection(url, user, password);
            System.out.println("connection good");
            return myconnection;
        } catch (SQLException ex){
            // stack trace shows errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            System.out.println("connection not successful");
            return null;
        }
    }
}
