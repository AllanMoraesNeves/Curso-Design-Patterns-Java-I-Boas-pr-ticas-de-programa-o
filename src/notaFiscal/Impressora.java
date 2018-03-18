package notaFiscal;

import interfaces.AcaoAposGerarNota;

public class Impressora implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal nf) {
	System.out.println("enviei para a impressora");	
	}

}
