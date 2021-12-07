package d_ListaSequencialCircular;

import java.util.Random;

public class ListaSequencialCircular {
	private Elemento inicio;
	private int quantidade = 0;
	
	public void popular(int quantidade) {
		Random r = new Random();
		String[] nomes = {"William","Jean","Beverly","Wesley","George","Data","Diana","Worf","Spock"};
		String[] sobrenomes = {"T. Riker", "Luc Picard","Crusher","Kirk","Picard","Spock", "La Forge"};
		
		for (int i = 0; i < quantidade; i ++) {
			int registro = i;
			String nome = nomes[r.nextInt(nomes.length)] + " " + sobrenomes[r.nextInt(sobrenomes.length)];
			OficialEstelar oficial = new OficialEstelar(nome, registro);
			this.inserirNoInicio(oficial);
		}
		
	}
	
	public long inserirNoInicio (OficialEstelar oficial) {
		Elemento novo = new Elemento(oficial);
		
		long tempo = System.nanoTime();
		
		if (quantidade == 0) {
			inicio = novo;
			novo.setNext(novo);
		} else {
			Elemento cursor = inicio;
			while (cursor.getNext() != inicio) {
				cursor = cursor.getNext();
			}
			cursor.setNext(novo);
			novo.setNext(inicio);
			inicio = novo;
		}
		
		tempo = System.nanoTime() - tempo;
		quantidade ++;
		
		return tempo;
	}
	
	public long inserirNoMeio (OficialEstelar oficial, int posicao) {
		if (posicao <= 1) this.inserirNoInicio(oficial);
		if (posicao >= quantidade) this.inserirNoFinal(oficial);
		
		Elemento novo = new Elemento(oficial);
		
		long tempo = System.nanoTime();
		
		Elemento cursor = this.inicio;
		Elemento anterior = cursor;
		
		for (int i = 1; i < posicao; i++) {
			anterior = cursor;
			cursor = cursor.getNext();
		}
		
		novo.setNext(cursor);
		anterior.setNext(novo);
		
		tempo = System.nanoTime() - tempo;
		quantidade ++;
		
		return tempo;
	}
	
	public long inserirNoFinal (OficialEstelar oficial) {
		Elemento novo = new Elemento(oficial);
		
		long tempo = System.nanoTime();
		
		if (quantidade == 0) {
			inicio = novo;
			novo.setNext(novo);
		} else {
			Elemento cursor = inicio;
			while (cursor.getNext() != inicio) {
				cursor = cursor.getNext();
			}
			cursor.setNext(novo);
			novo.setNext(inicio);
		}
		
		tempo = System.nanoTime() - tempo;
		quantidade ++;
		
		return tempo;
	}
}