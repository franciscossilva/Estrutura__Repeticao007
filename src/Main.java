import java.util.Scanner;

public class Main {

    public static boolean isPrime(int number) {
        if (number < 2) { // Números menores que 2 não são primos
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) { // Se o número é divisível por qualquer número entre 2 e ele mesmo, ele não é primo.
                return false;
            }
        }

        return true; // Se o número não é divisível por nenhum outro número diferente de 1 e ele mesmo, ele é primo.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro para verificar se ele é primo: ");
        int number = sc.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " é um número primo.");
        } else {
            System.out.println(number + " não é um número primo.");
        }
    }
}