
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
		
		System.out.println("Ano de fabrica��o: " + meuCarro.anoDeFabricacao + " ano/modelo 2014");
		System.out.println("Tipo de combust�vel: " + "movido a " + meuCarro.combustivel);
		
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("Ano de fabrica��o: " + seuCarro.anoDeFabricacao + " ano/modelo 2020");
		System.out.println("A cor do carro �: " + seuCarro.cor + ", cor padr�o de venda.");
		
	}

}
