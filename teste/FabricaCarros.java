package teste;

// padrao singleton
public class FabricaCarros {
	private int id;
	private static int quantidadeCarros;
	private static FabricaCarros instance;

	private FabricaCarros() { //para previnir instancia desse objeto fora da classe, já que é singleton
		id = 0;
		quantidadeCarros = 0;
	}

	public static FabricaCarros getInstance() {
		if (instance == null)
			instance = new FabricaCarros();
		return instance;
	}

	public static int getQuantidadeCarros() {
		return quantidadeCarros;
	}

	public static void produzirCarro() {
		if (instance != null)
			quantidadeCarros++;
		else
			System.out.println("Erro, objeto ainda não foi referenciado!");
	}
}
