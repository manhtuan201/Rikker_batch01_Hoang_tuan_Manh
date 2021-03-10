package riki.com.demo.Model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;
@Entity
@Component
public class Userproduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private String MaKhachHang;
    @Column
    private String TenKhachHang;
    @Column
    private String Email;
    @Column
    private int SoDienThoai;
    @Column
    private Date NgaySinh;
    @Column
    private String MaLoai;

    protected Userproduct(){

    }
    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        MaKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        TenKhachHang = tenKhachHang;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        SoDienThoai = soDienThoai;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(String maLoai) {
        MaLoai = maLoai;
    }
}
