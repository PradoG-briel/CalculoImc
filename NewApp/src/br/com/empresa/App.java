package br.com.empresa;
import br.com.empresa.model.Aluno;

public class App{

	public static void main (String[] args) {
		Aluno alunoPedro = new Aluno();
		
		alunoPedro.setNome("Pedro");
		alunoPedro.setIdade(23);
		alunoPedro.setAltura(1.84);
		alunoPedro.setPeso(80.4);
		alunoPedro.setSexo('m');
		
		System.out.println("O seu IMC é = " + alunoPedro.calcularImc());
	}
}
