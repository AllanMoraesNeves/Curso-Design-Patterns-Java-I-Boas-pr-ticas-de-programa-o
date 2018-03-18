package estados;

import imposto.Orcamento;
import interfaces.EstadoDeUmOrcamento;

class Finalizado implements EstadoDeUmOrcamento {
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos finalizados n�o recebem desconto extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		// TODO Auto-generated method stub
		
	}
}