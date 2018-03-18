package notaFiscal;

import java.util.ArrayList;
import java.util.List;

import interfaces.AcaoAposGerarNota;

public class TesteAcoes {

	public static void main(String[] args) {
		List<AcaoAposGerarNota> listaAcoes = new ArrayList<>();
		listaAcoes.add(new EnviadorDesSms());
		listaAcoes.add(new NotaFiscalDao());
		listaAcoes.add(new Impressora());
		
		CriadorDeNotaFiscal builder = new CriadorDeNotaFiscal(listaAcoes);
		
//		builder.adicionaAcao(new EnviadorDesSms());
//		builder.adicionaAcao(new NotaFiscalDao());
//		builder.adicionaAcao(new Impressora());
		NotaFiscal nf = builder.paraEmpresa("teste").comCnpj("123").comItem(new ItemDaNota("nome", 100))
				.comObservacoes("obs").naDataAtual().constroi();
	
		System.out.println(nf.getValorBruto());
	}

}
