import java.util.Scanner;

public class main {
	public static void main(String[] args)
	{
		/*Scanner sc= new Scanner(System.in);
		int l = sc.nextInt();
		
		System.out.println("Printando l = " + l);
		System.out.println("Digite uma string: ");
		String string = new String();
		string = sc.next();
		System.out.println("String: " + string);
		ClasseTeste1 teste = new ClasseTeste1(4);
		System.out.println(teste.getI());
		ClasseTeste2 teste2 = new ClasseTeste2(52);
		System.out.println(teste2.getI());
		teste2.setClasseTeste(teste);
		System.out.println("Printando referencia objeto " + teste2.getClasseTeste().getI() + "\n"); // \n funciona tb
		teste.setI(87);
		System.out.println("Valor mudado " + teste2.getClasseTeste().getI());
		Pessoa pessoa = new Pessoa("Lucas Andre", 22, 8, 2000);
		System.out.println("Idade pessoa: " + pessoa.getNome() + " tem " + pessoa.getIdade() + " anos.");
		
		Estudante e1 = new Estudante("Lucas", 22, 8, 2000);
		e1.setRa(2137070);
		e1.mostraDados();
		*/
		//Thread a = new Thread();
		
		Pessoa pessoa1 = new Pessoa(); //sempre por refer�ncia
		System.out.println(pessoa1.validaCpf(52998224725L));
		Estudante e = new Estudante("Lucas",22,8,2000);
		System.out.println(Pessoa.getQuantidadePessoas());
		
		System.out.println("Quantidade carros: " + FabricaCarros.getQuantidadeCarros());
		FabricaCarros.produzirCarro();
		FabricaCarros n = FabricaCarros.getInstance();
		System.out.println("Quantidade carros: " + FabricaCarros.getQuantidadeCarros());
		FabricaCarros.produzirCarro();
		System.out.println("Quantidade carros: " + FabricaCarros.getQuantidadeCarros());
	}
}

//double i = 2.04;
//int a = (int) double;
//long i;
//short i;
//podemos ter metodos privados na classe quando queremos que somente a classe utilize esse m�todo
//JAVA BEAN = classe simples que possui somente get e sets e construtor default, sem logica

