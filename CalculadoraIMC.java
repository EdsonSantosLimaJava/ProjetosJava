import java.util.Scanner;

public class CalculadoraIMC {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite seu Peso: ");
		Double peso = scanner.nextDouble();
		
		System.out.print("Digite sua Altura: ");
		Double altura = scanner.nextDouble();
		
		Double IMC = peso / (altura * altura);
		
		System.out.println("O valor do seu IMC é: " + IMC);
		
		scanner.close();
	}

}
