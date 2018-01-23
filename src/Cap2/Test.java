package Cap2;

import java.util.Scanner;

/**
 * Created by Bruno Rodrigo
 */
public class Test {
    public static void main(String[] args) {
        String nome;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");

        nome = input.next();

        System.out.println("Olá "+nome+", seja bem vindo!!!");
    }
}
