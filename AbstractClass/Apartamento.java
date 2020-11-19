package AbstractClass;

public class Apartamento extends Moradia{
	private String condominio;
	private String sindico;
	private int andar;
	
	
	Apartamento() {
		condominio = "";
		andar = 0;
		sindico = "";
	}
	
	public Apartamento(String rua, int numero, String cidade, String estado) {
		super(rua, numero, cidade, estado);
	}
	
	public String getDadosEndereco() {
		String dados = super.getDadosEndereco();
		dados += "Condominio " + condominio + ' ' + "Andar " + andar;
		return dados;
	}
	
	@Override
	public String getTipoMoradia() {
		String ap = "Apartamento";
		return ap;
	}
	
	public String getCondominio() { return condominio; }
	public void setCondominio(String condominio) { this.condominio = condominio; }
	public String getSindico() { return sindico; }
	public void setSindico(String sindico) { this.sindico = sindico; }
	public int getAndar() { return andar; }
	public void setAndar(int andar) { this.andar = andar; }
	public String getGetCondominio() { return condominio; }
	public void setGetCondominio(String getCondominio) { this.condominio = getCondominio; }

	
}
