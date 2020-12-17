import java.util.Scanner;

public class AlterandoValorDaVariavel {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite o tipo do pagamento [ 1 = a vita / 2 = a prazo]: ");
		Integer tipoPagamento = scanner.nextInt();
		
		Boolean pagamentoAVista = tipoPagamento.equals(1);
		
		Double juros = 0.0;
		
		if (!pagamentoAVista) {
			juros = - 05.0;
		} 
		
		Double acrescimo = valorProduto * juros / 100;
		
		Double valorTotal = acrescimo + valorProduto;
		
		System.out.println("Sua compra sairá no valor de: " + valorTotal);
		
		scanner.close();
		
	}
	
}
