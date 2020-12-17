import java.util.Scanner;

public class MediaDoAluno2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seus pontos: ");
		Double pontos = scanner.nextDouble();
		
		Boolean alunoAprovado = pontos >= 70;
		
		System.out.println("O aluno está aprovado? " + alunoAprovado);
		
		if (alunoAprovado) {
			System.out.println("Sim! ele(a) está aprovado!");
		} else {
			System.out.println("Não! ele(a) não está aprovado!");
		}
		
		scanner.close();
	}

}
