package quanlinhasach;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        sachmanagertask2 sachmanagertask2 = new sachmanagertask2();
        int maspid;
        showMenu();

    while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    sachmanagertask2.add();
                    break;
                case "2":
                    sachmanagertask2.show();
                    break;

                case "0":
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;
            }
            // show menu
            showMenu();
        }
    }

    private static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add Sach.");
        System.out.println("2. Show sach .");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");

    }
}

