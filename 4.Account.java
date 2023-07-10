class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            balance = 0;
        }
    }

    public Account() {
        this(0);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. A $5 penalty will be charged.");
            balance -= 5; // Penalty charge
        } else {
            balance -= amount;
        }
    }

    public void computeInterest(double interestRate) {
        double interest = balance * interestRate / 100;
        balance += interest;
    }

    public double getBalance() {
        return balance;
    }
}

public class AccountMain {
    public static void main(String[] args) {
        Account account1 = new Account(1000);
        Account account2 = new Account();

        System.out.println("Initial balance of account1: $" + account1.getBalance());
        System.out.println("Initial balance of account2: $" + account2.getBalance());

        account1.deposit(500);
        account2.withdraw(2000);

        System.out.println("Balance of account1 after deposit: $" + account1.getBalance());
        System.out.println("Balance of account2 after withdrawal: $" + account2.getBalance());

        account1.computeInterest(5);
        account2.computeInterest(3);

        System.out.println("Balance of account1 after interest calculation: $" + account1.getBalance());
        System.out.println("Balance of account2 after interest calculation: $" + account2.getBalance());
    }
}