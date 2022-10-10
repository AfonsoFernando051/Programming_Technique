package src;
import java.util.*;
public class exerciciotelefone {

	public static void main(String[] args) {
		String HoraInicial = "";
		String HoraFinal = ""; 
		String H_inicial;
		String M_inicial;
		String H_Final;
		String M_Final;
		String retorno;
		int Hinicial_int;
		int Minicial_int;
		int Hfinal_int;
		int Mfinal_int;
		float custoMinuto; 
		float calculoConta;
		String validacao;
		
		Scanner ler = new Scanner(System.in);
		do {
		System.out.println("Digite a hora que voce comecou a chamada: (HH:MM)");
		HoraInicial = ler.next();
		System.out.println("Digite a hora que voce terminou a chamada: (HH:MM)");
		HoraFinal  = ler.next();
		
		H_inicial = HoraInicial.substring( 0 , 2);
		Hinicial_int = Integer.parseInt(H_inicial); 	
		M_inicial = HoraInicial.substring( 3 , 5 );
		Minicial_int = Integer.parseInt(M_inicial); 	
		H_Final = HoraFinal.substring( 0 , 2);
		Hfinal_int = Integer.parseInt(H_Final); 	
		M_Final = HoraFinal.substring( 3 , 5 );
		Mfinal_int = Integer.parseInt(M_Final); 
		
		retorno = horaEhValida(HoraInicial);
		System.out.println(retorno);
		do {
			if(retorno.equalsIgnoreCase("false") || Hfinal_int < Hinicial_int || (Hinicial_int == Hinicial_int && Mfinal_int < Minicial_int)){
				System.out.println("Esse valor de hora e invalido, digite um horario valido.");
				System.out.println("Digite a hora que voce comecou a chamada: ");
				HoraInicial = ler.next();
				System.out.println("Digite a hora que voce terminou a chamada: ");
				HoraFinal  = ler.next();
				
				H_inicial = HoraInicial.substring( 0 , 2);
				Hinicial_int = Integer.parseInt(H_inicial); 	
				M_inicial = HoraInicial.substring( 3 , 5 );
				Minicial_int = Integer.parseInt(M_inicial); 	
				H_Final = HoraFinal.substring( 0 , 2);
				Hfinal_int = Integer.parseInt(H_Final); 	
				M_Final = HoraFinal.substring( 3 , 5 );
				Mfinal_int = Integer.parseInt(M_Final); 
				
				retorno = horaEhValida(HoraInicial);
				System.out.println(retorno);
				retorno = "true";
			}else{break;}
		
	
		}while (retorno.equalsIgnoreCase("false") || Hfinal_int < Hinicial_int || (Hinicial_int == Hinicial_int && Mfinal_int < Minicial_int) );
		
	
		
		if (Hinicial_int < 6 ) {
			custoMinuto = (float)0.10;
		} else if (Hinicial_int < 8) {
			custoMinuto = (float)0.15;
		} else if (Hinicial_int < 18) {
			custoMinuto = (float)0.20;
		} else {
			custoMinuto = (float)0.15;
		}
		
		// Calculo
		
		calculoConta = ((Hfinal_int - Hinicial_int) * 60 + Mfinal_int - Minicial_int)*custoMinuto;
		 
		System.out.printf("O valor da conta e: %.2f\n", calculoConta);
		System.out.println("Deseja continuar? (SIM/NAO)\n");
		validacao = ler.next();
		}while(validacao.equalsIgnoreCase("Sim"));
	}
	
	public static String horaEhValida (String hora) {
		
		String NovaHora; 
		String NovoMinuto;
		int NovaHora_int;
		int NovoMinuto_int;
		boolean validacao = true;
		String Validacao_string = "True";
		
		NovaHora = hora.substring( 0 , 2);
		NovaHora_int = Integer.parseInt(NovaHora);	
		NovoMinuto = hora.substring( 3 , 5 );
		NovoMinuto_int = Integer.parseInt(NovoMinuto); 
		
		if (NovaHora_int > 23) {
			validacao = false;
			Validacao_string = "False";
		} 
		
		if (NovoMinuto_int > 59) {
			validacao = false;
			Validacao_string = "False"; 
			
		}
		
		return Validacao_string;
	} 

}