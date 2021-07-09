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
			System.out.println("OPÇÃO INVÁLIDA");
			break;
		case 0:
			System.out.println("Você é educado");
			break;
		case 1:
			System.out.println("Você é muito legal");
			break;
		case 2:
			System.out.println("Você é simpático");
			break;

		}

	}

}
