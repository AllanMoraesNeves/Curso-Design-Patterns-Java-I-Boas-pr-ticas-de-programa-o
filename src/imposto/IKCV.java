package imposto;

import abstracts.Imposto;
import abstracts.TemplateDeImpostoCondicional;

public class IKCV extends TemplateDeImpostoCondicional{

    public IKCV() {}

    public IKCV(Imposto outroImposto) {
        super(outroImposto);
    }
    
	@Override
	public double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
}

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
        // retorna verdadeiro caso algum item seja maior que 100 reais
		return true;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.10;  

	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);

	}

}
