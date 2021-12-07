package a_ListaSequencialEstatica;

import java.util.Arrays;
import java.util.Random;

public class ListaSequencialEstatica {
	private FrotaEstelar[] lista;
	private int quantidade = 0;
	
	public ListaSequencialEstatica(int tamanho) {
		lista = new FrotaEstelar[tamanho];
	}
	
	public void populate(int quantidade) {
		if (quantidade >= lista.length) return;
		
		Random r = new Random();
		String[] nomes = {"William","Jean","Beverly","Wesley","George","Data","Diana","Worf","Spock"};
		String[] sobrenomes = {"T. Riker", "Luc Picard","Crusher","Kirk","Picard","Spock", "La Forge"};
		
		for (int i = 0; i < quantidade; i ++) {
			int registro = i;
			String nome = nomes[r.nextInt(nomes.length)] + " " + sobrenomes[r.nextInt(sobrenomes.length)];
			FrotaEstelar membro = new FrotaEstelar(nome, registro);
			this.inserirNoFim(membro);
		}
	}
	
	public long inserirNoComeço(FrotaEstelar frotaEstelar) {
		if (quantidade == lista.length) return 0;
		
		long tempo = System.nanoTime();
		
		for (int i = quantidade; i > 0; i--) {
			lista[i] = lista[i-1];
		}
		
		lista[0] = frotaEstelar;
		tempo = System.nanoTime() - tempo;
		quantidade ++;
		
		return tempo;
	}
	
	public long inserirNoMeio(FrotaEstelar frotaEstelar, int posicao) {
		if (quantidade == lista.length) return 0;
		if (posicao >= lista.length) return 0;
		
		long tempo = System.nanoTime();
		
		for (int i = quantidade; i > posicao; i--) {
			lista[i] = lista[i-1];
		}
		
		lista[0] = frotaEstelar;
		tempo = System.nanoTime() - tempo;
		quantidade++;
		
		return tempo;	
	}
	
	public long inserirNoFim(FrotaEstelar frotaEstelar) {
		if (quantidade == lista.length) return 0;
		
		long tempo = System.nanoTime();
		lista[quantidade] = frotaEstelar;
		tempo = System.nanoTime() - tempo;
		
		quantidade++;
		
		return tempo;
	}
}
