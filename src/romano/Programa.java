package romano;

import java.util.Scanner;

public class Programa {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		while(true) {
			System.out.println("########## Conversor de Número Decimal para Romano ##########");
			
			System.out.println("Menu: 1 - Converter Número para Romano");
			System.out.println("Menu: 2 - Encerrar Programa");
			
			System.out.print(">:");
			int resp = sc.nextInt();
			System.out.println("#############################################################");
		
			
			switch (resp) {
				
				case 1:
					System.out.println();
					System.out.println("Digite um Número para Ser Convertido: ");
					System.out.print(">: ");
					int numero = sc.nextInt();
					
					Conversao conv = new Conversao();
					conv.conversaoDeNumero(numero);
					
					System.out.println("####################");
					System.out.println();
					System.out.println("Deseja Continuar ?:");
					System.out.println("1 - Sim | 2 - Não");
					System.out.print(">: ");
					
					int resposta = sc.nextInt();
					System.out.println("####################");
					System.out.println();
					
					if(resposta == 1) {
						
						Programa.main(args);
						
						
					}
					if(resposta == 2) {
						break;
					}
					else {
						System.out.println("Comando Inválido...");
						
					}
					
					break;
					
				case 2:
					System.out.println("Programa foi Encerrado...");
					System.exit(0);
					break;
					
				default:
					System.out.println("Opção Inválida...");
			
			}
		

		}    
	
	}
}
