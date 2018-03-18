package imposto;

import abstracts.Imposto;
import abstracts.TemplateDeImpostoCondicional;

class ICPP extends TemplateDeImpostoCondicional {

	ICPP(){
		
	}
	
    public ICPP(Imposto outroImposto) {
        super(outroImposto);
    }
	
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}
}