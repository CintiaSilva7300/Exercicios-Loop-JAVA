package atividadesDeLoop;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        int idade;
	        int maiorDe21 = 0;
	        int menorDe50 = 0;

	        System.out.println("Digite a idade ou (para encerrar, digite uma idade negativa):");

	        while (true) {
	            idade = scanner.nextInt();

	            if (idade < 0) {
	            	System.out.println("Idade fornecida é negativa: foi fornecido: " +  idade);
	                break; 
	            }

	            if (idade < 21) {
	            	menorDe50++;
	            } else if (idade > 50) {
	            	maiorDe21++;
	            }
	            
	            System.out.println("Pessoas com menos de 21 anos: " + menorDe50);
	            System.out.println("Pessoas com mais de 50 anos: " + maiorDe21);
	        }

	}

}
