package br.edu.ifce.estruturas.vetor;

public class TesteTamanhoDaLista {

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		a1.setNome("Pedro");
		a2.setNome("Jorge");
		a3.setNome("Maria");
		
		Vetor lista = new Vetor();
		
		lista.adiciona(a1);
		lista.adiciona(a2);
		lista.adiciona(a3);
		
		System.out.println(lista.tamanho());

	}

}
