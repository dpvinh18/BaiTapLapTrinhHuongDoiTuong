/**
 * @description TODO 
 * @author LENOVO
 * @version 1.0
 * @created Sep 21, 2025 3:38:24 PM
 */

package lab3.bai2;

public class Ban extends CoSoVatChat {
    private double doDai;
    private double doRong;

    public Ban(String ma, ChatLieu chatLieu, KichCo kichCo, int soChan, double doDai, double doRong) {
        super(ma, chatLieu, kichCo, soChan);
        setDoDai(doDai);
        setDoRong(doRong);
    }

    public double getDoDai() {
        return doDai;
    }

    public void setDoDai(double doDai) {
        if (doDai <= 0) {
            throw new IllegalArgumentException("Độ dài phải > 0");
        }
        this.doDai = doDai;
    }

    public double getDoRong() {
        return doRong;
    }

    public void setDoRong(double doRong) {
        if (doRong <= 0) {
            throw new IllegalArgumentException("Độ rộng phải > 0");
        }
        this.doRong = doRong;
    }

    @Override
    public double canNang() {
        return getDoDai() * getDoRong() * 10 + getSoChan() * 10;
    }
}
