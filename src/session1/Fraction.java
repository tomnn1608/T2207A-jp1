package session1;

import java.util.Scanner;

public class Fraction {
    private int tuSo;
    private int mauSo;

    public Fraction() {
        tuSo = 0;
        mauSo = 1;
    }

    public Fraction(int tuSo, int mauSo) {
        if (mauSo == 0) {
            System.out.println("Mau so khong duoc bang 0");
            tuSo = 0;
            mauSo = 1;
        } else {
            this.tuSo = tuSo;
            this.mauSo = mauSo;
        }
    }

    public void enterFrac(Scanner sc) {
        int ts, ms;
        do {
            System.out.print("\tNhap vao tu so: ");
            ts = sc.nextInt();
            System.out.print("\tNhap vao mau so: ");
            ms = sc.nextInt();

            if (ms == 0) {
                System.out.println("Nhap lai thong tin cho phan so!");
            }
        } while (ms == 0);
        tuSo = ts;
        mauSo = ms;
    }

    public void display() {
        if (tuSo * mauSo < 0) {
            System.out.println("-" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
        } else {
            System.out.println(Math.abs(tuSo) + "/" + Math.abs(mauSo));
        }
    }
    public Fraction add(Fraction ps2) {
        int ts = tuSo * ps2.mauSo + ps2.tuSo * mauSo;
        int ms = mauSo * ps2.mauSo;
        return new Fraction(ts, ms);
    }

    public Fraction sub(Fraction ps2) {
        int ts = tuSo * ps2.mauSo - ps2.tuSo * mauSo;
        int ms = mauSo * ps2.mauSo;
        return new Fraction(ts, ms);
    }

    public Fraction mul(Fraction ps2) {
        int ts = tuSo * ps2.tuSo;
        int ms = mauSo * ps2.mauSo;
        return new Fraction(ts, ms);
    }

    public Fraction div(Fraction ps2) {
        int tg = ps2.tuSo;
        ps2.tuSo = ps2.mauSo;
        ps2.mauSo = tg;

        int ts = tuSo * ps2.tuSo;
        int ms = mauSo * ps2.mauSo;
        return new Fraction(ts, ms);
    }
}
