package g_BubbleSort;

public class Ordenacao {
	public long bubbleSort(ListaSequencialEstatica2 lista) {
		long tempo = System.nanoTime();
		
		int fim = lista.getQuantidade();
		for (int i = 0; i < lista.getQuantidade(); i++) {
			for (int j = 1; j < fim; j++) {
				if (lista.get(j-1).getRegistro() > lista.get(j).getRegistro()) {
					MembroStarTrek aux = lista.get(j);
					lista.set(lista.get(j-1), j);
					lista.set(aux, j-1);
				}
			}
			fim -= 1;
		}
		return System.nanoTime() - tempo;
	}
}
