package pacote1;

public class BMW extends Carro implements PropriedadesDoCarro {
	
	public BMW(String possuiOpcaoEletrica, String possuiOpcaoAutomatica) {
		super(possuiOpcaoEletrica, possuiOpcaoAutomatica);
	}

	@Override
	public void preco() {
		System.out.println("A média de preco dos carros da BMW é altíssima.");
	}

	@Override
	public void manutencao() {
		System.out.println("A manutenção dos carros da BMW tende a ser baixa.");
	}

	@Override
	public void disponibilidadeNoMercado() {
		System.out.println("A disponibilidade de carros da BMW no Brasil é baixa.");
	}

	@Override
	public void consumo() {
		System.out.println("Os carros da BMW tendem a consumir muito.");		
	}

	@Override
	public void disponibilidadeDePecas() {
		System.out.println("A disponibilidade de peças da BMW no Brasil é baixa.");
	}
	
}
