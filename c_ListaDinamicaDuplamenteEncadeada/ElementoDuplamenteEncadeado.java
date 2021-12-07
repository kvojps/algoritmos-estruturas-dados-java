package c_ListaDinamicaDuplamenteEncadeada;

public class ElementoDuplamenteEncadeado {
	private OficialFrotaEstelar membro;
	private ElementoDuplamenteEncadeado proximo;
	private ElementoDuplamenteEncadeado anterior;
	
	public ElementoDuplamenteEncadeado (OficialFrotaEstelar membro) {
		this.membro = membro;
	}

	public OficialFrotaEstelar getMembro() {
		return membro;
	}

	public void setMembro(OficialFrotaEstelar membro) {
		this.membro = membro;
	}

	public ElementoDuplamenteEncadeado getProximo() {
		return proximo;
	}

	public void setProximo(ElementoDuplamenteEncadeado proximo) {
		this.proximo = proximo;
	}

	public ElementoDuplamenteEncadeado getAnterior() {
		return anterior;
	}

	public void setAnterior(ElementoDuplamenteEncadeado anterior) {
		this.anterior = anterior;
	}
}