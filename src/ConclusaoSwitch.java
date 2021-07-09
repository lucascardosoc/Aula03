import java.util.Scanner;

public class ConclusaoSwitch {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int opcao;
		System.out.println("Elogiador");
		System.out.println("Escolha uma opção de 1 á 3");
		opcao = leitor.nextInt();
		
		switch (opcao) {
		default:
			System.out.println("OPÇÃO INVÁLIDA");
			break;
		case 1:
			System.out.println("Você é educado");
			break;
		case 2:
			System.out.println("Você é muito legal");
			break;
		case 3:
			System.out.println("Você é simpático");
			break;
		
		}

		leitor.close();
		
	}

}
