package romano;

public class Conversao {
	
	public void conversaoDeNumero(int numero) {
		
		int [] varNum= {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] vaRom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		
		while (true) {
			
			if(numero == 0)break;
			
			System.out.println();
			System.out.println("### Conversão ######");
			System.out.printf("%-4d",numero);
			
			int i = 0;
			
			while(numero >0) {
				if(numero >= varNum[i]) {
					
					System.out.print(vaRom[i]);
					numero -= varNum[i];
					
				}
				else {
					i++;
				}
			}
			System.out.println();
		}
	}

}
