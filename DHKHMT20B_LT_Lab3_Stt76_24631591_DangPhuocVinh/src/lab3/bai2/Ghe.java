/**
 * @description TODO 
 * @author LENOVO
 * @version 1.0
 * @created Sep 21, 2025 3:39:23 PM
 */

package lab3.bai2;

public class Ghe extends CoSoVatChat {
    private boolean coTuaGhe;

    public Ghe(String ma, ChatLieu chatLieu, KichCo kichCo, int soChan, boolean coTuaGhe) {
        super(ma, chatLieu, kichCo, soChan);
        this.coTuaGhe = coTuaGhe;
    }

    public boolean isCoTuaGhe() {
        return coTuaGhe;
    }

    public void setCoTuaGhe(boolean coTuaGhe) {
        this.coTuaGhe = coTuaGhe;
    }

    @Override
    public double canNang() {
        double tua = coTuaGhe ? 20 : 0;
        return getSoChan() * 10 + tua;
    }
}
