package br.edu.ifce.estruturas.lista;

public class TesteAdicionaPorPosicao {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Zé");
		lista.adiciona("Sá");
		
		System.out.println(lista);
		
		lista.adiciona(0, "José");
		lista.adiciona(1, "Toni");
		lista.adiciona(1, "Rafa");
		lista.adiciona(1, "Carlos");
		
		System.out.println(lista);
	}

}
