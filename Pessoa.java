//import java.util.Calendar;  
import java.util.*; //inclui todas as bibliotecas do java util

public class Pessoa {
	protected String nome;
	protected int idade;
	protected String endereco;
	protected int anoNascimento;
	protected int mesNascimento;
	protected int diaNascimento;
	protected long cpf;
	protected static int quantidadePessoas = 0;
	protected int id;
	
	public void mostraDados() {
		System.out.println(nome + " tem " + idade + " anos.");
		System.out.println("Nasceu no dia " + diaNascimento + ' ' + mesNascimento + ' ' + anoNascimento);
	}
	
	public boolean validaCpf(long cpf) {
		long divisor = 10000000000L;
		long[] vetor = new long[11];
		int n = 0;
		int j = 0;
		int digito;
		for(int i = 0; i < 11; i++)
		{
			vetor[i] = (cpf/divisor);
			vetor[i] =  vetor[i] % 10;
			divisor = divisor/10;
		}
		digito = (int)vetor[0];
		for(int i = 0; i < 11; i ++)
		{
			if(digito != vetor[i])
				break;
			else if(i == 10)
				return false;
		}
		for(int i = 10; i > 1; i--)
		{
			n = (int) (vetor[j] * i) + n;
			j++;
		}
		//if(n * 10 / 11 != vetor[9] || )
		System.out.println(n);
		System.out.println(Arrays.toString(vetor));
		return true;
	}
	
	
	Pessoa(String n, int dia, int mes, int ano)
	{
		this(n); //ja inicializa o nome chamando a construtora ali em baixo
		Calendar date = Calendar.getInstance();
		anoNascimento = ano;
		diaNascimento = dia;
		mesNascimento = mes;
		idade = date.get(Calendar.YEAR) - ano;
		if(mes > date.get(Calendar.MONTH) || mes == date.get(Calendar.MONTH) && dia > date.get(Calendar.DAY_OF_MONTH))
		{
			idade--;
		}
	}
	
	Pessoa(String n)
	{
		this();
		nome = n;
	}
	
	Pessoa()
	{
		//nome = "";
		//idade = 0;
		//endereco = "";
		//anoNascimento = 1;
		//mesNascimento = 1;
		//diaNascimento = 1901;
		System.out.println("Construtor Pessoa");
		setId(quantidadePessoas);
		increasePessoas();
	}
	
	
	public int getIdade() { return idade; }
	public String getNome() { return nome; }
	public void setEndereco(String e) { endereco = e; }
	public String getEndereco() { return endereco; }
	public int getCpf() { return (int) cpf; }
	public void setCpf(int c) { cpf = c; }
	public static int getQuantidadePessoas() { return quantidadePessoas; }
	private void increasePessoas() { quantidadePessoas++; }
	private void setId(int i) { id = i; }
	
}
