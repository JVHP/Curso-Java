package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        /*Account acc1 = new Account(1001, "Alex", 100.00);
        * 'Account' is abstract; cannot be instantiated
        *
        *
        *Account acc2 = new SavingsAccount(1002, "Maria", 150.00, 45210.00);
        *
        *Account acc3 = new BusinessAccount(1003, "Bob", 1000.00, 900.00);
        *
        * */
        Locale.setDefault(Locale.US);

        List<Account> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount(1001, "Alex", 100.00, 0.01));
        accounts.add(new BusinessAccount(1002, "Maria", 150.00, 400.00));
        accounts.add(new SavingsAccount(1003, "Bob", 1050.00, 0.01));
        accounts.add(new BusinessAccount(1004, "Anna", 3060.00, 300.00));

        double sum = 0.0;

        for (Account cc : accounts) {
            sum += cc.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum);

        for (Account cc : accounts) {
            cc.deposit(10);
            System.out.printf("Updated balance for account %d: %.2f%n", cc.getNumber(), cc.getBalance());
        }
    }
}
