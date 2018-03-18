package imposto;

import abstracts.Imposto;

public class Icms extends Imposto{

	public Icms(Imposto outroImposto) {
		super(outroImposto);
	}
	public Icms(){
		super();
	}
	
	protected double calculoDoOutroImposto(Orcamento orcamento) {
		return (outroImposto == null)? 0 : outroImposto.calcula(orcamento);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + calculoDoOutroImposto(orcamento);
	}

}
