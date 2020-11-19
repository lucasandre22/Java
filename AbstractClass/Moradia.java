package AbstractClass;
import java.util.*;

abstract class Moradia {
	protected String rua;
	protected String complemento;
	protected String cidade;
	protected String estado;
	protected int numero;
	protected long cep;
	
	Moradia() {
		rua = "";
		complemento = "";
		cidade = "";
		estado = "";
		numero = 0;
		cep = 0;
	}
	
	Moradia(String rua, int numero, String cidade, String estado) {
		this.rua = rua; 
		this.numero = numero;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public String getDadosEndereco() {
		String dados = rua + ' ' + numero + ' ' + cidade + ' ' + estado + ' ' + cep + '\n';
		return dados;
	}
	
	abstract public String getTipoMoradia();
	
	public String getRua() { return rua; }
	public String getComplemento() { return complemento; }
	public String getCidade() { return cidade; }
	public String getEstado() { return estado; }
	public int getNumero() { return numero; }
	public long getCep() { return cep; }
	
	public void setRua(String rua) { this.rua = rua; }
	public void setComplemento(String complemento) { this.complemento = complemento; }
	public void setCidade(String cidade) { this.cidade = cidade; }
	public void setEstado(String estado) { this.estado = estado; }
	public void setNumero(int numero) { this.numero = numero; }
	public void setCep(long cep) { this.cep = cep; }
	
	
}
