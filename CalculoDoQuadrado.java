import java.util.Scanner;

public class CalculoDoQuadrado {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o valor do quadrado: ");
		
		Double quadrado = scanner.nextDouble();
		
		Double resultado = quadrado * quadrado;
		
		System.out.println("O valor do seu quadrado é: " + resultado);
		
		scanner.close();
		
	}

}
