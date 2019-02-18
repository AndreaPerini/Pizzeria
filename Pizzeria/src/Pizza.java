
public class Pizza {

	private String nome;
	private String[] ingredienti = new String[10];
	private float prezzo;

	public Pizza() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIngredienti(String[] ingredienti) {
		this.ingredienti = ingredienti;
	}

	public String[] getIngredienti() {
		return ingredienti;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public Pizza(String nome, String[] ingredienti, float prezzo) {
		this.nome = nome;
		this.ingredienti = ingredienti;
		this.prezzo = prezzo;
	}

	public Pizza(String nome, float prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
	}

}
