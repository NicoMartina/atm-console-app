public class ATMLauncher {
    public static void main(String[] args){
        // 1. Create the Bank
        Bank myBank = new Bank();

        // 2. Create some accounts
        Account nico = new Account(1001, "nicolas martina");
        Account maru = new Account(1002, "mariana d'amicis");
        CheckingAccount charlie = new CheckingAccount(1003, "Charlie Puth");

        // 3. Add accounts to the bank
        myBank.addAccount(nico);
        myBank.addAccount(maru);
        myBank.addAccount(charlie);

        // 4. Perform transaction
        nico.deposit(500.00);
        maru.deposit(300.00);
        charlie.deposit(200.00);


        System.out.println("Nico deposits $500.00.");
        System.out.println("Maru tries to withdraw $200.00 (fail): " + maru.withdraw(200.00));
        System.out.println("Nico withdraws $50.00 (success): " + nico.withdraw(50.00));
        System.out.println("Charlie withdraws $251.00 (fail): " + charlie.withdraw(251.00));

        // 5. Check balances
        Account foundAccount = myBank.findAccount(1001);
        if (foundAccount != null){
            System.out.println("\n--- Lookup Results ---");
            System.out.println("Account details: " + foundAccount);
        }

        myBank.printAllAccounts();
    }
}
