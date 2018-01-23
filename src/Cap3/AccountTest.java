package Cap3;

import java.util.Scanner;

/**
 * Created by Bruno Rodrigo
 */
public class AccountTest {

    public static void main(String[] args) {
        Account account1 = new Account("Jane Green",50.00);
        Account account2 = new Account("John Blue", -7.53);

        //exibe saldo inicial de cada projeto
        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s baçance: $%.2f %n", account2.getName(), account2.getBalance());

        //cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();

        System.out.print("%nadding %.2f to account");

    }

}
