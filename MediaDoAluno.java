import java.util.Scanner;

public class MediaDoAluno {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota 1 do aluno: ");
		Double nota1 = scanner.nextDouble();
		
		System.out.print("Digite a nota 2 do aluno: ");
		Double nota2 = scanner.nextDouble();
		
		System.out.print("Digite a nota 3 do aluno: ");
		Double nota3 = scanner.nextDouble();
		
		System.out.print("Digite a nota 4 do aluno: ");
		Double nota4 = scanner.nextDouble();
		
		Double resultadoDaMedia = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A m�dia do aluno �: " + resultadoDaMedia);
		
		if (resultadoDaMedia >= 7) {
			System.out.println("Parab�ns! voc� passou de ano!.");
		} else {
			System.out.println("Que pena! voc� n�o passou de ano.");
		}
		
		scanner.close();
		
	}

}
