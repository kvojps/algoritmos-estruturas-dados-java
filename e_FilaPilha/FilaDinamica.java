package e_FilaPilha;

import java.util.Random;

public class FilaDinamica {
	private ElementoEncadeado inicio;
	private ElementoEncadeado fim;
	private int quantidade = 0;
	
	public void popular(int quantidade) {
		Random r = new Random();
		String[] nomes = {"William","Jean","Beverly","Wesley","George","Data","Diana","Worf","Spock"};
		String[] sobrenomes = {"T. Riker", "Luc Picard","Crusher","Kirk","Picard","Spock", "La Forge"};
		
		for (int i = 0; i < quantidade; i ++) {
			int registro = i;
			String nome = nomes[r.nextInt(nomes.length)] + " " + sobrenomes[r.nextInt(sobrenomes.length)];
			MembroEnterprise membro = new MembroEnterprise(nome, registro);
			this.enqueue(membro);
		}
	}
	
	public long enqueue(MembroEnterprise membro) {
		ElementoEncadeado novo = new ElementoEncadeado(membro);
		
		long tempo = System.nanoTime();
		
		if (quantidade == 0) {
			inicio = novo;
			fim = novo;
		} else {
			novo.setProximo(fim);
			fim = novo;
		}
		
		tempo = System.nanoTime() - tempo;
		quantidade ++;
		return tempo;
	}
	
	public long dequeue() {
		if (inicio == null) return 0;
		
		long tempo = System.nanoTime();
		
		inicio.getProximo();
		
		tempo = System.nanoTime() - tempo;
		quantidade ++;
		return tempo;
		
	}
}
