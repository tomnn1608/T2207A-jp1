package session3;

import session2.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Mainclass {


    public static void main(String[] args) {
        ArrayList<Class> classes = new ArrayList<>();
            classes.add(new Class("Duc","12/03","435 Doi can","T2201A","0");
            classes.add(new Class("Duc","12/03","435 Doi Can","T2207A","1");
            classes.add(new Class("Duc","12/03","435 Doi Can","T2207A","2");
            classes.add(new Class("Duc","12/03","435 Doi Can","T2207A","3");
            classes.add(new Class("Duc","12/03","435 Doi Can","T2207A","4");
            classes.add(new Class("Duc","12/03","435 Doi Can","T2207A","5");
            classes.add(new Class("Duc","12/03","435 Doi Can","T2207A","6");
            classes.add(new Class("Duc","12/03","435 Doi Can","T2207A","7");
            classes.add(new Class("Duc","12/03","435 Doi Can","T2207A","8");
            classes.add(new Class("Duc","12/03","435 Doi Can","T2207A","9");

        for (int i = 0; i < classes.size(); i++) {
            System.out.println(classes.get(i));
            classes.get(i).baoCaoKetQua();
        }
        System.out.println("Danh sach hoc sinh gioi");
        for (int i = 0; i < classes.size(); i++) {
            classes.get(i).hocSinhGioi();
        }
        System.out.println("Danh sach hoc sinh diem thap");
        for (int i = 0; i < classes.size(); i++) {
            classes.get(i).hocSinhKem();
        }
        System.out.println("Sap xep diem trung binh");
        int [] arr = new int [args.length];
        int temp= arr[0];
        for (int i = 0; i < args.length-1; i++) {
            for (int j = 1; j < args.length; j++) {
                if (classes.get(i).getDiemTB() < classes.get(j).getDiemTB()) {

                }
            }
        }
    }
}

