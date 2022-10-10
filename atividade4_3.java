package src;
import java.util.Scanner;
public class atividade4_3 {
	static String vetCidades[] = {"Belo Horizonte", "São Paulo", "Rio de Janeiro", "Salvador","Curitiba"};
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String hospede[] = new String[4];
		float calculoAtual[] = new float[4];
		String quarto;
		String cidade;
		int entrada;
		int saida;
		float todosSalarios[] = new float[3]; 
		float mediaContas = 0; 
		String confirma = "";
		int hosp = 0;
		int h = 0;
		
		do {
		System.out.println("Digite o nome do hospede: \n");
		hospede[hosp] = ler.next();
		do {
			System.out.println("Digite o dia de entrada do hospede: \n");
			entrada = ler.nextInt();
			System.out.println("Digite o dia de saida do hospede: \n");
			saida = ler.nextInt();
			if(entrada>saida || entrada<1 || saida > 31) {
				System.out.println("Data invalida, digite uma data maior que a de entrada. \n");
			}
		}while(entrada>saida || entrada<1 || saida > 31);
		do {
			System.out.println("Digite o tipo de quarto: (STANDARD),(LUXO) ou (SUPERLUXO).\n");
			quarto = ler.next();
				if(quarto.equalsIgnoreCase("STANDARD") == false && quarto.equalsIgnoreCase("LUXO") == false && quarto.equalsIgnoreCase("SUPERLUXO") == false ) {
				System.out.println("Quarto invalido, digite novamente");
			}
		}while(quarto.equalsIgnoreCase("STANDARD") == false && quarto.equalsIgnoreCase("LUXO") == false && quarto.equalsIgnoreCase("SUPERLUXO") == false );
		do {
			System.out.println("Digite o nome da cidade: \n");
			cidade = ler.next();
				if(cidadeEhValida(cidade) == false) {
					System.out.println("Nao possuimos hoteis nesta cidade. Digite uma cidade valida: ");
			}
		}while(	cidadeEhValida(cidade) == false);
		System.out.println("Deseja continuar? (SIM/NAO)\n");
		confirma = ler.next();
		
		calculoAtual[hosp] = calcularConta(entrada, saida, quarto);
		hosp++;
		mediaContas = (mediaContas + calcularConta(entrada, saida, quarto))/hosp;
		}while(confirma.equalsIgnoreCase("SIM") && hosp < 2 );
		
		for(int i = 0; i < hosp;i++) {
		System.out.println("Nome do Hospede		Valor da Conta");
		System.out.println(hospede[i]+"			"	+	calculoAtual[i]+"R$\n");
		}
		do {
			if(calculoAtual[h] > mediaContas) {
			System.out.println(hospede[h] + " pagou " + calculoAtual[h] + ",valor acima da media.\n");
			}
			h++;
		}while(calculoAtual[h] > mediaContas);
	}
	
	public static boolean cidadeEhValida(String city) {
		boolean existe = false;
		for(int i = 0; i<5;i++) {
			if(city.equalsIgnoreCase(vetCidades[i])) {
				existe = true;
				break;
			}
		}
		return existe;
	}
	public static float calcularConta(int checkin, int checkout, String room) {
		float conta = 0;
		float hospedagem;
		
			if(room.equalsIgnoreCase("STANDARD")) {
			conta = 120;
			} else if(room.equalsIgnoreCase("LUXO")) {
			conta = 150;
			} else if(room.equalsIgnoreCase("SUPERLUXO")) {
			conta = 180;
			}
		
			return	hospedagem = (checkout - checkin)*conta;
	
	}
	 
}
