package pacote1;

import java.util.Scanner;

public class CarroFactory {
	public static void main(String[] args) {
		
		BMW bmw1 = null;
		Chevrolet chv1 = null;
		Ford ford1 = null;
		Hyundai hyn1 = null;
		Volkswagen vkw1 = null;
		
		System.out.println("Está na dúvida na marca do seu próximo carro? Use já o menu de informações gerais de marcas!");
		System.out.println("");
		
		int opcao;
		do {
			System.out.println("As informações são separadas em: Preco, Manutenção, Disponibilidade no Mercado, Consumo e Disponibilidade de peças");
			System.out.println("Escolha a marca do Carro para ver as informações:");
			
			System.out.println("(1) - BMW");
			System.out.println("(2) - Chevrolet");
			System.out.println("(3) - Ford");
			System.out.println("(4) - Hyundai");
			System.out.println("(5) - Volkswagen");
			System.out.println("(0) - Fechar programa");
			Scanner sc = new Scanner(System.in);
			System.out.print("Opção: ");
			opcao = sc.nextInt();
			
			switch (opcao) {
			
			case 1:
				System.out.println("");
				bmw1 = new BMW("Sim", "Sim");
				bmw1.preco();
				bmw1.manutencao();
				bmw1.disponibilidadeNoMercado();
				bmw1.consumo();
				bmw1.disponibilidadeDePecas();
				System.out.println("");
				break;
				
			case 2:
				System.out.println("");
				chv1 = new Chevrolet("Sim", "Sim");
				chv1.preco();
				chv1.manutencao();
				chv1.disponibilidadeNoMercado();
				chv1.consumo();
				chv1.disponibilidadeDePecas();
				System.out.println("");
				break;
				
			case 3:
				System.out.println("");
				ford1 = new Ford("Sim", "Sim");
				ford1.preco();
				ford1.manutencao();
				ford1.disponibilidadeNoMercado();
				ford1.consumo();
				ford1.disponibilidadeDePecas();
				System.out.println("");
				break;
				
			case 4:
				System.out.println("");
				hyn1 = new Hyundai("Sim", "Sim");
				hyn1.preco();
				hyn1.manutencao();
				hyn1.disponibilidadeNoMercado();
				hyn1.consumo();
				hyn1.disponibilidadeDePecas();
				System.out.println("");
				break;
				
			case 5:
				System.out.println("");
				vkw1 = new Volkswagen("Sim", "Sim");
				vkw1.preco();
				vkw1.manutencao();
				vkw1.disponibilidadeNoMercado();
				vkw1.consumo();
				vkw1.disponibilidadeDePecas();
				System.out.println("");
				break;
				
			case 0:
				break;				
			}
			
		} while (opcao != 0);
		
		System.out.println("Fim.");
		
	}
}
