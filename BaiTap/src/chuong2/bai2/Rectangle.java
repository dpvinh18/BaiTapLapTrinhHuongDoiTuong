/**
 * @description TODO 
 * @author LENOVO
 * @version 1.0
 * @created Sep 3, 2025 12:23:01 AM
 */

package chuong2.bai2;

public class Rectangle {
		    private double chieuDai;
		    private double chieuRong;
		    

		    public Rectangle() {}


		    public Rectangle(double d, double r) throws Exception {
		        if (d > 0) {
		            this.chieuDai = d;
		        } else {
		            throw new Exception("Chieu dai > 0");
		        }

		        if (r > 0) {
		            this.chieuRong = r;
		        } else {
		            throw new Exception("Chieu rong > 0");
		        }
		    }

		    
		    public void setKichThuoc(double d, double r) throws Exception {
		        if (d <= 0 || r <= 0) {
		            throw new Exception("Chieu dai va chieu rong > 0");
		        }
		        this.chieuDai = d;
		        this.chieuRong = r;
		    }


		    public void setChieuRong(double r) throws Exception {
		        if (r > 0) {
		            this.chieuRong = r;
		        } else {
		            throw new Exception("Chieu rong < 0 ");
		        }
		    }

		   
		    public double getChieuDai() {
		        return this.chieuDai;
		    }

		    public double getChieuRong() {
		        return this.chieuRong;
		    }

		  
		    public double getDienTich() {
		        return this.chieuDai * this.chieuRong;
		    }

		    public double getChuVi() {
		        return (this.chieuDai + this.chieuRong) * 2;
		    }

		    public static void inTieuDe() {
		        for (int i = 0; i < 45; i++) {
		            System.out.print("-");
		        }
		        System.out.println();
		        System.out.printf("|%10s|%10s|%10s|%10s|\n", "ChieuDai", "ChieuRong", "DienTich", "ChuVi");
		        for (int i = 0; i < 45; i++) {
		            System.out.print("-");
		        }
		        System.out.println();
		    }

		       @Override
		    public String toString() {
		        return String.format("|%10.2f|%10.2f|%10.2f|%10.2f|", 
		                getChieuDai(), getChieuRong(), getDienTich(), getChuVi());

	}
}
