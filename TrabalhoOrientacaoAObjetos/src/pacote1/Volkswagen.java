package pacote1;

public class Volkswagen extends Carro implements PropriedadesDoCarro {
	
	public Volkswagen(String possuiOpcaoEletrica, String possuiOpcaoAutomatica) {
		super(possuiOpcaoEletrica, possuiOpcaoAutomatica);
	}

	@Override
	public void preco() {
		System.out.println("A média de preco dos carros da Volkswagen é baixa.");
	}

	@Override
	public void manutencao() {
		System.out.println("A manutenção dos carros da Volkswagen tende a ser baixa.");
	}

	@Override
	public void disponibilidadeNoMercado() {
		System.out.println("A disponibilidade de carros da Volkswagen no Brasil é alta.");
	}

	@Override
	public void consumo() {
		System.out.println("Os carros da Volkswagen tendem a consumir um pouco mais do que o média.");		
	}

	@Override
	public void disponibilidadeDePecas() {
		System.out.println("A disponibilidade de peças da Volkswagen no Brasil é alta.");
	}
}
