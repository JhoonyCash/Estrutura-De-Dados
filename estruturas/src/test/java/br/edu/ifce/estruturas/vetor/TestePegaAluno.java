package br.edu.ifce.estruturas.vetor;

public class TestePegaAluno {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		a3.setNome("Ana");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		
		Aluno aluno1 = lista.pega(0);
		Aluno aluno2 = lista.pega(1);
		Aluno aluno3 = lista.pega(2);
		
		System.out.println(aluno1);
		System.out.println(aluno2);
		System.out.println(aluno3);

	}

}
