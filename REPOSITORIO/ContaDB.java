package BR.UNIPE.MLPIII.DESAFIO3.REPOSITORIO;

public class ContaDB {

	private int id;
	private String numero;
	private double saldo;
	private boolean status;
	private String titular;

	public ContaDB() {
	}

	public int getId() {
		return id;
	}

	public int setId(int id) {
	return	this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public String setNumero(String numero) {
		return this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public double setSaldo(double saldo) {
		return this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public boolean setStatus(boolean status) {
		return this.status = status;
	}

	public String getTitular() {
		return titular;
	}
	public String setTitular(String titular) {
		return this.titular = titular;
	}

}
