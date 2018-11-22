package simon.thesimonlp.philosophie.person;

public class Person {
	public Person(int gehalt, boolean faul, boolean unehrlich, boolean aggressiv) {
		this.gehalt = gehalt;
		if(gehalt > 2) {
			this.gehalt = 2;
		}
		this.faul = faul;
		this.unehrlich = unehrlich;
		this.aggressiv = aggressiv;
	}
	
	private int gehalt = 1;
	private boolean faul = false;
	private boolean unehrlich = false;
	private boolean aggressiv = false;
	
	public boolean isFaul() {
		if(faul == true) {
			return true;
		}
		return false;
	}
	
	public boolean isUnehrlich() {
		if(unehrlich == true) {
			return true;
		}
		return false;
	}
	
	public boolean isAggressiv() {
		if(aggressiv == true) {
			return true;
		}
		return false;
	}
	
	public int getGehalt() {
		return this.gehalt;
	}
	
	public void print() {
		System.out.println("Gehaltgruppe: " + this.gehalt);
		System.out.println("Faul: " + this.faul);
		System.out.println("Unehrlich: " + this.unehrlich);
		System.out.println("Aggressiv: " + this.aggressiv);
	}
}
