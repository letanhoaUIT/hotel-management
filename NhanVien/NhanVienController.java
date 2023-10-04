/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

//import KhachHang.KhachHangJFrame;
import NhanVien.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class NhanVienController {
    public Connection getConnection() throws SQLException{
        // Thông tin kết nối đến cơ sở dữ liệu
        String url = "jdbc:mysql://localhost:3306/qlks"; // Thay "your_database" bằng tên cơ sở dữ liệu của bạn
        String username = "root";
        String password = "123456";

       return DriverManager.getConnection(url, username, password);
    }
  public void themThongTinNhanVien(String MaNV, String TenNV,  String DCHi,  String SoDT, int MaCV, float Luong) {
      NhanVienJFrame a = new NhanVienJFrame();

    String sql = "INSERT INTO Nhan_Vien (MaVN, TenVN,  DiaCHi,  DienThoai, macv, Luong) VALUES (?, ?, ?, ?, ?, ?)";
    try (Connection conn = getConnection();
         PreparedStatement statement = conn.prepareStatement(sql)) {
        statement.setInt(1, Integer.parseInt(MaNV));
        statement.setString(2, TenNV); //
        statement.setString(3, DCHi);
        statement.setString(4, SoDT);
        statement.setInt(5, MaCV);
        statement.setFloat(6, Luong);
        

        int rowsInserted = statement.executeUpdate();
               

        if (rowsInserted > 0) {
            System.out.println("Dữ liệu đã được chèn thành công!");
            JOptionPane.showMessageDialog(a , "Đã Thêm Nhân Viên Thành Công Vào Hệ Thống !");
        
         
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(a, "Vui lòng nhập đầy đủ thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
}
  
   public DefaultTableModel  xuatThongTinNhanVien(int Ma){
       DefaultTableModel model = new DefaultTableModel();

    model.addColumn("MaVN");
    model.addColumn("TenVN");
    model.addColumn("DiaCHi");
    model.addColumn("DienThoai");
    model.addColumn("MaCV");
    model.addColumn("Luong");
   
    
    // Thực hiện kết nối tới cơ sở dữ liệu
try {
    Connection conn = getConnection();
     String sql ="SELECT * FROM Nhan_Vien where mavn =?";
     PreparedStatement stmt = conn.prepareStatement(sql);
     stmt.setInt(1, Ma);
     ResultSet resultSet =stmt.executeQuery();

    // Duyệt qua từng dòng dữ liệu từ ResultSet
    while(resultSet.next()) {
        
        Object[] row = {resultSet.getString("MaVN"),resultSet.getString("TenVN"),resultSet.getString("DiaChi"),resultSet.getString("Dien Thoai"),resultSet.getString("MaCV"),
            resultSet.getString("Luong")
            
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
