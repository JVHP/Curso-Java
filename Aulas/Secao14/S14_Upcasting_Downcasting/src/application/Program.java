package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.awt.*;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "José", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Fagner", 0.2, 500.00);

        // UPCASTING
        Account acc1 = bacc;
        System.out.println(acc1.getBalance());

        Account acc2 = new BusinessAccount(1003, "Luanio", 0.0, 200);
        System.out.println(acc2.getBalance());

        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
        System.out.println(acc3.getBalance());

        //DOWNCASTING
        BusinessAccount bacc4 = (BusinessAccount) acc2;
        bacc4.loan(4500.0);
        System.out.println(bacc4.getBalance());

        /*
        BusinessAccount bacc5 = (BusinessAccount) acc3;
        class entities.SavingsAccount cannot be cast to class entities.BusinessAccount (entities.SavingsAccount and entities.BusinessAccount are in unnamed module of loader 'app')
        Lança erro por ocnta do acc3 ter sido instanciado como SavingsAcount e nao BusinessAccount
        */

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount bacc5 = (BusinessAccount) acc3;
            bacc5.loan(4500.0);
            System.out.println("LOAN!'");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("UPDATE!");
        }



    }
}
