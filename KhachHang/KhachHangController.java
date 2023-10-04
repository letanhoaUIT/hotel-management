/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhachHang;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import KhachHang.KhachHangJFrame;


/**
 *
 * @author User
 */
public class KhachHangController {
    
//        KhachHangJFrame a = new KhachHangJFrame();



    public Connection getConnection() throws SQLException{
        // Thông tin kết nối đến cơ sở dữ liệu
        String url = "jdbc:mysql://localhost:3306/qlks"; 
        String username = "root";
        String password = "123456";

       return DriverManager.getConnection(url, username, password);
    }
  public void themThongTin(String MaKH, String TenKH, String GTinh, String CMND, String DCHi, String Qtich, String SoDT, String Email) {
      KhachHangJFrame a = new KhachHangJFrame();
      if (MaKH.isEmpty() || TenKH.isEmpty() || GTinh.isEmpty() || CMND.isEmpty() || DCHi.isEmpty() || Qtich.isEmpty() || SoDT.isEmpty() || Email.isEmpty()) {
        JOptionPane.showMessageDialog(a, "Vui lòng nhập đầy đủ thông tin Hoặc Kiểm Tra Lại Mã Khách Hàng Đã Tồn Tại Trong Hệ Thống", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String sql = "INSERT INTO Khach_Hang (MaKH, TenKH, GTinh, CMND, DCHi, Qtich, SoDT, Email) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    try (Connection conn = getConnection();
         PreparedStatement statement = conn.prepareStatement(sql)) {
        statement.setInt(1, Integer.parseInt(MaKH));
        statement.setString(2, TenKH); //
        statement.setString(3, GTinh);
        statement.setString(4, CMND);
        statement.setString(5, DCHi);
        statement.setString(6, Qtich);
        statement.setString(7, SoDT);
        statement.setString(8, Email);

        int rowsInserted = statement.executeUpdate();
               

        if (rowsInserted > 0) {
            System.out.println("Dữ liệu đã được chèn thành công!");
            JOptionPane.showMessageDialog(a , "Đã Thêm Khách Hàng Thành Công Vào Hệ Thống !");
        
         
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(a, "Vui lòng nhập đầy đủ thông tin Hoặc Kiểm Tra Lại Mã Khách Hàng Trong Hệ Thống", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
}
  public DefaultTableModel  xuatThongTin(int Ma){
       DefaultTableModel model = new DefaultTableModel();

    model.addColumn("MaKH");
    model.addColumn("GTinh");
    model.addColumn("TenKH");
    model.addColumn("CMND");
    model.addColumn("DCHi");
    model.addColumn("Qtich");
    model.addColumn("SoDT");
    model.addColumn("Email");
    
    
    // Thực hiện kết nối tới cơ sở dữ liệu
try {
    Connection conn = getConnection();
     String sql ="SELECT * FROM KHACH_HANG where makh =?";
     PreparedStatement stmt = conn.prepareStatement(sql);
     stmt.setInt(1, Ma);
     ResultSet resultSet =stmt.executeQuery();

    // Duyệt qua từng dòng dữ liệu từ ResultSet
    while(resultSet.next()) {
        
        Object[] row = {resultSet.getString("MaKH"),resultSet.getString("GTinh"),resultSet.getString("TenKH"),resultSet.getString("CMND"),resultSet.getString("DCHi"),
            resultSet.getString("Qtich"),resultSet.getString("sodt"),resultSet.getString("email")
        };
        
        
        // Thêm dòng vào model của JTable
        model.addRow(row);
        
    }
//    x.setModel(model);
} catch (SQLException ex) {
    ex.printStackTrace();
}
        return model;

  }
    }
    

       


