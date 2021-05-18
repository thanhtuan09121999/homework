package CanBo;

public class KySu extends CanBo {
    private String  NganhDaoTao ;

    public KySu() {
    }
    public KySu(String name, boolean sex, double salari, String address, String nganhDaoTao) {
        super(name, sex, salari, address);
        NganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return NganhDaoTao;
    }

    public void setNganhDaoTao(String NganhDaoTao) {
        NganhDaoTao = NganhDaoTao;
    }
}
