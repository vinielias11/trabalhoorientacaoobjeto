package pacote1;

public class Hyundai extends Carro implements PropriedadesDoCarro {

	public Hyundai(String possuiOpcaoEletrica, String possuiOpcaoAutomatica) {
		super(possuiOpcaoEletrica, possuiOpcaoAutomatica);
	}

	@Override
	public void preco() {
		System.out.println("A média de preco dos carros da Hyundai é alta.");
	}

	@Override
	public void manutencao() {
		System.out.println("A manutenção dos carros da Hyundai tende a ser alta.");
	}

	@Override
	public void disponibilidadeNoMercado() {
		System.out.println("A disponibilidade de carros da Hyundai no Brasil é abaixo da média.");
	}

	@Override
	public void consumo() {
		System.out.println("Os carros da Hyundai tem um nível de consumo médio.");		
	}

	@Override
	public void disponibilidadeDePecas() {
		System.out.println("A disponibilidade de peças da Hyundai no Brasil é baixa.");
	}
	
}
