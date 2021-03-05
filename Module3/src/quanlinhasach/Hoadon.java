package quanlinhasach;

import java.util.Date;

public class Hoadon
{
    protected String mahoadon,makh,masp;
    protected Long soluong;
    protected Date ngaymua;
    protected Float tongtien;

    public String getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(String mahoadon) {
        this.mahoadon = mahoadon;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public Long getSoluong() {
        return soluong;
    }

    public void setSoluong(Long soluong) {
        this.soluong = soluong;
    }

    public Date getNgaymua() {
        return ngaymua;
    }

    public void setNgaymua(Date ngaymua) {
        this.ngaymua = ngaymua;
    }

    public Float getTongtien() {
        return tongtien;
    }

    public void setTongtien(Float tongtien) {
        this.tongtien = tongtien;
    }

    public Float getDongia() {
        return dongia;
    }

    public void setDongia(Float dongia) {
        this.dongia = dongia;
    }

    public Hoadon(String mahoadon, String makh, String masp, Long soluong, Date ngaymua, Float tongtien, Float dongia) {
        this.mahoadon = mahoadon;
        this.makh = makh;
        this.masp = masp;
        this.soluong = soluong;
        this.ngaymua = ngaymua;
        this.tongtien = tongtien;
        this.dongia = dongia;
    }

    protected Float dongia;



}
