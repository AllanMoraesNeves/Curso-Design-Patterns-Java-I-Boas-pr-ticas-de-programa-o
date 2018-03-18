package imposto;

public class TesteDeImpostos {

	public static void main(String[] args) {
		
		Icms icms = new Icms();
		CalculadorDeImpostos calcula = new CalculadorDeImpostos();
		Orcamento orcamento = new Orcamento(500);
		calcula.realizaCalculo(orcamento, icms);
		
		calcula.realizaCalculo(orcamento, new Iss());
	}

}
