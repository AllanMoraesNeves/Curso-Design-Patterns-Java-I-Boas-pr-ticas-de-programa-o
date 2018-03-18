package imposto;

public class TestaTemplateDeImposto {

	public static void main(String[] args) {
		
		Orcamento o = new Orcamento(1000);
		ICPP ic = new ICPP();
		
		System.out.println(ic.calcula(o));
	}

}
