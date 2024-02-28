/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import database.DatabaseHelper;
import java.sql.Connection;
import java.util.List;
import models.Student;
import models.StudentDAO;
/**
 *
 * @author ACER
 */
public class TestDB {
   public static void main(String[] arg){
       Connection conn = DatabaseHelper.getDBConnect();
       StudentDAO dao = new StudentDAO();
       if (conn != null) {
           System.out.println("connect thanh cong ");
           //add 
           Student st1 = new Student("TPPP","Kẹo ngọt", "100");
           dao.add(st1);
           // Sửa
//           dao.update(st1);
//            Student st2 = new Student("HP1");
//            dao.delete(st2);
//                for (Student st : dao.getAll()){
//                    System.out.println(st.toString());
//                }
//                List<Student> find = dao.findStudentByID("TP1");
//                if(find != null){
//                    System.out.println("tim thay");
//                    System.out.println(find.toString());
//                }
       }else {
           System.out.println("connect that bai");
       }
   }
}
