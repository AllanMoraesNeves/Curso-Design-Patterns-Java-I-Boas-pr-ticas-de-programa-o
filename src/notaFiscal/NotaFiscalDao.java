package notaFiscal;

import interfaces.AcaoAposGerarNota;

public class NotaFiscalDao implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("enviei para o banco");
	}

}
