package imposto;

import abstracts.Imposto;

public class TesteDeImpostosCompostos {
	public static void main(String[] args) {

		Imposto impostos = new Iss();

		Orcamento orcamento = new Orcamento(500.0);

		System.out.println(impostos.calcula(orcamento));
	}

}