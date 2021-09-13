package pacote1;

public class Ford extends Carro implements PropriedadesDoCarro {

	public Ford(String possuiOpcaoEletrica, String possuiOpcaoAutomatica) {
		super(possuiOpcaoEletrica, possuiOpcaoAutomatica);
	}

	@Override
	public void preco() {
		System.out.println("A média de preco dos carros da Ford é mediana.");
	}

	@Override
	public void manutencao() {
		System.out.println("A manutenção dos carros da Ford tende a ser baixa.");
	}

	@Override
	public void disponibilidadeNoMercado() {
		System.out.println("A disponibilidade de carros da Ford no Brasil é mediana.");
	}

	@Override
	public void consumo() {
		System.out.println("Os carros da Ford tendem a ser econômicos.");		
	}

	@Override
	public void disponibilidadeDePecas() {
		System.out.println("A disponibilidade de peças da Ford no Brasil é alta.");
	}


}
