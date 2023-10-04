/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyPhong;

/**
 *
 * @author User
 */
public class Phong {
    private int maPhong;
    private int maLP;
    private float donGia;
    private String tenPhong;
    private String trangThai;
    private int soNguoi_max;

    public Phong(int maPhong, int maLP, float donGia, String tenPhong, String trangThai, int soNguoi_max) {
        this.maPhong = maPhong;
        this.maLP = maLP;
        this.donGia = donGia;
        this.tenPhong = tenPhong;
        this.trangThai = trangThai;
        this.soNguoi_max = soNguoi_max;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public int getMaLP() {
        return maLP;
    }

    public float getDonGia() {
        return donGia;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public int getSoNguoi_max() {
        return soNguoi_max;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public void setMaLP(int maLP) {
        this.maLP = maLP;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public void setSoNguoi_max(int soNguoi_max) {
        this.soNguoi_max = soNguoi_max;
    }
    
    
    
}
