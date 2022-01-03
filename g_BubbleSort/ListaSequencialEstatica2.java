package g_BubbleSort;

import java.util.Random;

import a_ListaSequencialEstatica.FrotaEstelar;

public class ListaSequencialEstatica2 {
	private MembroStarTrek[] lista;
	private int quantidade = 0;
	
	public ListaSequencialEstatica2(int tamanho) {
		lista = new MembroStarTrek[tamanho];
	}
	
	public void populate(int quantidade) {
		if (quantidade >= lista.length) return;
		
		Random r = new Random();
		String[] nomes = {"William","Jean","Beverly","Wesley","George","Data","Diana","Worf","Spock"};
		String[] sobrenomes = {"T. Riker", "Luc Picard","Crusher","Kirk","Picard","Spock", "La Forge"};
		
		for (int i = 0; i < quantidade; i ++) {
			int registro = i;
			String nome = nomes[r.nextInt(nomes.length)] + " " + sobrenomes[r.nextInt(sobrenomes.length)];
			MembroStarTrek membro = new MembroStarTrek(nome, registro);
			this.inserirNoFim(membro);
		}
	}
	
	public void populate2(int quantidade) {
		if (quantidade >= lista.length) return;
		
		Random r = new Random();
		String[] nomes = {"William","Jean","Beverly","Wesley","George","Data","Diana","Worf","Spock"};
		String[] sobrenomes = {"T. Riker", "Luc Picard","Crusher","Kirk","Picard","Spock", "La Forge"};
		
		for (int i = 0; i < quantidade; i ++) {
			int registro = r.nextInt(quantidade - 1);
			String nome = nomes[r.nextInt(nomes.length)] + " " + sobrenomes[r.nextInt(sobrenomes.length)];
			MembroStarTrek membro = new MembroStarTrek(nome, registro);
			this.inserirNoFim(membro);
		}
	}
	
	public void inserirNoComeço(MembroStarTrek membro) {
		if (quantidade == lista.length) return;
		
		for (int i = quantidade; i > 0; i--) {
			lista[i] = lista[i-1];
		}
		
		lista[0] = membro;
		quantidade ++;
	}
	
	public void inserirNoMeio(MembroStarTrek membro, int posicao) {
		if (quantidade == lista.length) return;
		if (posicao >= lista.length) return;
		
		for (int i = quantidade; i > posicao; i--) {
			lista[i] = lista[i-1];
		}
		
		lista[0] = membro;
		quantidade++;
	}
	
	public void inserirNoFim(MembroStarTrek membro) {
		if (quantidade == lista.length) return ;
		
		lista[quantidade] = membro;
		
		quantidade++;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public MembroStarTrek get (int posicao) {
		if (posicao < 0 || posicao > lista.length) return null;
		return lista[posicao];
	}
	
	public void set (MembroStarTrek membro, int posicao) {
		if (posicao < 0 || posicao > lista.length) return ;
		lista [posicao] = membro ;
	}
}
