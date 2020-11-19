package teste;

public class ClasseTeste2 {
	int i = 0;
	ClasseTeste1 classeteste;
	
	ClasseTeste2(int i) { this.i = i; }
	
	public int getI() { return i; }
	public void setI(int i) { this.i = i; }
	public ClasseTeste1 getClasseTeste() { return classeteste; }
	public void setClasseTeste(ClasseTeste1 classe) { classeteste = classe; }
	public ClasseTeste2() {
		classeteste = null;
	}
	
}
