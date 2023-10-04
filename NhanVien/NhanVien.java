/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

/**
 *
 * @author User
 */
public class NhanVien {
    private int maNV;
    private String tenNV;
    private String dienThoai;
    private String diaChi;
    private int maCV;
    private float Luong;

    public NhanVien(){
        
    }

    public NhanVien(int maNV, String tenNV, String dienThoai, String diaChi, int maCV, float Luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.dienThoai = dienThoai;
        this.diaChi = diaChi;
        this.maCV = maCV;
        this.Luong = Luong;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
   

    public int getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public int getMaCV() {
        return maCV;
    }

    public float getLuong() {
        return Luong;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public void setMaCV(int maCV) {
        this.maCV = maCV;
    }

    public void setLuong(float Luong) {
        this.Luong = Luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", tenNV=" + tenNV + ", dienThoai=" + dienThoai + ", maCV=" + maCV + ", Luong=" + Luong + '}';
    }
    
}
