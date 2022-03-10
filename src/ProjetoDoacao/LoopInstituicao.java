package ProjetoDoacao;

import java.util.Scanner;

	public class LoopInstituicao {

		void loopInstituicao() {
			int num;
		
			Instituicoes ins = new Instituicoes();
		
			Scanner input = new Scanner(System.in);
			
			System.out.println("-------------------------------");
			System.out.println();
			System.out.println("Voce quer doar novamente?");
			System.out.println("[1] Sim ");
			System.out.println("[2] Não ");
			System.out.print("---> ");
			num = input.nextInt();
			System.out.println();
			
			switch (num) {
		
			case 1:
				while (num == 1) {	
					ins.instituicoes();
					System.out.println("-----------------------------");
					System.out.println();
					System.out.println("Voce quer doar novamente?");
					System.out.println("[1] Sim ");
					System.out.println("[2] Não ");
					System.out.print("---> ");
					num = input.nextInt();	
					System.out.println();
				}
				break;
			
				case 2:
					System.out.println();
					System.out.println("Obrigado por doar!");
				break;
			}
			input.close();
		}
}
