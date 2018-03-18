package notaFiscal;

import interfaces.AcaoAposGerarNota;

public class EnviadorDesSms implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("enviei por sms");
	}

}
