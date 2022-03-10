package ProjetoDoacao;

import java.util.Scanner;

public class InstMedicos {
	
	void medicos () {
		
		FormasDePagamento form = new FormasDePagamento();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("---------------------------------------------------------------");
		System.out.println();
		System.out.println("Médicos sem Fronteiras - cuidados de saúde no mundo inteiro");
	    System.out.println();
		System.out.println("Qual valor você quer doar: 																		  ");
		System.out.println("[1] R$ 10,00 (Contribuirá com: um medicamento)													  ");
		System.out.println("[2] R$ 50,00 (Contribuirá com: um atendimento médico)											  ");
		System.out.println("[3] R$ 100,00 (Contribuirá com: um atendimento médico + equipamentos necessários para atendimento)");
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
