/**
 * @description TODO 
 * @author LENOVO
 * @version 1.0
 * @created Sep 21, 2025 3:33:20 PM
 */

package lab3.bai2;

public class CoSoVatChat {
    private String ma;
    private ChatLieu chatLieu;
    private KichCo kichCo;
    private int soChan;

    public CoSoVatChat(String ma, ChatLieu chatLieu, KichCo kichCo, int soChan) {
        if (ma == null || ma.isEmpty()) {
            throw new IllegalArgumentException("Mã không được để trống!");
        }
        if (soChan <= 0) {
            throw new IllegalArgumentException("Số chân phải > 0!");
        }
        this.ma = ma;
        this.chatLieu = chatLieu;
        this.kichCo = kichCo;
        this.soChan = soChan;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        if (ma == null || ma.trim().isEmpty()) {
            throw new IllegalArgumentException("Mã không được rỗng");
        }
        this.ma = ma;
    }

    public ChatLieu getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(ChatLieu chatLieu) {
        if (chatLieu == null) {
            throw new IllegalArgumentException("Chất liệu không hợp lệ");
        }
        this.chatLieu = chatLieu;
    }

    public KichCo getKichCo() {
        return kichCo;
    }

    public void setKichCo(KichCo kichCo) {
        if (kichCo == null) {
            throw new IllegalArgumentException("Kích cỡ không hợp lệ");
        }
        this.kichCo = kichCo;
    }

    public int getSoChan() {
        return soChan;
    }

    public void setSoChan(int soChan) {
        if (soChan <= 0) {
            throw new IllegalArgumentException("Số chân phải > 0");
        }
        this.soChan = soChan;
    }

    public double canNang() {
        return 0; 
    }
    public String toString() {
        return String.format("%15s |%15s |%15s |%13d  ", ma, chatLieu, kichCo, soChan);
    }
}
