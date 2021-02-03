package br.com.empresa;
import br.com.empresa.model.Aluno;

public class App{
	static void calcularImc() {
		
	}
	public static void main (String[] args) {
		Aluno alunoPedro = new Aluno();
		
		alunoPedro.setNome("Pedro");
		alunoPedro.setIdade(23);
		alunoPedro.setAltura(1.84);
		alunoPedro.setPeso(80.4);
		alunoPedro.setSexo('m');
		
		System.out.println(alunoPedro.getPeso());
	}
}
