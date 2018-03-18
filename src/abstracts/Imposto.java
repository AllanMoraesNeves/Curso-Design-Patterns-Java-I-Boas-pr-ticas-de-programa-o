package abstracts;

import imposto.Orcamento;

public abstract class Imposto {

	protected final Imposto outroImposto;

	// construtor default
	public Imposto() {
		this.outroImposto = null;
	}

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public abstract double calcula(Orcamento orcamento);
}
