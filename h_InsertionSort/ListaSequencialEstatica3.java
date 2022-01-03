package h_InsertionSort;

import java.util.Random;

public class ListaSequencialEstatica3 {
	private Borg[] lista;
	private int quantidade = 0;
	
	public ListaSequencialEstatica3(int tamanho) {
		lista = new Borg[tamanho];
	}
	
	public void populate(int quantidade) {
		if (quantidade >= lista.length) return;
		
		Random r = new Random();
		String[] nomes = {"William","Jean","Beverly","Wesley","George","Data","Diana","Worf","Spock"};
		String[] sobrenomes = {"T. Riker", "Luc Picard","Crusher","Kirk","Picard","Spock", "La Forge"};
		
		for (int i = 0; i < quantidade; i ++) {
			int registro = r.nextInt(10000);
			String nome = nomes[r.nextInt(nomes.length)] + " " + sobrenomes[r.nextInt(sobrenomes.length)];
			Borg membro = new Borg(nome, registro);
			this.inserirNoFim(membro);
		}
	}
	
	public void populateOrdenado(int quantidade) {
		if (quantidade >= lista.length) return;
		
		Random r = new Random();
		String[] nomes = {"William","Jean","Beverly","Wesley","George","Data","Diana","Worf","Spock"};
		String[] sobrenomes = {"T. Riker", "Luc Picard","Crusher","Kirk","Picard","Spock", "La Forge"};
		
		for (int i = 0; i < quantidade; i ++) {
			int registro = i;
			String nome = nomes[r.nextInt(nomes.length)] + " " + sobrenomes[r.nextInt(sobrenomes.length)];
			Borg membro = new Borg(nome, registro);
			this.inserirNoFim(membro);
		}
	}
	
	public void inserirNoComeço(Borg membro) {
		if (quantidade == lista.length) return;
		
		for (int i = quantidade; i > 0; i--) {
			lista[i] = lista[i-1];
		}
		
		lista[0] = membro;
		quantidade ++;
	}
	
	public void inserirNoMeio(Borg membro, int posicao) {
		if (quantidade == lista.length) return;
		if (posicao >= lista.length) return;
		
		for (int i = quantidade; i > posicao; i--) {
			lista[i] = lista[i-1];
		}
		
		lista[0] = membro;
		quantidade++;
	}
	
	public void inserirNoFim(Borg membro) {
		if (quantidade == lista.length) return ;
		
		lista[quantidade] = membro;
		
		quantidade++;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Borg get (int posicao) {
		if (posicao < 0 || posicao > lista.length) return null;
		return lista[posicao];
	}
	
	public void set (Borg membro, int posicao) {
		if (posicao < 0 || posicao > lista.length) return ;
		lista [posicao] = membro ;
	}
	
	@Override
	public String toString() {
		String msg = "Lista [\n";
		for (int i = 0; i < 5; i++) {
			if (lista[i] == null) break;
			msg += lista[i].toString() + ",\n";			                         
		}
		return msg + "]";
	}
}
