package abstracts;

import imposto.Orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto {

	public TemplateDeImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}

	public TemplateDeImpostoCondicional() {
	}

	@Override
	public double calcula(Orcamento orcamento) {

		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		} else {
			return minimaTaxacao(orcamento);
		}
	}

	public abstract double minimaTaxacao(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
