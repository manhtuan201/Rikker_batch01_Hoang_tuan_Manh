package quanlinhasach;

public class Dodunghoctap extends Sanpham{
    protected String xuatxu,thuonghieu,nhacc,huongdansd,mausac,chatlieu;
    protected int kichthuoc;

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
    }

    public String getThuonghieu() {
        return thuonghieu;
    }

    public void setThuonghieu(String thuonghieu) {
        this.thuonghieu = thuonghieu;
    }

    public String getNhacc() {
        return nhacc;
    }

    public void setNhacc(String nhacc) {
        this.nhacc = nhacc;
    }

    public String getHuongdansd() {
        return huongdansd;
    }

    public void setHuongdansd(String huongdansd) {
        this.huongdansd = huongdansd;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getChatlieu() {
        return chatlieu;
    }

    public void setChatlieu(String chatlieu) {
        this.chatlieu = chatlieu;
    }

    public int getKichthuoc() {
        return kichthuoc;
    }

    public void setKichthuoc(int kichthuoc) {
        this.kichthuoc = kichthuoc;
    }

    public Dodunghoctap(String masp, String tensp, int soluong, int dongia, String thuocdanhmuc, String xuatxu, String thuonghieu, String nhacc, String huongdansd, String mausac, String chatlieu, int kichthuoc) {
        super(masp, tensp, soluong, dongia, thuocdanhmuc);
        this.xuatxu = xuatxu;
        this.thuonghieu = thuonghieu;
        this.nhacc = nhacc;
        this.huongdansd = huongdansd;
        this.mausac = mausac;
        this.chatlieu = chatlieu;
        this.kichthuoc = kichthuoc;
    }

    @Override
    public void HienThiThongTin() {

    }

    @Override
    public void PhanTramGiamGia(String LoaiKh) {

    }

}
