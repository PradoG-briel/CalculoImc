public class Vetor{
	public static void main(String[] args) {
		double notas[] = {8.5 , 9.3 , 7.2 , 9.7};
		System.out.println("Média = "+ media(notas));
		System.out.println(soma(notas));

		int idades[] = {
				46,17,17,16,
				17,17,17,16,
				17,22,17,19,
				16,16,17,16,
				16};
		int totalIdades = 0;
		String nome = "Prado";
		int repetição = idades.length;
		for(int i = 0; i < repetição; i++) {
			totalIdades += idades[i];
		}
		double mediaIdades = totalIdades/idades.length;
		System.out.println(mediaIdades);
		
	}
	private static double media(double vetor[]) {
		double soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		return soma / vetor.length;
	}
	private static double soma(double vetor[]) {
		double soma = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		return soma;
	}
}


	