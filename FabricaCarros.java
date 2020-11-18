
//padrão singleton

public class FabricaCarros {
	private int id;
	private static int quantidadeCarros;
	private static FabricaCarros instance;
	
	
	
	
	FabricaCarros(){
		id = 0;
		quantidadeCarros = 0;
	}
	
	
	public static FabricaCarros getInstance() { 
		if(instance == null) 
			instance = new FabricaCarros(); 
		return instance;
	}
	public static int getQuantidadeCarros() { return quantidadeCarros; }
	public static void produzirCarro() { if(instance != null ) quantidadeCarros++; else System.out.println("Erro"); }
}
