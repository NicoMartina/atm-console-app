


public class Account {
    //private fields
    private long accountNumber;
    private double balance;
    private String customerName;


    //constructor

    public Account(long accountNumber, String customerName) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = 0.0;
    }

    //public getters

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // 4. Public Business Methods (Mutators/Actions)

    /**
     * Adds money to the account balance.
     * @param amount The amount to deposit.
     * @return true if deposit was successful.
     */

    public boolean deposit(double amount){
        if (amount > 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    /**
     * Attempts to withdraw money from the account.
     * @param amount The amount to withdraw.
     * @return true if withdrawal was successful (balance was sufficient).
     */

    public boolean withdraw( double amount){
        if (amount > 0 && this.balance >= amount){
            this.balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
