package notaFiscal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import interfaces.AcaoAposGerarNota;

public class CriadorDeNotaFiscal {

	private String razaoSocial;
	private String cnpj;
	private Calendar data;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private List<AcaoAposGerarNota> todasAcoesASeremExecutadas;

	public CriadorDeNotaFiscal(List<AcaoAposGerarNota> acao) {
		this.todasAcoesASeremExecutadas = acao;
	}

	public CriadorDeNotaFiscal() {
		this.todasAcoesASeremExecutadas = new ArrayList<>();
	}

	public void adicionaAcao(AcaoAposGerarNota acao) {
		this.todasAcoesASeremExecutadas.add(acao);
	}

	public CriadorDeNotaFiscal paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public CriadorDeNotaFiscal comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public CriadorDeNotaFiscal comItem(ItemDaNota item) {
		todosItens.add(item);
		valorBruto += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}

	public CriadorDeNotaFiscal comObservacoes(String o) {
		this.observacoes = o;
		return this;
	}

	public CriadorDeNotaFiscal naDataAtual() {
		this.data = Calendar.getInstance();
		return this;
	}

	public NotaFiscal constroi() {
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
		for (AcaoAposGerarNota acao : todasAcoesASeremExecutadas) {
			acao.executa(nf);
		}
		return nf;
	}
}
