package chuong2.bai2;

public class TestRectangle {
    public static void main(String[] args) throws Exception {
     
        Rectangle r1 = new Rectangle(8, 4);
        Rectangle r2 = new Rectangle(12, 6);
        Rectangle r3 = new Rectangle(5.5, 3.2);

        Rectangle.inTieuDe();

        // In kết quả
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}

