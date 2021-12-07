package b_ListaEncadeadaDinamica;

public class Elemento {
	private MembroFrotaEstelar membro;
	private Elemento next;
	
	public Elemento(MembroFrotaEstelar membro) {
		super();
		this.membro = membro;
	}

	public MembroFrotaEstelar getMembro() {
		return membro;
	}

	public void setMembro(MembroFrotaEstelar membro) {
		this.membro = membro;
	}

	public Elemento getNext() {
		return next;
	}

	public void setNext(Elemento next) {
		this.next = next;
	}
	
}