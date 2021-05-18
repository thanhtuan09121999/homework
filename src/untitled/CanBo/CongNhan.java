package CanBo;

public class CongNhan extends CanBo {
    private int step;
    public CongNhan(int step) {
        this.step = step;
    }

    public CongNhan(String name, boolean sex, double salari, String address) {
        super(name, sex, salari, address);
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }
}
