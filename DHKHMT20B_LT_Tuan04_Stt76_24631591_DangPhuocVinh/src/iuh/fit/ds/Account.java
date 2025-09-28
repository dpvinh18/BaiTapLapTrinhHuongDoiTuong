/**
 * @description TODO 
 * @author LENOVO
 * @version 1.0
 * @created Sep 28, 2025 1:36:04 PM
 */

package iuh.fit.ds;

public class Account {
	private String accountNumber, ownerName;
	private double balance;
	public Account(String accountNumber, String ownerName, double balance) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	public Account() {
		this.accountNumber = "0000-0000-0000";
		this.ownerName = "No name";
		this.balance = 0.0;
	}

	 public void deposit(double amount) {
	        if (amount <= 0) {
	            throw new IllegalArgumentException("Số tiền <=0");
	        }
	        balance += amount;
	    }
	 public void withdraw(double amount) {
	        if (amount <= 0 || amount > balance) {
	            throw new IllegalArgumentException("Số tiền <= 0");
	        }
	        balance -= amount;
	    }
	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) throws IllegalAccessException {
	    	if( balance < 0) {
	    		throw new IllegalAccessException("Số dư phải >= 0");
	    	}
			this.balance = balance;
		}
		public void transfer(Account other, double amount) {
	        this.withdraw(amount);  
	        other.deposit(amount); 
	    }

	    public String getAccountNumber() {
	        return accountNumber;
	    }

	    public void setAccountNumber(String accountNumber) {
	        if (accountNumber == null || accountNumber.isEmpty()) {
	            throw new IllegalArgumentException("Số tài khoản không được để trống");
	        }
	        this.accountNumber = accountNumber;
	    }

	    public String getOwnerName() {
	        return ownerName;
	    }

	    public void setOwnerName(String ownerName) {
	        if (ownerName == null || ownerName.isEmpty()) {
	            throw new IllegalArgumentException("Không được để trống");
	        }
	        this.ownerName = ownerName;
	    }

	    @Override
	    public String toString() {
	        return String.format("%15s | %20s | %12s |", accountNumber, ownerName, balance);
	    }
	
}
