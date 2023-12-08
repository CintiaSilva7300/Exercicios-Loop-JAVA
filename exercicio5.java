package atividadesDeLoop;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        int numero;
	        int total = 0;
	        
	        System.out.println("Digite um valor para somar, e digite '0' para executar a soma e finalizar o programa. " );

//	        while (true) {
//	        	numero = scanner.nextInt();
//	        	
//	        	total += numero;
//
//	            if (numero == 0) {  	
//		        	System.out.println("total: " + total);
//	          
//	            	System.out.println("Programa encerrado!");
//	                break; 
//	            }else if(numero < 0){
//	            	System.out.println("Valor menor que zero");
//	            }
//	        }
	        
	        while (true) {
	            numero = scanner.nextInt();

	            if (numero < 0) {
	                System.out.println("Número negativo detectado. Não será somado.");
	            } else {
	                total += numero;
	            }

	            if (numero == 0) {
	                System.out.println("Total: " + total);
	                System.out.println("Programa encerrado!");
	                break;
	            } else {
	                System.out.println("Digite outro valor (ou '0' para encerrar):");
	            }
	      
	    }
	}

}
