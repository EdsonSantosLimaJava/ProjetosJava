
public class TipoLogico {
	
	public static void main(String[] args) {
		
		Boolean variavelVerdadeira = true;
		System.out.println("Variavel Verdadeira: " + variavelVerdadeira);
		
		Boolean variavelFalsa = false;
		System.out.println("Variavel Falsa: " + variavelFalsa);
		
		System.out.println("--------------------------------------------------------");
		
		Integer idade = 17;
		
		Boolean podeTirarHabilita��o = idade >= 18;
		
		System.out.println("Voc� pode tirar a carteira de motorista: " + podeTirarHabilita��o);
		
		if (podeTirarHabilita��o) {
			System.out.println("Sim! ele est� apto");
		} else {
			System.out.println("N�o! ele n�o est� apto");
		}
	}
}
