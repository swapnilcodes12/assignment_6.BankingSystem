public class Main {
    public static void main(String[] args) {

        Account[] accounts = new Account[]{
                new SavingsAccount(2323223,"swapnil",1000,2.1F),
                new CheckingAccount(33434343,"kartik",1000,500)
        };
        BankAccounts.processAccounts(accounts);

        System.out.println();
        System.out.println("+++++++++++++++++++++++++");

        Account account = new CheckingAccount(2122,"swapnil",500,500);
        //account.withdraw(800);
        //account.withdraw(200);
        account.withdraw(1002);
        account.getAccountInfo();


    }
}