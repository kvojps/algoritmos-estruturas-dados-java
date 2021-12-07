package d_ListaSequencialCircular;

public class Elemento {
	private OficialEstelar oficial;
	private Elemento next;
	
	public Elemento(OficialEstelar oficial) {
		super();
		this.oficial = oficial;
	}

	public OficialEstelar getOficial() {
		return oficial;
	}

	public void setOficial(OficialEstelar oficial) {
		this.oficial = oficial;
	}

	public Elemento getNext() {
		return next;
	}

	public void setNext(Elemento next) {
		this.next = next;
	}
}