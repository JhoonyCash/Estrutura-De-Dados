package br.edu.ifce.estruturas.lista;

public class TesteRemovePorPosicao {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Café");
		lista.adiciona("Chá");
		lista.adiciona("Giz");
		
		System.out.println(lista);
		
		lista.remove(1);
		System.out.println(lista);

	}

}
