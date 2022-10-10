package src;
import java.util.*;
public class Atividade4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		int codigo = 0;
		int pecas = 0;
		float retorno = 0;
		String nome = "";
		int i = 0;
		String confirma = "";
		float acumulaSalario = 0;
		float mediaSalario = 0;
			do {
				System.out.print("Digite o nome do empregado: ");
				nome = ler.next();
				do {
					System.out.print("Digite o codigo do empregado (3 digitos): ");
					codigo = ler.nextInt();
					if(codigo <1 && codigo > 999) {
						System.out.print("Codigo do invalido");
					}
				}while(codigo <1 && codigo > 999);
				do {
					System.out.print("Digite o numero de pecas produzidas no mes: ");
					pecas = ler.nextInt();
				}while(pecas == 0);

				retorno = salarioEmpregado(pecas);
				acumulaSalario = acumulaSalario + retorno;
				i++;
				
				System.out.println("Nome: \n " + nome + "\nsalario: \n " + retorno + " reais\n");
				System.out.print("Quer continuar? (SIM/NAO) ");
				confirma = ler.next();
			}while(confirma.equalsIgnoreCase("SIM") || i == 100);
			
			mediaSalario = acumulaSalario/i;
			
		System.out.println("Total pago com salarios : " + acumulaSalario);
		System.out.println("Media de salarios : " + mediaSalario);

		
	}
	public static float salarioEmpregado (int numPecas) {
	
		float salario = 0;
		if(numPecas >= 1 && numPecas <=200 ) {
			salario = numPecas *2;
		} else if(numPecas >= 201 && numPecas <=400 ) {
			salario = numPecas *(float)2.30;
		} else if(numPecas > 400 ) {
			salario = numPecas *(float)2.50;
		}
		return salario;

	}
}
