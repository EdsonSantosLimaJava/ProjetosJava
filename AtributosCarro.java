
public class AtributosCarro {
	
	public static void main(String[] args) {
		
		Carro meuCarro = new Carro();
		
		meuCarro.fabricante = "Chevrolet";
		meuCarro.modelo = "Prisma";
		meuCarro.cor = "Branco";
		meuCarro.combustivel = "Gasolina";
		meuCarro.anoDeFabricacao = 2013;
		
		Carro seuCarro = new Carro();
		
		seuCarro.fabricante = "Hyundai";
		seuCarro.modelo = "HB20s";
		seuCarro.cor = "Preto";
		seuCarro.combustivel = "Gasolina";
		seuCarro.anoDeFabricacao = 2020;
		
		System.out.println("Ano de fabricação: " + meuCarro.anoDeFabricacao + " ano/modelo 2014");
		System.out.println("Tipo de combustível: " + "movido a " + meuCarro.combustivel);
		
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("Ano de fabricação: " + seuCarro.anoDeFabricacao + " ano/modelo 2020");
		System.out.println("A cor do carro é: " + seuCarro.cor + ", cor padrão de venda.");
		
	}

}
