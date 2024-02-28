/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author ACER
 */

public class DatabaseHelper {
    public static Connection getDBConnect(){
    
    try(
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/quanlibanhang", "root", "29022003");
            Statement stmt = conn.createStatement();) {          
            String SQL = "SELECT * FROM hanghoa"; 
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                System.out.println(rs.getString("MASP") + " " + rs.getString("TenSP")+ " " + rs.getString("Dongia"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    Connection conn = null;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }catch (Exception e){
            System.out.println("Chưa có Driver!" + e.toString());
        }
    try{
        conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/quanlibanhang", "root", "29022003");
        return conn;
    }catch (Exception e){
    System.out.println("Lỗi Connect"+ e.toString());
    }
        return null;
        
    }
    
}
