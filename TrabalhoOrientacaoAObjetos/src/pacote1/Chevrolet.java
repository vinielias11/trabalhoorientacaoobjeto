package pacote1;

public class Chevrolet extends Carro implements PropriedadesDoCarro {
	
	public Chevrolet(String possuiOpcaoEletrica, String possuiOpcaoAutomatica) {
		super(possuiOpcaoEletrica, possuiOpcaoAutomatica);
	}

	@Override
	public void preco() {
		System.out.println("A m�dia de preco dos carros da Chevrolet � alta.");
	}

	@Override
	public void manutencao() {
		System.out.println("A manuten��o dos carros da Chevrolet tende a ser mediana.");
	}

	@Override
	public void disponibilidadeNoMercado() {
		System.out.println("A disponibilidade de carros da Chevrolet no Brasil � alta.");
	}

	@Override
	public void consumo() {
		System.out.println("Os carros da Chevrolet tendem a consumir mais do que a m�dia.");		
	}

	@Override
	public void disponibilidadeDePecas() {
		System.out.println("A disponibilidade de pe�as da Chevrolet no Brasil � alta.");
	}
	
}
