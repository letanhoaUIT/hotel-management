/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class AccountController {
    public Connection getConnection() throws SQLException {
    String url = "jdbc:mysql://localhost:3306/qlks?useSSL=false";
    String username = "root";
    String password = "123456";

    return DriverManager.getConnection(url, username, password);
}
    
    public boolean checkLogin(String username, String password) {
    String sql = "SELECT * FROM tai_khoan WHERE username = ? AND password = ?";
    try (Connection conn = getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, username);
        stmt.setString(2, password);
        ResultSet rs = stmt.executeQuery();
        return rs.next(); // Trả về true nếu tìm thấy tài khoản, ngược lại trả về false.
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}
}
