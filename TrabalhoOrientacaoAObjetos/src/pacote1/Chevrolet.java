package pacote1;

public class Chevrolet extends Carro implements PropriedadesDoCarro {
	
	public Chevrolet(String possuiOpcaoEletrica, String possuiOpcaoAutomatica) {
		super(possuiOpcaoEletrica, possuiOpcaoAutomatica);
	}

	@Override
	public void preco() {
		System.out.println("A média de preco dos carros da Chevrolet é alta.");
	}

	@Override
	public void manutencao() {
		System.out.println("A manutenção dos carros da Chevrolet tende a ser mediana.");
	}

	@Override
	public void disponibilidadeNoMercado() {
		System.out.println("A disponibilidade de carros da Chevrolet no Brasil é alta.");
	}

	@Override
	public void consumo() {
		System.out.println("Os carros da Chevrolet tendem a consumir mais do que a média.");		
	}

	@Override
	public void disponibilidadeDePecas() {
		System.out.println("A disponibilidade de peças da Chevrolet no Brasil é alta.");
	}
	
}
