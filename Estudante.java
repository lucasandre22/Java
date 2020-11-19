
public class Estudante extends Pessoa {
	private int ra;

	Estudante(String n, int dia, int mes, int ano) {
		super(n, dia, mes, ano); // chama construtor superior
	}

	Estudante() {
		// super(); já é chamado, nao é preciso
		System.out.println("Construtor estudante!");
	}

	public void mostraDados() {
		super.mostraDados(); // chama mostra dados do superior
		System.out.println("RA: " + ra);
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int r) {
		ra = r;
	}

}

//para boolean, utilizar is ao inves de get. isAlive(), isPardo()
/*
 * public Module() { super(); this.name = null; this.credits = 0; this.hours =
 * 0; }
 * 
 * This is exactly the same as
 * 
 * public Module() {
 * 
 * }
 */
