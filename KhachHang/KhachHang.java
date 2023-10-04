/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KhachHang;

/**
 *
 * @author User
 */
public class KhachHang {
    private String maKH;
    private String gioiTinh;
    private String tenKH;
    private String CMND;
    private String diaCHi;
    private String quocTich;
    private String SDT;
    private String email;
    
    public KhachHang(){
        
    }
    public KhachHang(String maKH, String gioiTinh, String tenKH, String CMND, String diaCHi, String quocTich, String SDT, String email) {
        this.maKH = maKH;
        this.gioiTinh = gioiTinh;
        this.tenKH = tenKH;
        this.CMND = CMND;
        this.diaCHi = diaCHi;
        this.quocTich = quocTich;
        this.SDT = SDT;
        this.email = email;
    }

    

    
    public String getMaKH() {
        return maKH;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getCMND() {
        return CMND;
    }

    public String getDiaCHi() {
        return diaCHi;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public String getSDT() {
        return SDT;
    }

    public String getEmail() {
        return email;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public void setDiaCHi(String diaCHi) {
        this.diaCHi = diaCHi;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKH=" + maKH + ", gioiTinh=" + gioiTinh + ", tenKH=" + tenKH + ", CMND=" + CMND + ", diaCHi=" + diaCHi + ", quocTich=" + quocTich + ", SDT=" + SDT + ", email=" + email + '}';
    }
    
    
}
