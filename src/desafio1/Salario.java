package desafio1;

public class Salario {

	/* Um funcion�rio de uma empresa recebe, anualmente, aumento salarial.
	Sabe-se que:
	Esse funcion�rio foi contratado em 2005 com sal�rio inicial de R$ 1.000,00;
	Em 2006 ele recebeu aumento de 1,5% sobre seu sal�rio inicial; e
	A partir de 2007, os aumentos salariais sempre corresponderam ao dobro
	do percentual do ano anterior.
	Fa�a um algoritmo que determine o sal�rio atual deste funcion�rio.*/

	public static void main(String[] args) {

		double salario = 1000;
		double aumento = 0.015;
		int anoPrimeiroAumento = 2006;
		int anoAtual = 2018;

		for (int ano = anoPrimeiroAumento; ano <= anoAtual; ano++) {

			aumento = aumento * 2;
			salario = salario + (salario * aumento);

		}

		System.out.println("Sal�rio atual: R$ " + salario);
	}


}

