package quanlinhasach;

import java.io.Serializable;

public abstract class Sanpham implements Serializable {


    public Sanpham() {

    }
    protected String masp,tensp;
    protected int soluong;

    public Sanpham(String masp, String tensp, int soluong, int dongia, String thuocdanhmuc) {
        this.masp = masp;
        this.tensp = tensp;
        this.soluong = soluong;
        this.dongia = dongia;
        this.thuocdanhmuc = thuocdanhmuc;
    }

    protected int dongia;
    protected String thuocdanhmuc;


    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public String getThuocdanhmuc() {
        return thuocdanhmuc;
    }

    public void setThuocdanhmuc(String thuocdanhmuc) {
        this.thuocdanhmuc = thuocdanhmuc;
    }
   @Override
    public String toString() {
        return "Sanpham{" +
                "masp='" + masp + '\'' +
                ", tensp='" + tensp + '\'' +
                ", soluong=" + soluong +
                ", dongia=" + dongia +
                ", thuocdanhmuc='" + thuocdanhmuc + '\'' +
                '}';
    }
    public abstract void HienThiThongTin();
    public abstract void PhanTramGiamGia(String LoaiKh);
}
