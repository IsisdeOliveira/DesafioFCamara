package desafio5;

/*Crie uma classe para implementar uma conta corrente. A classe deve
possuir os seguintes atributos: número da conta, nome do correntista e
saldo. Os métodos são os seguintes: alterarNome, depósito e saque; No
construtor, saldo é opcional, com valor default zero e os demais atributos
são obrigatórios.*/


public class ContaCorrente {

	private int numeroDaConta;
	private String nomeDoCorrentista;
	private double saldo;
	
	
	public void deposito(double valor) {
		this.saldo = saldo + valor;
	}
	
	public void saque(double valor) {
		this.saldo =  saldo - valor;
	}
	
	
	public ContaCorrente(int numeroDaConta, String nomeDoCorrentista) {
		super();
		this.numeroDaConta = numeroDaConta;
		this.nomeDoCorrentista = nomeDoCorrentista;
		this.saldo = 0;
	}
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	public String getNomeDoCorrentista() {
		return nomeDoCorrentista;
	}
	public void setNomeDoCorrentista(String nomeDoCorrentista) {
		this.nomeDoCorrentista = nomeDoCorrentista;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
		
}
