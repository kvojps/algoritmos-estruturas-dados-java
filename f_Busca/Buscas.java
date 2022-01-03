package f_Busca;

public class Buscas {
	
	public OficialStarGate buscaLinear(ListaSequencialEstatica lista, OficialStarGate oficial) {
		long tempo = System.nanoTime();
		
		for (int i = 0; i < lista.getQuantidade(); i++) {
			OficialStarGate item = lista.get(i);
			if (item.getIdentificacao() == oficial.getIdentificacao()) {
				System.out.println("Busca linear: " + (System.nanoTime() - tempo));
				return item;
			}
		}
		System.out.println("Busca linear: " + (System.nanoTime() - tempo));
		
		return null;
	}
	
	public OficialStarGate buscaOrdenada(ListaSequencialEstatica lista, OficialStarGate registro) {
		long tempo = System.nanoTime();
		
		if (registro.getRegistro() < 0) {
			System.out.println("Busca Ordenada: " + (System.nanoTime() - tempo));
			return null;
		}
		
		for (int i = 1; i < lista.getQuantidade(); i++) {
			OficialStarGate item = lista.get(i);
			if(item.getRegistro() == registro.getRegistro()) {
				System.out.println("Busca Ordenada: " + (System.nanoTime() - tempo));
				return item;
			}
		}
		System.out.println("Busca Ordenada: " + (System.nanoTime() - tempo));
		return null;
	}
	
	public OficialStarGate buscaBinaria(ListaSequencialEstatica lista, OficialStarGate registro) {
		long tempo = System.nanoTime();	
	
		int inicio = 0;
		int meio;
		int fim = lista.getQuantidade() - 1;
		
		while (inicio <= fim) {
			meio = (inicio + fim)/2;
			if(registro.getRegistro() <= lista.get(meio).getRegistro()) {
				fim = meio -1;
			} else {
				if(registro.getRegistro() > lista.get(meio).getRegistro()) {
					inicio = meio +1;
				} else {
					System.out.println("Busca Binária: " + (System.nanoTime() - tempo));
					return lista.get(meio);
				}
			}
		}
		System.out.println("Busca Binária: " + (System.nanoTime() - tempo));
		return null;
	}
}
