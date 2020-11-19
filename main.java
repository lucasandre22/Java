import java.util.*;
import AbstractClass.*;
import JavaTemplates.*;

public class main {
	public static void main(String[] args)
	{
		/*Scanner sc= new Scanner(System.in);
		int l = sc.nextInt();
		
		System.out.println("Printando l = " + l);
		System.out.println("Digite uma string: ");
		String string = new String();
		string = sc.next(); // SCAN DE STRING
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
		
		/*Vector<Integer> v = new Vector<Integer>(); //vector igual c++
		v.add(4);
		v.add(5);

		Iterator<Integer> iterator = v.iterator();
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		Pessoa pessoa1 = new Pessoa(); //sempre por referência
		System.out.println(pessoa1.validaCpf(52998224725L));
		Estudante e = new Estudante("Lucas",22,8,2000);
		System.out.println(Pessoa.getQuantidadePessoas());
		
		System.out.println("Quantidade carros: " + FabricaCarros.getQuantidadeCarros());
		FabricaCarros.produzirCarro();
		FabricaCarros n = FabricaCarros.getInstance();
		System.out.println("Quantidade carros: " + FabricaCarros.getQuantidadeCarros());
		FabricaCarros.produzirCarro();
		System.out.println("Quantidade carros: " + FabricaCarros.getQuantidadeCarros());*/
		
		Apartamento ap = new Apartamento("Rua gonçalves", 45, "Curitiba", "Paraná");
		ap.setAndar(4);
		ap.setCondominio("Guartela");
		ap.setCep(83404430);
		ap.setSindico("Seu zé");
		System.out.println(ap.getTipoMoradia());
		System.out.println(ap.getDadosEndereco());

		Vetor vetor = new Vetor();
		vetor.add(1);
		vetor.add(2);
		vetor.add(3);
		vetor.add(4);
		vetor.add(5);
		vetor.add(6);
		vetor.add(7);
		vetor.add(8);
		vetor.initializeIterator();
		while(vetor.iteratorHasNext()) {
			System.out.println(vetor.getIterator().next());
		}
		
		
		//testar minha lista template
		MyListTemplate<Integer> lista = new MyListTemplate<Integer>();
		lista.add(4);
		lista.add(5);
		lista.add(6);
		lista.add(7);
		lista.add(8);
		lista.add(9);
		lista.add(10);
		lista.print();
		
	}
}

//double i = 2.04;
//int a = (int) double;
//long i;
//short i;
//podemos ter metodos privados na classe quando queremos que somente a classe utilize esse método
//JAVA BEAN = classe simples que possui somente get e sets e construtor default, sem logica

