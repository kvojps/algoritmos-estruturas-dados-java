package b_ListaEncadeadaDinamica;

public class Main {

	public static void main(String[] args) {
		int teste = 15000;
		ListaEncadeadaDinamica listaDinamica = new ListaEncadeadaDinamica();
		MembroFrotaEstelar membro = new MembroFrotaEstelar("Picard", 0);
		System.out.println("Análise da lista sequencial dinâmica : \n");
		
		System.out.println("Inserção no final / Lista vazia: " + listaDinamica.inserirNoFim(membro));
		
		listaDinamica = new ListaEncadeadaDinamica();;
		listaDinamica.popular(teste - 1);
		System.out.println("Inserção no final / Lista cheia: " + listaDinamica.inserirNoFim(membro));
		
		System.out.println("x--------------------------x");
		
		listaDinamica = new ListaEncadeadaDinamica();
		System.out.println("Inserção no início / Lista vazia: " + listaDinamica.inserirNoComeço(membro));
		
		listaDinamica = new ListaEncadeadaDinamica();
		listaDinamica.popular(teste - 1);
		System.out.println("Inserção no início / Lista Cheia: " + listaDinamica.inserirNoComeço(membro));
		
		System.out.println("x--------------------------x");
		
		listaDinamica = new ListaEncadeadaDinamica();
		listaDinamica.popular(teste - 1);
		System.out.println("Inserção no Meio / Lista Cheia: " + listaDinamica.inserirNoMeio(membro, teste/2));
		
		// Relatório
		// Aluno : José Ferreira dos Santos Júnior
		/*Observa-se que na lista encadeada dinâmica o tempo menor é nas operações de inserir
		 * no início de lista (vazia ou cheia) e no fim de uma lista vazia. 
		 * Já o tempo maior é quando a lista está cheia e são inseridos elementos no meio e fim.
		 * Diante disso, é perceptível que a iteração presentes nas operações de meio
		 * e fim por percorrerem partes significativas da lista, acabam sendo mais custosas.*/		
	}

}