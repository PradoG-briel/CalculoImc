package br.com.empresa.model;

public class Aluno {
	private String nome;
	private double altura;
	private int idade;
	private String sexo;
	private double peso;
	private String nivelAtividade;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return this.altura;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setSexo(String sexo){
		if(sexo == "M" || sexo == "F") {
			this.sexo = sexo;
		}
		else {
			System.out.println("Escolha M para masculino ou F para feminino");
		}
		
	}
	public String getSexo() {
		return this.sexo;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPeso() {
		return this.peso;
	}
	public void setNivelAtividade(String nivelAtividade) {
		if(nivelAtividade == "Leve" || nivelAtividade == "Moderado" || nivelAtividade == "Intensa") {
			this.nivelAtividade = nivelAtividade;
		}
		else {
			System.out.println("Selecione Leve, Moderado ou Intensa ");
		}
	}
	public String getNivelAtividade() {
		return this.nivelAtividade;
	}

	
	public int calcularNcd() {
		int result = 0;
		if(nivelAtividade == "Leve" && sexo == "M") {
			result = (int) (resultadoNcd() * 1.5);
			return result;
		}
		else if(nivelAtividade == "Moderado" && sexo == "M") {
			result = (int) (resultadoNcd() * 1.8);
			return result;
		}
		else if(nivelAtividade == "Intensa" && sexo == "M") {
			result = (int) (resultadoNcd() * 2.1);
			return result;
		}
		else if(nivelAtividade == "Leve" && sexo == "F") {
			result = (int) (resultadoNcd() * 1.6);
			return result;
		}
		else if(nivelAtividade == "Moderado" && sexo == "F") {
			result = (int) (resultadoNcd() * 1.9);
			return result;
		}
		else if(nivelAtividade == "Intensa" && sexo == "F") {
			result = (int) (resultadoNcd() * 1.8);
			return result;
		}
		return 0;
		
	}
	
	public double calcularImc() {
		double result = (getPeso() + getAltura() * getAltura());
		return result;
	}
	
	public int resultadoNcd() {
		if(sexo == "M" && idade > 17 && idade < 31) {
			int result = (int) ((getPeso()*15.3)+679);
			return result;
		}
		else if(idade < 32 && idade < 61) {
			int result = (int) ((getPeso()*11.6)+879);
			return result;
		}
		else if(idade > 61) {
			int result = (int) ((getPeso()*13.5)+487);
			return result;
		}

		else if(sexo == "F" && idade > 17 && idade < 31) {
			int result = (int) ((getPeso()*14.7)+496);
			return result;
		}
		else if(idade > 31 && idade < 61) {
			int result = (int) ((getPeso()*8.7)+829);
			return result;
		}
		else if(idade > 60) {
			int result = (int) ((getPeso()*10.5)+596);
			return result;
		}
		return 0;
	}
}
