package desafio3;

import java.util.Scanner;

public class HorasTrabalhadas {

	/*Receba o n�mero de horas trabalhadas por uma pessoa e o valor do
	sal�rio m�nimo e mostre o sal�rio a receber baseado nas seguintes regras:
	A hora trabalhada equivale a 10% do sal�rio m�nimo informado;
	O sal�rio bruto � dado pelo n�mero de horas trabalhadas multiplicado pelo
	valor de cada hora;
	O imposto pago � de 3%.
	O sal�rio a receber � equivalente ao sal�rio bruto subtra�do do imposto.*/

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int horasTrabalhadas;
		double salarioMinimo;
		double valorHoraTrabalhada;
		double salarioBruto;
		double salarioLiquido;
		
		System.out.println("Informe as horas trabalhadas:");
		horasTrabalhadas = ler.nextInt();
		
		System.out.println("Informe o sal�rio m�nimo:");
		salarioMinimo = ler.nextDouble();
		
		ler.close();
		
		valorHoraTrabalhada = salarioMinimo * 0.1;
		
		salarioBruto = valorHoraTrabalhada * horasTrabalhadas;
		
		salarioLiquido = salarioBruto - (salarioBruto/100 * 3);
		
		System.out.println("O sal�rio a receber �: " + salarioLiquido);	

	}
}	
