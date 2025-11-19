import java.util.HashMap;
import java.util.Map;

public class Bank {
    // 1. Private Field using Generics:
    // This Map stores Accounts, using the long accountNumber as the unique key.
    // Map<KeyType, ValueType>
    private Map<Long, Account> accounts;

    //2. Constructor

    public Bank() {
        // Initialize the HashMap. HashMap is excellent for fast lookups (O(1)).
        this.accounts = new HashMap<>();
    }

    // 3. Business Methods

    /**
     * Adds a new account to the bank.
     * @param account The Account object to add.
     * @return true if the account was added successfully (key was unique).
     */

    public boolean addAccount(Account account){
        // Check if an account with this number already exists.
        if (accounts.containsKey(account.getAccountNumber())){
            return false;
        }
        accounts.put(account.getAccountNumber(), account);
        return true;
    }

    /**
     * Retrieves an account using its number.
     * @param accountNumber The unique ID of the account.
     * @return The Account object, or null if not found.
     */

    public Account findAccount(long accountNumber){
        // The power of the Map: fast retrieval using the key!
        return accounts.get(accountNumber);
    }

    /**
     * Prints a summary of all accounts (for testing).
     */

    public void printAllAccounts(){
        System.out.println("--- Bank Account Summary ---");
        // Iterate over the Map values
        for (Account acc : accounts.values()) {
            System.out.println(acc);
        }

        System.out.println("----------------------------");
    }
}
