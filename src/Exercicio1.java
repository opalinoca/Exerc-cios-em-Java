import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int anoA, anoN, idade;
		String resposta;

		do {
			System.out.println("Informe o ano atual:");
			anoA = in.nextInt();
			System.out.println("Informe seu ano de nascimento:");
			anoN = in.nextInt();
			
			idade = anoA-anoN;
			
			if (idade<18) {
				System.out.println("Você é menor de idade.");
			}else {
				System.out.println("Você é maior de idade.");

			}
			System.out.println("Deseja continuar a execução? Digite 1 para SIM e 2 para NÃO.");
			resposta=in.next();
		}while(resposta.equalsIgnoreCase("1"));
		in.close();
	}
}
