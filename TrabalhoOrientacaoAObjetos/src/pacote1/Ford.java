package pacote1;

public class Ford extends Carro implements PropriedadesDoCarro {

	public Ford(String possuiOpcaoEletrica, String possuiOpcaoAutomatica) {
		super(possuiOpcaoEletrica, possuiOpcaoAutomatica);
	}

	@Override
	public void preco() {
		System.out.println("A m�dia de preco dos carros da Ford � mediana.");
	}

	@Override
	public void manutencao() {
		System.out.println("A manuten��o dos carros da Ford tende a ser baixa.");
	}

	@Override
	public void disponibilidadeNoMercado() {
		System.out.println("A disponibilidade de carros da Ford no Brasil � mediana.");
	}

	@Override
	public void consumo() {
		System.out.println("Os carros da Ford tendem a ser econ�micos.");		
	}

	@Override
	public void disponibilidadeDePecas() {
		System.out.println("A disponibilidade de pe�as da Ford no Brasil � alta.");
	}


}
