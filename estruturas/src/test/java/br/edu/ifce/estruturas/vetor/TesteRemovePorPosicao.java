package br.edu.ifce.estruturas.vetor;

public class TesteRemovePorPosicao {

	public static void main(String[] args) {
Vetor lista = new Vetor();
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		Aluno a5 = new Aluno();
		
		a1.setNome("Pedro");
		a2.setNome("João");
		a3.setNome("Maria");
		a4.setNome("Davi");
		a5.setNome("Jonas");
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		lista.adiciona(a4);
		lista.adiciona(a5);
		
		System.out.println(lista);
		
		lista.remove(2);
		
		System.out.println(lista);

	}

}
