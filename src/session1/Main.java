package session1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int x = 10;
        double y = 3.14;
        String s = "Hello";
        System.out.println("x= " + x);
        y = y + 20 * x;

        if (y > 100) {
            System.out.println("y= " + y);
        } else {
            System.out.println("x= " + x);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("i =" + i);
        }

        //tinh S = 1 + 1/2 + 1/3 + ... + 1/1000
        double S = 0;
        for (int i = 1; i <= 1000; i++) {
            S = S + (double) 1 / i;
        }
        System.out.println("S= " + S);

        //tinh S = 1 + 2 + 3 + ... + 1000
        float sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println("sum= " + sum);

        int z = tinhTong(10, 15);
        int z2 = tinhHieu(20, 10);
        int z3 = tinhTich(30, 10);
        int z4 = tinhThuong(20, 10);
        boolean t = true;

        //nhap 1 so nguyen tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so nguyen:");
        int n = sc.nextInt();

        System.out.println("Nhap 1 so thuc:");
        double d = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap 1 string:");
        String str = sc.nextLine();
        System.out.println("n: "+n);
        System.out.println("d: "+d);
        System.out.println("str: "+str);
    }

    static int tinhTong(int a, int b) {
        return a + b;
    }

    static int tinhHieu(int a, int b) {
        return a - b;
    }

    static int tinhTich(int a, int b) {
        return a * b;
    }

    static int tinhThuong(int a, int b) {
        return b == 0 ? null : a / b;
    }

}

