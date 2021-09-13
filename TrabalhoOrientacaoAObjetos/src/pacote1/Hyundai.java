package pacote1;

public class Hyundai extends Carro implements PropriedadesDoCarro {

	public Hyundai(String possuiOpcaoEletrica, String possuiOpcaoAutomatica) {
		super(possuiOpcaoEletrica, possuiOpcaoAutomatica);
	}

	@Override
	public void preco() {
		System.out.println("A m�dia de preco dos carros da Hyundai � alta.");
	}

	@Override
	public void manutencao() {
		System.out.println("A manuten��o dos carros da Hyundai tende a ser alta.");
	}

	@Override
	public void disponibilidadeNoMercado() {
		System.out.println("A disponibilidade de carros da Hyundai no Brasil � abaixo da m�dia.");
	}

	@Override
	public void consumo() {
		System.out.println("Os carros da Hyundai tem um n�vel de consumo m�dio.");		
	}

	@Override
	public void disponibilidadeDePecas() {
		System.out.println("A disponibilidade de pe�as da Hyundai no Brasil � baixa.");
	}
	
}
