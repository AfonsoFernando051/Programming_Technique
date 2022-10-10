package src;

import java.util.Scanner;

public class atividade3_1 {

	public static void main(String[] args) {

	Scanner ler = new Scanner(System.in);

	String city[];
	city = new String[19];
	String compareCity;
	float km[];
	km = new float[19];
	int exit =0 , i ;
	
		for(i=0;i<19;i++){
			do {	
				System.out.printf("Digite o destino: ");
				city[i] = ler.next();			
				if(city[i].equalsIgnoreCase("fim")) {
					break;
				}
				else {
					for(i=i;i<=19;i++) {
						System.out.printf("Digite a distancia ate o local: ");
						km[i] = ler.nextInt();
						do{ 
							System.out.printf("A distancia deve ser maior que 500km\n");
						}while(km[i]<500);
					}
				}
				
			 }while(exit==0);		
		}
		do {
			System.out.printf("pesquisa de destino?\n");
			compareCity = ler.next();
			if(compareCity.equalsIgnoreCase("fim")) {
				break;
			}
					for(i=0;i<=19;i++) {
						if(compareCity.equalsIgnoreCase(city[i])) {
							System.out.printf("A duracao do voo sera de %.2f min., custando: R$ %.2f. e parando %.0f\n"
									, (km[i]*60)/800 , km[i]*0.25 , ((km[i]*60)/800 )/180);
							break;
						}
						else {
							System.out.printf("A cidade nao foi encontrada\n");
							break;
						}
					}
		}while(exit==0);

	}

}