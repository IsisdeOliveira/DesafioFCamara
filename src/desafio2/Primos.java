package desafio2;

import java.util.Scanner;

public class Primos {

	/*Elabore um algoritmo para mostrar os n�meros primos existentes em um
	  intervalo. O usu�rio dever� fornecer os valores inicial (inicial > 0) e final
	  (inicial < final) e os n�meros primos existentes no intervalo ([inicial,
	  final]) devem ser separados por um espa�o em branco*/

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numeroInicial;
		int numeroFinal;
		boolean primo;

		System.out.println("Digite o primeiro n�mero: ");
		numeroInicial = ler.nextInt();

		System.out.println("Digite o segundo n�mero: ");
		numeroFinal = ler.nextInt();

		ler.close();
		
		for (int numero = numeroInicial; numero <= numeroFinal; numero++) {

			primo = true;

			for (int numeroDivisor = 1; numeroDivisor <= numero; numeroDivisor++) {

				if(numero % numeroDivisor == 0  &&  numero != numeroDivisor && numeroDivisor != 1 && numeroDivisor != 0) {
					primo = false;
				}
			}

			if (primo == true && numero > 1) {
				System.out.print(numero + " ");
			}
		}


	}


}

