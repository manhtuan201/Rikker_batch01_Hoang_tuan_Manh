package quanlinhasach;

import java.io.Serializable;
import java.sql.Date;
import java.time.Year;

public class Sach extends Sanpham implements Serializable {
    protected String nhaxb, tacgia;
    protected Year namxb;
    protected Date ngayxb;
    protected int lantb;

    public Sach(String masp, String tensp, int soluong, int dongia, String nhaxb, Year namxb, String tacgia, java.util.Date ngayxb, int lantb) {

    }

    public Sach(String masp, String tensp, int soluong, int dongia, String thuocdanhmuc, String nhaxb, String tacgia, Year namxb, Date ngayxb, int lantb) {
        super(masp, tensp, soluong, dongia, thuocdanhmuc);
        this.nhaxb = nhaxb;
        this.tacgia = tacgia;
        this.namxb = namxb;
        this.ngayxb = ngayxb;
        this.lantb = lantb;
    }


    public String getNhaxb() {
        return nhaxb;
    }

    public void setNhaxb(String nhaxb) {
        this.nhaxb = nhaxb;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public Year getNamxua() {
        return namxb;
    }

    public void setNamxb(Year namxb) {
        this.namxb = namxb;
    }

    public Date getNgayxb() {
        return ngayxb;
    }

    public void setNgayxb(Date ngayxb) {
        this.ngayxb = ngayxb;
    }

    public int getLantb() {
        return lantb;
    }

    public void setLantb(int lantb) {
        this.lantb = lantb;
    }


    public Sach(String nhaxb, String tacgia, Year namxb, Date ngayxb, int lantb) {

        this.nhaxb = nhaxb;
        this.tacgia = tacgia;
        this.namxb = namxb;
        this.ngayxb = ngayxb;
        this.lantb = lantb;
    }

    @Override
    public void HienThiThongTin() {
        System.out.println("Nha xuat ban :" + nhaxb);

    }

    @Override
    public void PhanTramGiamGia(String loaikh) {
        switch (loaikh) {
            case "Thuong":
                System.out.println("giam gia 2 %");
                break;
            case "Vip1":
                System.out.println("giam gia 5 %");
                break;
            case "Vip2":
                System.out.println("giam gia 7 %");
                break;
            default:
                System.out.println("Khong thuoc loai khach hang duoc giam gia");
        }
    }
}

