import java.util.Scanner;

public class TipoTexto {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite seu sobreNome: ");
		String sobreNome = scanner.nextLine();
		
		System.out.print("Ol�! " + nome + " " + sobreNome + (" voc� � um programador java!") );
		
		scanner.close();
	}

}
