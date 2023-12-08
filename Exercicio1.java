package atividadesDeLoop;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número (deve ser maior que o primeiro): ");
        int numero2 = scanner.nextInt();

        if (numero1 >= numero2) {
            System.out.println("Intervalo inválido. O segundo número deve ser maior que o primeiro.");
        }

        System.out.println("Múltiplos de 3 e 5 no intervalo de " + numero1 + " a " + numero2 + ":");

        for (int i = numero1; i <= numero2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " é múltiplo de 3 e 5");
            }
        }
    }

}
