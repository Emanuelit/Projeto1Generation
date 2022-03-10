package ProjetoDoacao;

import java.util.Scanner;

public class InstAcnur {

	void acnur () {
		
		FormasDePagamento form = new FormasDePagamento();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("-------------------------------------");
		System.out.println();
		System.out.println("ACNUR - assistência aos refugiados									   ");
		System.out.println();
		System.out.println("Qual valor você quer doar?							  				   ");
		System.out.println("[1] R$ 10,00 (Contribuirá com: alimentos 			  				  )");
		System.out.println("[2] R$ 50,00 (Contribuirá com alimentos + medicamentos)				   ");
		System.out.println("[3] R$ 100,00 (Contribuirá com: alimentos + medicamentos + mantimentos)");
		System.out.print("---> ");
		int numero = leia.nextInt();
		
		switch (numero) {
		 
			case 1:
				form.formaDePagamento();
			break;
			
			case 2:
				form.formaDePagamento();
			break;
			
			case 3:
				form.formaDePagamento();
			break;
		}
	}
	
}
