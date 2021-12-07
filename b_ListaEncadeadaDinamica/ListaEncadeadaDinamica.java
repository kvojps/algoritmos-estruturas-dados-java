package b_ListaEncadeadaDinamica;

import java.util.Random;


public class ListaEncadeadaDinamica {
	private Elemento inicio;
	private int quantidade = 0;

	
	public void popular(int quantidade) {
		Random r = new Random();
		String[] nomes = {"William","Jean","Beverly","Wesley","George","Data","Diana","Worf","Spock"};
		String[] sobrenomes = {"T. Riker", "Luc Picard","Crusher","Kirk","Picard","Spock", "La Forge"};
		
		for (int i = 0; i < quantidade; i ++) {
			int registro = i;
			String nome = nomes[r.nextInt(nomes.length)] + " " + sobrenomes[r.nextInt(sobrenomes.length)];
			MembroFrotaEstelar membro = new MembroFrotaEstelar(nome, registro);
			this.inserirNoFim(membro);
		}
		
	}
	
	public long inserirNoComeço(MembroFrotaEstelar membro) {
		Elemento novo = new Elemento(membro);
		
		long tempo = System.nanoTime();
		novo.setNext(inicio);
		inicio = novo;
		tempo = System.nanoTime() - tempo;
		
		quantidade ++;
		
		return tempo;
	}
	
	public long inserirNoMeio(MembroFrotaEstelar membro, int posicao) {
		if (posicao <= 1 || posicao >= quantidade) return 0;
		Elemento novo = new Elemento(membro);
		
		Elemento cursor = inicio;
		Elemento anterior = inicio;
		long tempo = System.nanoTime();
		
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
	
	public long inserirNoFim(MembroFrotaEstelar membro) {
		Elemento novo = new Elemento(membro);
		long tempo = System.nanoTime();
		
		if (inicio == null) {
			inicio = novo;
		} else {
			Elemento cursor = inicio;
			while (cursor.getNext() != null) {
				cursor = cursor.getNext();
			}
			cursor.setNext(novo);
		}
		
		tempo = System.nanoTime() - tempo;
		
		quantidade ++;
		return tempo;
	}
	
}