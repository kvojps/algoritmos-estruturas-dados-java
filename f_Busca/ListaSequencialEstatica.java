package f_Busca;

import java.util.Random;

import a_ListaSequencialEstatica.FrotaEstelar;

public class ListaSequencialEstatica {
	private OficialStarGate[] lista;
	private int quantidade = 0;
	
	public ListaSequencialEstatica(int tamanho) {
		lista = new OficialStarGate[tamanho];
	}
	
	public void populate(int quantidade) {
		if (quantidade >= lista.length) return;
		
		Random r = new Random();
		String[] nomes = {"William","Jean","Beverly","Wesley","George","Data","Diana","Worf","Spock"};
		String[] sobrenomes = {"T. Riker", "Luc Picard","Crusher","Kirk","Picard","Spock", "La Forge"};
		
		for (int i = 0; i < quantidade; i ++) {
			int registro = i;
			String nome = nomes[r.nextInt(nomes.length)] + " " + sobrenomes[r.nextInt(sobrenomes.length)];
			OficialStarGate membro = new OficialStarGate(nome, registro);
			this.inserirNoFim(membro);
		}
	}
	
	public void inserirNoFim(OficialStarGate oficial) {
		if (quantidade == lista.length) return ;
		
		lista[quantidade] = oficial;
		quantidade++;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public OficialStarGate get (int posicao) {
		if (posicao < 0 || posicao > lista.length) return null;
		return lista[posicao];
	}
}
