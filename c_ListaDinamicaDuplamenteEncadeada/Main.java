package c_ListaDinamicaDuplamenteEncadeada;

public class Main {

	public static void main(String[] args) {
		int teste = 100000;
		ListaDinamicaDuplamenteEncadeada ldde = new ListaDinamicaDuplamenteEncadeada();
		OficialFrotaEstelar membro = new OficialFrotaEstelar("Wesley crusher", 0);
		
		System.out.println("Análise da lista sequencial dinâmica duplamente encadeada : \n");
		
		System.out.println("Inserção no início / Lista vazia: " + ldde.inserirNoInicio(membro));
		
		ldde = new ListaDinamicaDuplamenteEncadeada();
		ldde.popular(teste-1);
		System.out.println("Inserção no início / Lista cheia: " + ldde.inserirNoInicio(membro));
		System.out.println("x--------------------------x");
		
		ldde = new ListaDinamicaDuplamenteEncadeada();
		System.out.println("Inserção no Fim / Lista vazia: " + ldde.inserirNoFim(membro));
		
		ldde = new ListaDinamicaDuplamenteEncadeada();
		ldde.popular(teste-1);
		System.out.println("Inserção no Fim / Lista cheia: " + ldde.inserirNoFim(membro));
		System.out.println("x--------------------------x");
		
		ldde = new ListaDinamicaDuplamenteEncadeada();
		ldde.popular(teste-1);
		System.out.println("Inserção no meio / Posição 2 da lista: " + ldde.inserirNoMeio(membro, 2));
		
		ldde = new ListaDinamicaDuplamenteEncadeada();
		ldde.popular(teste-1);
		System.out.println("Inserção no meio / Posição 1/4 da lista: " + ldde.inserirNoMeio(membro, teste/4));
		
		ldde = new ListaDinamicaDuplamenteEncadeada();
		ldde.popular(teste-1);
		System.out.println("Inserção no meio / Posição 3/4 da lista: " + ldde.inserirNoMeio(membro, 3*teste/4));
		
		ldde = new ListaDinamicaDuplamenteEncadeada();
		ldde.popular(teste-1);
		System.out.println("Inserção no meio / Penúltimo da lista: " + ldde.inserirNoMeio(membro, teste-2));
		
		// Relatório
		// Aluno : José Ferreira dos Santos Júnior
		/*Observa-se que na lista dinâmica duplamente encadeada o tempo menor é nas operações de inserir
		 * no início de lista (vazia ou cheia) , no fim de uma lista (vazia ou cheia) e no penúltimo elemento
		 * da lista, já que temos as referências do início e fim da lista. 
		 * Já o tempo maior é quando deseja inserir elementos em 1/4 ou 3/4 da lista.
		 * Diante disso, é perceptível que a iteração presentes nas operações de meio
		 * em 1/4 ou 3/4 da lista  por percorrerem partes significativas da lista, acabam sendo mais custosas.*/	
	}

}