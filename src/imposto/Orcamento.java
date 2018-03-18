package imposto;

import estados.EmAprovacao;
import interfaces.EstadoDeUmOrcamento;

public class Orcamento {

	public double valor;
	public EstadoDeUmOrcamento estadoAtual; // veja a mudança aqui

	public Orcamento(double valor) {
		this.valor = valor;
	}

	public Orcamento() {
		this.estadoAtual = new EmAprovacao();
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}

	public void aprova() {
		estadoAtual.aprova(this);
	}

	public void reprova() {
		estadoAtual.reprova(this);
	}

	public void finaliza() {
		estadoAtual.finaliza(this);
	}

	public double getValor() {
		return valor;
	}
}