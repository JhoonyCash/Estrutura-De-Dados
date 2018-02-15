package br.edu.ifce.estruturas.vetor;

public class TesteAdicionaPorPosicao {

	public static void main(String[] args) {
		Vetor lista = new Vetor();
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		
		a1.setNome("Pedro");
		a2.setNome("João");
		a3.setNome("Maria");
		a4.setNome("Davi");
		
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		
		System.out.println(lista);
		
		lista.adiciona(1, a4);
		
		System.out.println(lista);
		
		

	}

}
