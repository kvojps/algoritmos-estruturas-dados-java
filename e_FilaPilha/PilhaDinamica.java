package e_FilaPilha;

import java.util.Random;

public class PilhaDinamica {
	private ElementoEncadeado topo;
	
	public void popular(int quantidade) {
		Random r = new Random();
		String[] nomes = {"William","Jean","Beverly","Wesley","George","Data","Diana","Worf","Spock"};
		String[] sobrenomes = {"T. Riker", "Luc Picard","Crusher","Kirk","Picard","Spock", "La Forge"};
		
		for (int i = 0; i < quantidade; i ++) {
			int registro = i;
			String nome = nomes[r.nextInt(nomes.length)] + " " + sobrenomes[r.nextInt(sobrenomes.length)];
			MembroEnterprise membro = new MembroEnterprise(nome, registro);
			this.push(membro);
		}
		
	}
	public long push (MembroEnterprise membro) {
		ElementoEncadeado novo = new ElementoEncadeado(membro);
		
		long tempo = System.nanoTime();
		
		novo.setProximo(topo);
		topo = novo;
		
		tempo = System.nanoTime() - tempo;
		return tempo;
	}
	
	public long pop () {
		if (topo == null) return 0;
		
		long tempo = System.nanoTime();
		
		topo = topo.getProximo();
		
		tempo = System.nanoTime() - tempo;
		return tempo;
	}
}
