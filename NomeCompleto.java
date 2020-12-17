import java.util.Scanner;

public class NomeCompleto {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();

		System.out.print("Digite seu sobrenome: ");
		String sobreNome = scanner.nextLine();
		
		System.out.println("O seu nome é: " + nome + " " + sobreNome);
		
		scanner.close();
	}

}
