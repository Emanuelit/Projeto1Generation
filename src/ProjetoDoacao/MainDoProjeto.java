package ProjetoDoacao;

import java.util.Scanner;

	public class MainDoProjeto {

		public static void main(String[] args) {
		
			LoopInstituicao loop = new LoopInstituicao();
			Instituicoes ins = new Instituicoes();
			
			Scanner leia = new Scanner(System.in);
		
			System.out.println("+------------------------------+");
			System.out.println("|    C        A         T      |");
			System.out.println("|   Catalisador   Do   Bem     |");
			System.out.println("+------------------------------+");
			System.out.println();
			System.out.print("Nome: ");
			String nome = leia.next();
			System.out.println("--------------------------------");
			System.out.print("Sobrenome: ");
			String sobreNome = leia.next();
			System.out.println("--------------------------------");
			System.out.print("Idade: ");
			int idade = leia.nextInt();
			System.out.println("--------------------------------");
			System.out.print("CPF ou RG: ");
			String cpf = leia.next();
			System.out.println("--------------------------------");
			System.out.print("Email: ");
			String email = leia.next();
			System.out.println("--------------------------------");
			System.out.print("Telefone: ");
			String telefone = leia.next();
			System.out.println("--------------------------------");
			System.out.print("CEP: ");
			int cep1 = leia.nextInt();
			System.out.println("--------------------------------");
		
			if (idade >= 18) { 
			ins.instituicoes();
			loop.loopInstituicao();
			}
			else {
				System.out.println("Menores de 18 anos não pode doar!");
			}
			System.out.println();
			System.out.println("Muito Obrigado pela Contribuição");
			leia.close();
		}
	
}
