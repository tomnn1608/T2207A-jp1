package session3;

import java.util.Date;

public class Class {
    private String name;
    private Date birthday;
    private String address;
    private String nameClass;
    private Double avgpoint;

    private int diemTB;


    public Class(String name,Date birthday, String address , String nameClass , Double avgpoint){
        this.name  = name;
        this.birthday = birthday;
        this.address = address;
        this.nameClass = nameClass;
        this.avgpoint = avgpoint;
        this.diemTB = diemTB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public Double getAvgpoint() {
        return avgpoint;
    }

    public void setAvgpoint(Double avgpoint) {
        this.avgpoint = avgpoint;
    }


    public int getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(int diemTB) {
        this.diemTB = diemTB;
    }
    public void baoCaoKetQua(){
        if(diemTB<5){
            System.out.println("Hoc sinh yeu");
        }else{
            if (diemTB<6.5){
                System.out.println("Hoc sinh trung binh");
            }
            else {
                if (diemTB<8){
                    System.out.println("Hoc sinh kha");
                }
                else {
                    System.out.println("Hoc sinh xuat sac");
                }
            }
        }
    }
    public void hocSinhGioi(){
        if(diemTB>=8){
            System.out.println(getHoTen());
        }
    }public void hocSinhKem(){
        if(diemTB<5){
            System.out.println(getHoTen());
        }
    }
}
