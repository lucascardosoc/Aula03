import java.util.Scanner;

public class ConclusaoSwitch {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int opcao;
		System.out.println("Elogiador");
		System.out.println("Escolha uma op��o de 1 � 3");
		opcao = leitor.nextInt();
		
		switch (opcao) {
		default:
			System.out.println("OP��O INV�LIDA");
			break;
		case 1:
			System.out.println("Voc� � educado");
			break;
		case 2:
			System.out.println("Voc� � muito legal");
			break;
		case 3:
			System.out.println("Voc� � simp�tico");
			break;
		
		}

		leitor.close();
		
	}

}
