package br.edu.ifce.estruturas.lista;

public class TestePegaElemento {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Arroz");
		lista.adiciona("Feijão");
		lista.adiciona(1, "Chá");
		
		System.out.println(lista.pega(1));

	}

}
