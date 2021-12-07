package c_ListaDinamicaDuplamenteEncadeada;

import java.util.Random;

public class ListaDinamicaDuplamenteEncadeada {
	private ElementoDuplamenteEncadeado inicio;
	private ElementoDuplamenteEncadeado fim;
	private int quantidade = 0;
	
	public void popular(int quantidade) {
		Random r = new Random();
		String[] nomes = {"William","Jean","Beverly","Wesley","George","Data","Diana","Worf","Spock"};
		String[] sobrenomes = {"T. Riker", "Luc Picard","Crusher","Kirk","Picard","Spock", "La Forge"};
		
		for (int i = 0; i < quantidade; i ++) {
			int registro = i;
			String nome = nomes[r.nextInt(nomes.length)] + " " + sobrenomes[r.nextInt(sobrenomes.length)];
			OficialFrotaEstelar membro = new OficialFrotaEstelar(nome, registro);
			this.inserirNoInicio(membro);
		}
		
	}
	
	public long inserirNoInicio(OficialFrotaEstelar membro) {
		ElementoDuplamenteEncadeado novo = new ElementoDuplamenteEncadeado(membro);
		
		long tempo = System.nanoTime();
		
		if (quantidade == 0) {
			inicio = novo;
			fim = novo;
		} else {
			novo.setProximo(inicio);
			inicio.setAnterior(novo);
			inicio = novo;
		}
		tempo = System.nanoTime() - tempo;
		
		quantidade ++;
		
		return tempo;
	}
	
	public long inserirNoFim(OficialFrotaEstelar membro) {
		ElementoDuplamenteEncadeado novo = new ElementoDuplamenteEncadeado(membro);
		
		long tempo = System.nanoTime();
		
		if (quantidade == 0) {
			inicio = novo;
			fim = novo;
		} else {
			novo.setAnterior(fim);
			fim.setProximo(novo);
			fim = novo;
		}
		tempo = System.nanoTime() - tempo;
		
		quantidade ++;
		
		return tempo;
	}
	
	public long inserirNoMeio(OficialFrotaEstelar membro, int posicao) {
		if (posicao < 1 || posicao > quantidade) return 0;
		
		ElementoDuplamenteEncadeado novo = new ElementoDuplamenteEncadeado(membro);
		
		long tempo = System.nanoTime();
		
		if (quantidade == 0) {
			inicio = novo;
			fim = novo;
		} else {
			int doInicio = posicao;
			int doFinal = quantidade - posicao;
			ElementoDuplamenteEncadeado cursor;
			if (doInicio < doFinal) {
				cursor = inicio;
				for (int i = 1; i <= doInicio; i++)
					cursor.getProximo();
			} else {
				cursor = fim;
				for (int i = 1; i <= doFinal; i++)
					cursor.getAnterior();
			}		
		}
		tempo = System.nanoTime() - tempo;
		
		quantidade ++;
		
		return tempo;
	}
}