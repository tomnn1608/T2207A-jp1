package session1;

import java.util.Scanner;

public class Fractionmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Fraction ps1 = new Fraction();
        Fraction ps2 = new Fraction();
        Fraction psTong;
        Fraction psHieu;
        Fraction psThuong;
        Fraction psTich;



        System.out.println("Nhap du lieu cho phan so 1:");
        ps1.enterFrac(sc);
        System.out.println("Nhap du lieu cho phan so 2:");
        ps2.enterFrac(sc);


        System.out.println("Phan so 1 vua nhap la:");
        ps1.display();
        System.out.println("Phan so 2 vua nhap la:");
        ps2.display();


        psTong = ps1.add(ps2);

        psHieu = ps1.sub(ps2);

        psTich = ps1.mul(ps2);

        psThuong = ps1.div(ps2);


        System.out.println("Tong 2 phan so la:");
        psTong.display();
        System.out.println("Hieu 2 phan so la:");
        psHieu.display();
        System.out.println("Tich 2 phan so la:");
        psTich.display();
        System.out.println("Thuong 2 phan so la:");
        psThuong.display();

    }
}
