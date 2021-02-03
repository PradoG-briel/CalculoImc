package br.com.empresa.model;
import br.com.empresa.App;

public class Aluno {
	String nome;
	double altura;
	int idade;
	char sexo;
	double peso;
	
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
	public void setSexo(char sexo){
		if(sexo == 'm' || sexo == 'f') {
			this.sexo = sexo;
		}
		else {
			System.out.println("Escolha M para masculino ou F para feminino");
		}
		
	}
	public char getSexo() {
		return this.sexo;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPeso() {
		return this.peso;
	}
//	static void calcularImc() {
//		double imc = 
//	}
}
