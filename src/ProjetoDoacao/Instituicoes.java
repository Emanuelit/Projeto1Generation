package ProjetoDoacao;

import java.util.Scanner;


	public class Instituicoes {

		void instituicoes() {
			
			InstLuizaMel lui = new InstLuizaMel();
			InstMedicos med = new InstMedicos();
			InstAcnur acn = new InstAcnur();
		
				Scanner entrada = new Scanner(System.in);
				
				System.out.println();
				System.out.println("Para qual instituição você quer doar?						   ");
				System.out.println();
				System.out.println("[1] Luiza Mell - instituto de ajuda aos animais				   ");
				System.out.println("[2] Médicos sem Fronteiras - cuidados de saúde no mundo inteiro");
				System.out.println("[3] ACNUR - assistência aos refugiados						   ");
				System.out.print("---> ");
				int num1 = entrada.nextInt();
		
				switch (num1) {
					case 1:
						lui.luizaMel();
					break;
			
					case 2:
						med.medicos();
					break;
			
					case 3:
						acn.acnur();
					break;
				}
		
		}
}
