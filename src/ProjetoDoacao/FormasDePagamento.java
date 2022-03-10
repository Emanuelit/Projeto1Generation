package ProjetoDoacao;

import java.util.Scanner;

public class FormasDePagamento {

	void formaDePagamento() {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("Qual será a forma de pagamento? ");
		System.out.println("[1] Cartão de credito			");
		System.out.println("[2] Boleto			 			");
		System.out.println("[3] Pix				 			");
		System.out.print("---> ");
		int numero = leia.nextInt();
		
		
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("     Efetuando Pagamento...     ");
		System.out.println("--------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("    Doação feita com sucesso    ");
		System.out.println();
		
		
		
		
	}
	
}
