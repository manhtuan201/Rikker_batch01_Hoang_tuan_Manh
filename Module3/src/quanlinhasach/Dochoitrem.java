package quanlinhasach;

public class Dochoitrem extends Sanpham{
    protected String xuatxu;

    public Dochoitrem(String masp, String tensp, int soluong,int dongia, String thuocdanhmuc, String xuatxu, String thuonghieu, String nhacc, String huongdansd) {
        super(masp, tensp, soluong, dongia, thuocdanhmuc);
        this.xuatxu = xuatxu;
        this.thuonghieu = thuonghieu;
        this.nhacc = nhacc;
        this.huongdansd = huongdansd;
    }

    protected String thuonghieu;

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

    protected String nhacc;
    protected String huongdansd;

    @Override
    public void HienThiThongTin() {

    }

    @Override
    public void PhanTramGiamGia(String LoaiKh) {
    }

}
