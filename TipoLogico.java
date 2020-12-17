
public class TipoLogico {
	
	public static void main(String[] args) {
		
		Boolean variavelVerdadeira = true;
		System.out.println("Variavel Verdadeira: " + variavelVerdadeira);
		
		Boolean variavelFalsa = false;
		System.out.println("Variavel Falsa: " + variavelFalsa);
		
		System.out.println("--------------------------------------------------------");
		
		Integer idade = 17;
		
		Boolean podeTirarHabilitação = idade >= 18;
		
		System.out.println("Você pode tirar a carteira de motorista: " + podeTirarHabilitação);
		
		if (podeTirarHabilitação) {
			System.out.println("Sim! ele está apto");
		} else {
			System.out.println("Não! ele não está apto");
		}
	}
}
