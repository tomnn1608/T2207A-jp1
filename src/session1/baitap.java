package session1;

import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //b1
        System.out.print("Nhap so nguyen= ");
        int n1 = scanner.nextInt();
        int kiemtra1 = songuyento(n1);
        if (kiemtra1 == 1) System.out.println((int) n1 + " la so nguyen to");
        else System.out.println(n1 + " khong phai la so nguyen to");

        //b2
        System.out.print("Nhap so nguyen= ");
        int n2 = scanner.nextInt();

        int kiemtra2 = sohoanhao(n2);

        if (kiemtra2 == 1) System.out.println(n2 + " la so hoan hao");
        else System.out.println(n2 + " khong phai la so hoan hao");

        //b3
        int n3;
        System.out.print("nhap so thu tu b can:");
        n3 = scanner.nextInt();
        for (int i = 0; i < n3; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        //b4
        System.out.print("Nhập số nguyên dương a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên dương b = ");
        int b = scanner.nextInt();

        System.out.println("USCLN của " + a + " và " + b
                + " là: " + USCLN(a, b));

        System.out.println("BSCNN của " + a + " và " + b
                + " là: " + BSCNN(a, b));
    }

    //b1
    private static int songuyento(int n1) {
        int socankiemtra = 1;
        if (n1 < 2)
            return socankiemtra = 0;
        int i = 2;
        while (i < n1) {
            if (n1 % i == 0) {
                socankiemtra = 0;
                break;
            }
            i++;
        }
        return socankiemtra;
    }


    //b2
    private static int sohoanhao(int n2) {

        int socankiemtra2 = 0, tong = 0;

        for (int i = 1; i < n2; i++) {
            if (n2 % i == 0)
                tong += i;
        }

        if (tong == n2 & n2 != 0)
            socankiemtra2 = 1;

        return socankiemtra2;
    }

    //b3
    public static int fibonacci(int n) {
        int so0 = 0;
        int so1 = 1;
        int soN = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                so0 = so1;
                so1 = soN;
                soN = so0 + so1;
            }
        }
        return soN;
    }

    //b4
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN( b, a%b);
    }

    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
}
