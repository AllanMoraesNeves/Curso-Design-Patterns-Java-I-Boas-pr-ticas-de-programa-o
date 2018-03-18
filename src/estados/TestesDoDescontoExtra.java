package estados;

import imposto.Orcamento;

public class TestesDoDescontoExtra {

	public static void main(String[] args) {
		Orcamento reforma = new Orcamento();
		reforma.valor = 500;
		reforma.aplicaDescontoExtra();
		System.out.println(reforma.getValor());
		
		reforma.aprova();
		reforma.aplicaDescontoExtra();
		System.out.println(reforma.getValor());
		
		reforma.finaliza();
	}

}
