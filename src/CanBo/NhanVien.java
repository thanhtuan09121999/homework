package CanBo;

public class NhanVien extends CanBo {
    private String CongViec;

    public NhanVien() {
    }

    public NhanVien(String name, boolean sex, double salari, String address, String congViec) {
        super(name, sex, salari, address);
        CongViec = congViec;
    }

    public String getCongViec() {
        return CongViec;
    }

    public void setCongViec(String congViec) {
        CongViec = congViec;
    }
}
