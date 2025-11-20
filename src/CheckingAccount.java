public class CheckingAccount extends Account {
    private static final double MAX_OVERDRAFT = -50.00;

    public CheckingAccount(long accountNumber, String customerName) {
        super(accountNumber, customerName);
    }

    @Override
    public boolean withdraw(double amount){
        double newBalance = this.getBalance() - amount;

        if (newBalance < MAX_OVERDRAFT){
            System.out.println("❌ Withdrawal failed: Exceeds maximum overdraft limit of $" + MAX_OVERDRAFT);
            return false;
        }
        return  super.withdraw(amount);
    }
}
