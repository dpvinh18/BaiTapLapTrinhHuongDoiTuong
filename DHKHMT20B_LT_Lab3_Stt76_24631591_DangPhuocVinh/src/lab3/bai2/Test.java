/**
 * @description TODO 
 * @author LENOVO
 * @version 1.0
 * @created Sep 21, 2025 3:39:52 PM
 */

package lab3.bai2;

public class Test {
    public static void main(String[] args) {
        CoSoVatChat[] ds = new CoSoVatChat[3];
        ds[0] = new Ban("B01", ChatLieu.GO, KichCo.LON, 4, 2.0, 1.0);
        ds[1] = new Ghe("G01", ChatLieu.KIMLOAI, KichCo.VUA, 4, true);
        ds[2] = new Ghe("G02", ChatLieu.NHUA, KichCo.NHO, 3, false);
        System.out.printf("%15s |%15s |%15s |%15s |%11s\n",
                "Mã", "Chất liệu", "Kích cỡ", "Số chân", "Cân nặng");
        System.out.println("--------------------------------------------------------------------------------");
        for (CoSoVatChat csvc : ds) {
            System.out.printf("%s |%10.2f%n", csvc.toString(), csvc.canNang());
        }
    }
}

