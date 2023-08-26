public class SavingsAccount extends Account{
    private final float interstRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, float interstRate) {
        super(accountNumber, accountHolder, balance);
        this.interstRate = interstRate;
    }

    @Override
    public void getAccountInfo() {
        super.getAccountInfo();
        System.out.println( " Interest Rate : " + interstRate);
    }
}
