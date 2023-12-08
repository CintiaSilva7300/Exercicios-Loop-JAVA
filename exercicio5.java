package atividadesDeLoop;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        int numero;
	        int total = 0;
	        
	        System.out.println("Digite um valor para somar, e digite '0' para executar a soma e finalizar o programa. " );

	        while (true) {
	        	numero = scanner.nextInt();
	        	
	        	total += numero;

	            if (numero == 0) {  	
		        	System.out.println("total: " + total);
	          
	            	System.out.println("Programa encerrado!");
	                break; 
	            }
	        }

	}

}
