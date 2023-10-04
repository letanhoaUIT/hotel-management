/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TEMPLATE;
import login.LoginView;
import HoaDon.HoaDonJF;
import QuanLiKhachHang.KhachHangJF;
import QuanLiNhanVien.NhanVienJF;
import QuanLiPhong.PhongJF;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import HoaDon.HoaDonJF;
import QuanLiKhachHang.KhachHangJF;
import QuanLiNhanVien.NhanVienJF;
import QuanLiPhong.PhongJF;
import login.AccountController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
/**
 *
 * @author ASUS
 */
public class template extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */

    LoginView login;
    public template() {
        initComponents();
        login = new LoginView();

    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnNV = new javax.swing.JButton();
        btnKH = new javax.swing.JButton();
        btnPhong = new javax.swing.JButton();
        btnHoaDon = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        labelChucvu = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setForeground(new java.awt.Color(51, 102, 255));
        jPanel4.setLayout(null);

        btnNV.setBackground(new java.awt.Color(0, 0, 0));
        btnNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNV.setForeground(new java.awt.Color(255, 255, 255));
        btnNV.setText("Nhân viên");
        btnNV.setPreferredSize(new java.awt.Dimension(121, 40));
        btnNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNVActionPerformed(evt);
            }
        });
        jPanel4.add(btnNV);
        btnNV.setBounds(0, 170, 160, 40);

        btnKH.setBackground(new java.awt.Color(0, 0, 0));
        btnKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnKH.setForeground(new java.awt.Color(255, 255, 255));
        btnKH.setText("Khách hàng");
        btnKH.setPreferredSize(new java.awt.Dimension(121, 40));
        btnKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKHActionPerformed(evt);
            }
        });
        jPanel4.add(btnKH);
        btnKH.setBounds(0, 210, 160, 40);

        btnPhong.setBackground(new java.awt.Color(0, 0, 0));
        btnPhong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPhong.setForeground(new java.awt.Color(255, 255, 255));
        btnPhong.setText("Quản lí phòng");
        btnPhong.setPreferredSize(new java.awt.Dimension(121, 40));
        btnPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhongActionPerformed(evt);
            }
        });
        jPanel4.add(btnPhong);
        btnPhong.setBounds(0, 250, 160, 40);

        btnHoaDon.setBackground(new java.awt.Color(0, 0, 0));
        btnHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        btnHoaDon.setText("Hóa đơn");
        btnHoaDon.setPreferredSize(new java.awt.Dimension(121, 40));
        btnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });
        jPanel4.add(btnHoaDon);
        btnHoaDon.setBounds(0, 290, 160, 40);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Đăng xuất");
        jButton5.setPreferredSize(new java.awt.Dimension(121, 40));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5);
        jButton5.setBounds(0, 330, 160, 40);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Chức vụ:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 30, 70, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Username:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 10, 60, 16);

        labelUsername.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(255, 204, 0));
        labelUsername.setText("jLabel3");
        jPanel2.add(labelUsername);
        labelUsername.setBounds(60, 10, 90, 16);

        labelChucvu.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        labelChucvu.setForeground(new java.awt.Color(255, 204, 0));
        labelChucvu.setText("jLabel6");
        jPanel2.add(labelChucvu);
        labelChucvu.setBounds(50, 30, 80, 20);

        jPanel4.add(jPanel2);
        jPanel2.setBounds(1, 7, 160, 70);

        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HOTEL MANAGEMENT");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(100, -50, 370, 170);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\downloads\\anime.jpg")); // NOI18N
        jLabel1.setText("Hotel Management");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(-140, 0, 610, 400);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKHActionPerformed
        KhachHangJF kh = new KhachHangJF();
        kh.setVisible(true);
    }//GEN-LAST:event_btnKHActionPerformed

    private void btnNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNVActionPerformed
        NhanVienJF nv = new NhanVienJF();
        nv.setVisible(true);
    }//GEN-LAST:event_btnNVActionPerformed

    private void btnPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhongActionPerformed

        PhongJF phong = new PhongJF();
        phong.setVisible(true);
    }//GEN-LAST:event_btnPhongActionPerformed

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
  
        
        HoaDonJF hd = new HoaDonJF();
        hd.setVisible(true);
    }//GEN-LAST:event_btnHoaDonActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed



    public void setLabelChucvu(String labelChucvu) {
        this.labelChucvu.setText(labelChucvu);
    }

    public void setLabelUsername(String labelUsername) {
        this.labelUsername.setText(labelUsername);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(template.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(template.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(template.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(template.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new template().setVisible(true);
            }
        });
    }
//add comment
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnKH;
    private javax.swing.JButton btnNV;
    private javax.swing.JButton btnPhong;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelChucvu;
    private javax.swing.JLabel labelUsername;
    // End of variables declaration//GEN-END:variables


}
