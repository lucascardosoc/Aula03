import java.util.Random;

public class ConclusaoSwitchAleatorio {

	public static void main(String[] args) {
		Random gerador = new Random();
		int opcao;
		System.out.println("Elogiador");
		opcao = gerador.nextInt(3);
		System.out.println(opcao);

		switch (opcao) {
		default:
			System.out.println("OP��O INV�LIDA");
			break;
		case 0:
			System.out.println("Voc� � educado");
			break;
		case 1:
			System.out.println("Voc� � muito legal");
			break;
		case 2:
			System.out.println("Voc� � simp�tico");
			break;

		}

	}

}
