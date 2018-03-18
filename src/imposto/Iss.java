package imposto;

import abstracts.Imposto;

public class Iss extends Imposto {

	public Iss(Imposto outroImposto) {
		super(outroImposto);
	}

	public Iss() {
		super();
	}

	protected double calculoDoOutroImposto(Orcamento orcamento) {
		return (outroImposto == null) ? 0 : outroImposto.calcula(orcamento);
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
	}

}
