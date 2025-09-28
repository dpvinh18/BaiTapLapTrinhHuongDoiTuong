package iuh.fit.ds;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank("My Bank", 10);
        int choice;

        do {
            System.out.println("Welcom to IUH bank");
            System.out.println("1. Mở tài khoản mới");
            System.out.println("2. Nạp tiền");
            System.out.println("3. Rút tiền");
            System.out.println("4. Chuyển tiền");
            System.out.println("5. Xem tổng số dư");
            System.out.println("6. Danh sách tài khoản");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Số tài khoản: ");
                    String accNum = sc.nextLine();
                    System.out.print("Tên chủ TK: ");
                    String owner = sc.nextLine();
                    System.out.print("Số dư ban đầu: ");
                    double bal = sc.nextDouble();
                    bank.addNew(accNum, owner, bal);
                    break;

                case 2:
                    System.out.print("Nhập số TK: ");
                    accNum = sc.nextLine();
                    Account acc = bank.find(accNum);
                    if (acc != null) {
                        System.out.print("Nhập số tiền: ");
                        double amt = sc.nextDouble();
                        acc.deposit(amt);
                    } else {
                        System.out.println("Không tìm thấy tài khoản!");
                    }
                    break;

                case 3:
                    System.out.print("Nhập số TK: ");
                    accNum = sc.nextLine();
                    acc = bank.find(accNum);
                    if (acc != null) {
                        System.out.print("Nhập số tiền: ");
                        double amt = sc.nextDouble();
                        acc.withdraw(amt);
                    } else {
                        System.out.println("Không tìm thấy tài khoản!");
                    }
                    break;

                case 4:
                    System.out.print("Nhập số TK nguồn: ");
                    String from = sc.nextLine();
                    System.out.print("Nhập số TK đích: ");
                    String to = sc.nextLine();
                    System.out.print("Nhập số tiền: ");
                    double amt = sc.nextDouble();
                    Account accFrom = bank.find(from);
                    Account accTo = bank.find(to);
                    if (accFrom != null && accTo != null) {
                        accFrom.transfer(accTo, amt);
                    } else {
                        System.out.println("Không tìm thấy tài khoản!");
                    }
                    break;

                case 5:
                    System.out.println("Tổng số dư: " + bank.getTotalBalance());
                    break;

                case 6:
                    for (Account a : bank.getAccounts()) {
                        System.out.println(a);
                    }
                    break;

                case 0:
                    System.out.println("Thoát!");
                    sc.close();
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }
}
