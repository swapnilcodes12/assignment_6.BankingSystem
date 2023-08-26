public class Account {
    private final int accountNumber;
    private final String accountHolder;
    protected double balance;

    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance){
            balance -= amount;
        }else {
            throw new RuntimeException("Account Balance is not Sufficient");
        }
    }

    public void getAccountInfo() {
        System.out.println(" accountNumber : " + accountNumber + " accountHolder : " + accountHolder + " balance : " + balance);
    }
}
