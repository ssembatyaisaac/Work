package Account;

import java.util.Scanner;

/**
 * AccountTest
 */
public class AccountTest {

    public static void main(String[] args) {
        Account account1 = new Account(50.00);
        Account account2 = new Account(-7.53);

        System.out.printf("account1 balance: $%.2f\n",account1.getBalance());
        System.out.printf("account2 balance: $%.2f\n",account2.getBalance());

        Scanner input = new Scanner(System.in);
        double depositAmount;

        System.out.print("Enter deposit for account1: ");
        depositAmount = input.nextDouble();
        System.out.printf("\nadding %.2f to account balance\n\n",depositAmount);
        account1.credit(depositAmount);

        System.out.printf("accout1 balance: $%.2f\n",account1.getBalance());
        System.out.printf("accout2 balance: $%.2f\n",account2.getBalance());
    }
}