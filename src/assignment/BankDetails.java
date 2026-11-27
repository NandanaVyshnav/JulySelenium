//3.
package assignment;

 class Bank_Account1 {

    private int account_Number;
    private double balance;

    // Setter Methods
    public void setAccount_Number(int a) {
        account_Number = a;
    }

    public void setBalance(double b) {
        balance = b;
    }

    // Getter Methods
    public int getAccount_Number() {
        return account_Number;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankDetails {

    public static void main(String[] args) {

        Bank_Account1 b = new Bank_Account1();

        // Setting values
        b.setAccount_Number(123456);
        b.setBalance(25000.50);

        // Getting values
        System.out.println("Account Number : " + b.getAccount_Number());
        System.out.println("Balance : " + b.getBalance());
    }
}
