package desafio2;

import java.util.Scanner;

public class Primos {

	/*Elabore um algoritmo para mostrar os números primos existentes em um
	  intervalo. O usuário deverá fornecer os valores inicial (inicial > 0) e final
	  (inicial < final) e os números primos existentes no intervalo ([inicial,
	  final]) devem ser separados por um espaço em branco*/

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numeroInicial;
		int numeroFinal;
		boolean primo;

		System.out.println("Digite o primeiro número: ");
		numeroInicial = ler.nextInt();

		System.out.println("Digite o segundo número: ");
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

