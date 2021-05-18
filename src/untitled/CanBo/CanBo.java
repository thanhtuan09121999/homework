package CanBo;

public class CanBo {
    String name;
    boolean sex;
    double salari;
    String address;

    public CanBo(String name, boolean sex, double salari, String address) {
        this.name = name;
        this.sex = sex;
        this.salari = salari;
        this.address = address;
    }

    public CanBo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getSalari() {
        return salari;
    }

    public void setSalari(double salari) {
        this.salari = salari;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
