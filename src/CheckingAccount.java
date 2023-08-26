public class CheckingAccount extends Account {
    private  double overdraftLimit;

    public CheckingAccount(int accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= balance) {
            super.withdraw(amount);
        }
        else if(amount > (balance + overdraftLimit )){
            throw new RuntimeException("OverDraft balance is not sufficient");
        }else {

            overdraftLimit = (balance + overdraftLimit) - amount;
            balance  = 0;

        }


    }

    @Override
    public void getAccountInfo() {
        super.getAccountInfo();
        System.out.println(" overDraft : " + overdraftLimit);
    }
}
