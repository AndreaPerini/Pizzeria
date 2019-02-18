
public class SuperPizza extends Pizza {

	private String [] piuIngredienti = new String [30];
	
	public SuperPizza() {
		super();
	}

	public SuperPizza(String nome, float prezzo, String[] piuIngredienti) {
		super(nome, prezzo);
		this.piuIngredienti = piuIngredienti;
	}

	public String[] getPiuIngredienti() {
		return piuIngredienti;
	}

	public void setPiuIngredienti(String[] piuIngredienti) {
		this.piuIngredienti = piuIngredienti;
	}

	
	
}
