/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyPhong;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



/**
 *
 * @author User
 */
public class QuanLyPhongController {
    
   // QuanLyPhongJFrame j = new QuanLyPhongJFrame();
    public Connection getConnection() throws SQLException{
        // Thông tin kết nối đến cơ sở dữ liệu
        String url = "jdbc:mysql://localhost:3306/qlks"; // Thay "your_database" bằng tên cơ sở dữ liệu của bạn
        String username = "root";
        String password = "123456";

       return DriverManager.getConnection(url, username, password);
   
    

}
  
}
        
        



    

