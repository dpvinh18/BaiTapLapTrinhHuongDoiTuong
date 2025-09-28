/**
 * @description TODO 
 * @author LENOVO
 * @version 1.0
 * @created Sep 28, 2025 1:46:45 PM
 */

package iuh.fit.ds;

public class Bank {
		private String name;
	    private Account[] accounts;
	    private int count; 
	    public Bank() {
	        this("NoName Bank", 100);
	    }

	   
	    public Bank(String name, int numberOfAccounts) {
	        if (name == null || name.isEmpty()) {
	            throw new IllegalArgumentException("Không được để trống");
	        }
	        if (numberOfAccounts <= 0) {
	            throw new IllegalArgumentException("Không được để trống");
	        }
	        this.name = name;
	        this.accounts = new Account[numberOfAccounts];
	        this.count = 0;
	    }

	    
	    public void addNew(String accountNumber, String accountName, double balance) {
	        if (count >= accounts.length) {
	            throw new IllegalArgumentException("Bank is full");
	        }
	    
	        if (find(accountNumber) != null) {
	            throw new IllegalArgumentException("Account number already exists");
	        }
	        accounts[count++] = new Account(accountNumber, accountName, balance);
	    }

	
	    public Account find(String accountNumber) {
	        for (int i = 0; i < count; i++) {
	            if (accounts[i].getAccountNumber().equals(accountNumber)) {
	                return accounts[i];
	            }
	        }
	        return null;
	    }

	
	    public double getTotalBalance() {
	        double sum = 0;
	        for (int i = 0; i < count; i++) {
	            sum += accounts[i].getBalance();
	        }
	        return sum;
	    }

	    
	    public int getNumberOfAccounts() {
	        return count;
	    }

	  
	    public Account[] getAccounts() {
	        Account[] result = new Account[count];
	        for (int i = 0; i < count; i++) {
	            result[i] = accounts[i];
	        }
	        return result;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        if (name == null || name.isEmpty()) {
	            throw new IllegalArgumentException("Không dược để trống");
	        }
	        this.name = name;
	    }
}

