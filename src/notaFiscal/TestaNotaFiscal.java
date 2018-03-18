package notaFiscal;

public class TestaNotaFiscal {

	public static void main(String[] args) {

		CriadorDeNotaFiscal criador = new CriadorDeNotaFiscal()
		.paraEmpresa("")
		.comCnpj("21321")
		.comItem(new ItemDaNota("item 1", 200))
		.comItem(new ItemDaNota("item 2", 300))
		.comItem(new ItemDaNota("item 3", 400))
		.comObservacoes("observacao")
		.naDataAtual();
		
		NotaFiscal n = criador.constroi();
		System.out.println(n.getValorBruto());
	}

}
