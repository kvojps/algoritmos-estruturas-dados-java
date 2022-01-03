package f_Busca;

public class Main {

	public static void main(String[] args) {
		OficialStarGate oficial = new OficialStarGate("José Ferreira", 0);
		int tamanho = 100000;
		ListaSequencialEstatica lse = new ListaSequencialEstatica(tamanho);
		lse.inserirNoFim(oficial);
		lse.populate(tamanho - 1);
		Buscas busca = new Buscas();
		
		System.out.println("Lista não ordenada :");
		System.out.println();
		System.out.println("Item procurado na primeira posição :");
		busca.buscaLinear(lse, oficial);
		ListaSequencialEstatica lse1 = new ListaSequencialEstatica(tamanho);
		lse1.populate(tamanho - 1);
		lse1.inserirNoFim(oficial);
		System.out.println("Item procurado na última posição :");
		busca.buscaLinear(lse1, oficial);
		System.out.println("Posição maior que não tem na lista :");
		OficialStarGate oficialMaior = new OficialStarGate("José Ferreira", 100001);
		busca.buscaLinear(lse1, oficialMaior);
		System.out.println("Posição menor que não tem na lista :");
		OficialStarGate oficialMenor = new OficialStarGate("José Ferreira", -1);
		busca.buscaLinear(lse1, oficialMaior);
		System.out.println();
		
		//Lista ordenada -> Cada oficial tem um registro, logo a lista está em ordem de registro.
		System.out.println("Lista ordenada :");
		System.out.println();
		ListaSequencialEstatica lse2 = new ListaSequencialEstatica(tamanho);
		OficialStarGate oficial2 = new OficialStarGate("Sheldon cooper", 99999);
		lse2.inserirNoFim(oficial);
		lse2.populate(tamanho - 1);
		System.out.println("Item procurado na primeira posição :");
		busca.buscaOrdenada(lse2, oficial);
		ListaSequencialEstatica lse3 = new ListaSequencialEstatica(tamanho);
		lse3.populate(tamanho - 1);
		lse3.inserirNoFim(oficial2);
		System.out.println("Item procurado na última posição :");
		busca.buscaOrdenada(lse3,oficial2);
		System.out.println("Posição maior que não tem na lista :");
		busca.buscaOrdenada(lse3, oficialMaior);
		System.out.println("Posição menor que não tem na lista :");
		busca.buscaOrdenada(lse3, oficialMenor);
		System.out.println();
		
		//Lista binária
		System.out.println("Lista binária : ");
		System.out.println();
		ListaSequencialEstatica lse4 = new ListaSequencialEstatica(tamanho);
		lse4.inserirNoFim(oficial);
		lse4.populate(tamanho-1);
		System.out.println("Item procurado na primeira posição :");
		busca.buscaBinaria(lse4, oficial);
		ListaSequencialEstatica lse5 = new ListaSequencialEstatica(tamanho);
		lse5.populate(tamanho-1);
		lse5.inserirNoFim(oficial2);
		System.out.println("Item procurado na última posição :");
		busca.buscaBinaria(lse5, oficial2);
		System.out.println("Posição maior que não tem na lista :");
		busca.buscaBinaria(lse5, oficialMaior);
		System.out.println("Posição menor que não tem na lista :");
		busca.buscaBinaria(lse5, oficialMenor);
		
		// Relatório
		// Aluno : José Ferreira dos Santos Júnior
		/* Observa-se que as operações de busca linear são mais convenientes em momentos que não temos uma lista
		 * ordenada. Quando tratamos de obter o primeiro item de uma lista, os algoritmos de busca feitos aqui
		 * possuem tempos de execução semelhantes, porém quando tratamos de obter o último elemento de uma lista 
		 * por meio da busca linear ou ordenada acaba sendo bem custoso devido a iteração feita(do mesmo modo
		 * quando analisamos itens fora do range da lista, exceto quando tratamos de uma busca ordenada em uma
		 * posição menor que a inicial da lista).Para finalizar, quando tratamos de uma lista ordenada, o algoritmo
		 * de busca binária é mais eficiente que os outros, devido a quantidade menor de iterações.*/
	}

}
