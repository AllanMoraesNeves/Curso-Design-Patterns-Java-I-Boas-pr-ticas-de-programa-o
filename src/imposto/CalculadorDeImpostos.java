package imposto;

import abstracts.Imposto;

public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento o, Imposto i) {
		double valor = i.calcula(o);
		System.out.println(valor);
	}
}
