/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import database.DatabaseHelper;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ACER
 */
public class StudentDAO {
    Connection conn = null;
    PreparedStatement sttm = null;
    public int add (Student st){
        try{
            String sSQL = "insert HangHoa(MASP,TenSP,Dongia) values (?,?,?) ";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1,st.getMASP());
            sttm.setString(2,st.getTenSP());
            sttm.setString(3,st.getDongia());
            if(sttm.executeUpdate()>0){
                System.out.println("Insert thanh cong");
                return 1;
            }
        }catch (Exception e) {
            System.out.println("Lỗi" +e.toString());
        }
        return -1;
    }
    public int update (Student st){
        try{
            String sSQL = "update HangHoa set  TenSP = ?,Dongia= ? where MASP = ?";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(3,st.getMASP());
            sttm.setString(1,st.getTenSP());
            sttm.setString(2,st.getDongia());
            if(sttm.executeUpdate()>0){
                System.out.println("Update thanh cong");
                return 1;
            }
        }catch (Exception e) {
            System.out.println("Lỗi" +e.toString());
        }
        return -1;
    }
    public int delete (Student st){
        try{
            String sSQL = "delete HangHoa where MASP = ?";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1,st.getMASP());
            if(sttm.executeUpdate()>0){
                System.out.println("Delete thanh cong");
                return 1;
            }
        }catch (Exception e) {
            System.out.println("Lỗi" +e.toString());
        }
        return -1;
    }
    public List<Student> getAll(){
        List <Student> ls = new ArrayList <>();
        ResultSet rs = null;
        Statement sttm = null;
        try{
            String sSQL = "select * from hanghoa";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()){
                Student st = new Student();
                st.setMASP(rs.getString(1));
                st.setTenSP(rs.getString(2));
                st.setDongia(rs.getString(3));
                ls.add(st);
            }
        }catch (Exception e){
            System.out.println("Loi that bai" +e.toString());
        }
        finally{
        try{
            rs.close(); sttm.close();conn.close();
        }catch(Exception e){
        
        }
      }
        return ls;
    }
    public List<Student> findStudentByID(String MASP){
        ResultSet rs = null;
        Statement sttm = null;
        List<Student> ls = new ArrayList<>();
        try{
            String sSQL = "select * from hanghoa where MASP like '%"+MASP+"%'";
            conn = DatabaseHelper.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()){
                Student st = new Student();
                st.setMASP(rs.getString(1));
                st.setTenSP(rs.getString(2));
                st.setDongia(rs.getString(3));
                ls.add(st);
            }
        }catch (Exception e){
            System.out.println("Lỗiiiiiiiiiii" +e.toString());
        }
        finally{
        try{
            rs.close(); sttm.close();conn.close();
        }catch(Exception e){
        
        }
      }
        return ls;
    }
}
