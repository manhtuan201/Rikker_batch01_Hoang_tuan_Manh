package quanlinhasach;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class sachmanagertask2 {
    public static Scanner scanner = new Scanner(System.in);
    private List<Sach> sachList;
    private sachdaotask2 sachdaotask2;

    public sachmanagertask2() {
        sachdaotask2 = new sachdaotask2();
        sachList = sachdaotask2.read();
    }

    public void add() {
//        int id = (sachList.size() > 0) ? (sachList.size() + 1) : 1;
//        System.out.println("sach id = " + id);
        String masp = inputmasp();
        String tensp = inputtensp();
        Integer soluong = inputsoluong();
        Integer dongia = inputdongia();
        String danhmuc = inputdanhmuc();
        String nhaxb = inputnhaxb();
        Year namxb = inputnamxb();
        String tacgia = inputtacgia();
        Date ngayxb = inputngayxb();
        Integer lantb = inputlantb();
        Sach sach = new Sach(masp, tensp, soluong, dongia, nhaxb, namxb, tacgia, ngayxb, lantb);
        sachList.add(sach);
        sachdaotask2.write(sachList);
    }




    public void show() {
        for (Sach sach : sachList) {
            System.out.format("%5s | ", sach.getMasp());
            System.out.format("%5s | ", sach.getTensp());
            System.out.format("%5d | ", sach.getSoluong());
            System.out.format("%5d | ", sach.getDongia());
            System.out.format("%5s", sach.getNhaxb());
            System.out.format("%5s", sach.getNamxua());
            System.out.format("%5s", sach.getTacgia());
            System.out.format("%5s", sach.getNgayxb());
            System.out.format("%5d \n", sach.getLantb());



        }
    }
    private String inputmasp() {
        System.out.print("Input  masp id: ");
        while (true) {
            try {
                String masp = ((scanner.nextLine()));
                return masp;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input sach id again: ");
            }
        }

    }

    private String inputtensp() {
        System.out.print("input ten san pham: ");
        return (scanner.nextLine());
    }
    private Integer inputsoluong() {

        System.out.print("Input so luong ");
        return Integer.parseInt(scanner.nextLine());
    }
    private int inputdongia() {

        System.out.print("Input don gia: ");
        return Integer.parseInt(scanner.nextLine());
    }

    private String inputdanhmuc() {
        System.out.print("Input danh muc: ");
        return scanner.nextLine();
    }
    private String inputnhaxb() {


        System.out.print("Input nha xuat ban: ");
        return scanner.nextLine();
    }

    private Year inputnamxb() {

        System.out.print("Input nam xuat ban: ");
        return Year.parse(scanner.nextLine());
    }
    private String inputtacgia() {

        System.out.print("Input tac gia: ");
        return scanner.nextLine();

            }
    private Date inputngayxb() {
        System.out.print("Input Ngay Xuat Ban: ");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        try {
            date = formatter.parse(scanner.nextLine());
        } catch (Exception e){}
        return date;
    }
    private Integer inputlantb() {
        System.out.print("Input lan tai ban: ");
        return Integer.parseInt(scanner.nextLine());
    }












    public List<Sach> getSachList() {
        return sachList;
    }

    public void setSachList(List<Sach> sachList) {
        this.sachList = sachList;
    }


        }






