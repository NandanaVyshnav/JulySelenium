
package assignment;

public abstract class Bank_Account {

    abstract void deposit();
    abstract void withdraw();

    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount();
        CurrentAccount c = new CurrentAccount();

        s.deposit();
        s.withdraw();

        c.deposit();
        c.withdraw();
    }
}

class SavingsAccount extends Bank_Account {

    void deposit() {
        System.out.println("Deposit in Savings Account");
    }

    void withdraw() {
        System.out.println("Withdraw from Savings Account");
    }
}

class CurrentAccount extends Bank_Account {

    void deposit() {
        System.out.println("Deposit in Current Account");
    }

    void withdraw() {
        System.out.println("Withdraw from Current Account");
    }
}

