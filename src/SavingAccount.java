public class SavingAccount extends  Account {

    private static final double MINIMUM_BALANCE =  100.00;

    public SavingAccount(long accountNumber, String customerName) {
        super(accountNumber, customerName);
    }

    @Override
    public boolean withdraw(double amount){
        // 1. Calculate the hypothetical new balance
        double newBalance = this.getBalance() - amount;

        // 2. Add the custom rule check here:
        if (newBalance < 100){
            // If the rule is violated, stop the withdrawal
            System.out.println("❌ Withdrawal failed: Minimum balance of $" + MINIMUM_BALANCE + " must be maintained.");
            return false;
        }

        // 3. If the custom rule passes, let the parent class handle the actual withdrawal logic
        return super.withdraw(amount);
    }
}
