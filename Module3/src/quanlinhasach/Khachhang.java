package quanlinhasach;

import java.util.Date;

public class Khachhang {
    protected String makh,hoten,sodth,email,loaikh;
    protected Date ngaysinh;

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSodth() {
        return sodth;
    }

    public void setSodth(String sodth) {
        this.sodth = sodth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoaikh() {
        return loaikh;
    }

    public void setLoaikh(String loaikh) {
        this.loaikh = loaikh;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public Khachhang(String makh, String hoten, String sodth, String email, String loaikh, Date ngaysinh) {
        this.makh = makh;
        this.hoten = hoten;
        this.sodth = sodth;
        this.email = email;
        this.loaikh = loaikh;
        this.ngaysinh = ngaysinh;
    }
}
