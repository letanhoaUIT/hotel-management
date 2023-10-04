/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoaDon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class HoaDonController {
        private HoaDonModel model = new HoaDonModel();
   
        
    
    public Connection getConnection() throws SQLException {
    String url = "jdbc:mysql://localhost:3306/qlks?useSSL=false";
    String username = "root";
    String password = "123456";

    return DriverManager.getConnection(url, username, password);
    }
    
    public HoaDonModel xuatThongTin(String soPhong){
        String sql = "SELECT * FROM PHONG JOIN CT_PDKY ON PHONG.MAPHONG=CT_PDKY.MAP JOIN KHACH_HANG ON KHACH_HANG.MAKH=CT_PDKY.MAKH join dvsudung on dvsudung.MaP = phong.maPhong JOIN DICHVU ON DICHVU.MADV = DVSUDUNG.MADV JOIN HOA_DON ON HOA_DON.MAKH = KHACH_HANG.MAKH JOIN CHITIET_HD ON CHITIET_HD.MAHD = HOA_DON.MAHD WHERE Maphong = ?";
        try (Connection conn = getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, soPhong);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()){
            model.setMaKH(rs.getString("MaKH")); 
            model.setNgayDen(rs.getString("Ngayden"));
            model.setNgayDi( rs.getString("Ngaydi"));
            model.setLoaiPhong(rs.getString("Tenphong")); 
            model.setTenKH(rs.getString("tenKH")); 
            model.setTenDV( rs.getString("TenDV"));
            model.setGiaDV(rs.getString("GiaDV")); 
             model.setGiaPhong(rs.getString("TienPhong")); 
            model.setThue(rs.getString("thue"));
            model.setNgaylap(rs.getString("ngaylap"));
            float total = Float.parseFloat(model.getGiaDV())+ Float.parseFloat(model.getGiaPhong())+Float.parseFloat(model.getGiaPhong())* Float.parseFloat(model.getThue());
            model.totolBill =String.valueOf(total);

        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
        return model;
    }
    
    
    
    
    
}
