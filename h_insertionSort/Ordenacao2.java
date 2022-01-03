package h_insertionSort;

public class Ordenacao2 {
	public long insertionSort(ListaSequencialEstatica3 lista) {
		long time = System.nanoTime();
		
		for (int i = 1; i < lista.getQuantidade(); i++) {
			for (int j = i ; j > 0 ; j--) {
				if(lista.get(j).getRegistro() < lista.get(j-1).getRegistro()) {
					Borg aux = lista.get(j-1);
					lista.set(lista.get(j), j - 1);
					lista.set(aux, j);
				} else {
					break;
				}
			}
		}
		
		return System.nanoTime() - time;
	}
}
