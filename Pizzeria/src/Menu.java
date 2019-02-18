//import java.util.ArrayList;

public class Menu {

	// ArrayList <Pizza> menu = new ArrayList<Pizza>();
	private Pizza[] menu = new Pizza[50];
	private static int index = 0;
	private String[] ingr = new String[30];
	private static boolean stampa = true;

	public Menu() {
	}

	public void aggiungiPizza(Pizza pizza) {
		menu[index] = pizza;
		index++;
	}

	public void pizzeSenzaIngrediente(String ingrediente) {
		for (int i = 0; i < index; i++) {
			for (int j = 0; j<menu[i].getIngredienti().length; j++) {
				ingr = menu[i].getIngredienti();
				if (ingr[j].equalsIgnoreCase(ingrediente)) {
					stampa = false;
				}
			}
			if(stampa==true) {
				System.out.println(menu[i].getNome());
			}
			stampa=true;
		}
	}

	public void pizzeCostose(float minimo) {
		for(int i=0; i<index; i++) {
			if(menu[i].getPrezzo() >= minimo) {
				System.out.println(menu[i].getNome());
			}
		}
	}
	
	public void trovaPizza(String nome) {
		for(int i=0; i<index; i++) {
			if(menu[i].getNome().equalsIgnoreCase(nome)) {
				System.out.println(menu[i].getIngredienti());
			}
		}
	}
	
	public void contaPizze() {
		int pizze = 0;
		int superPizze = 0;
		for(int i=0; i<index; i++) {
			if(menu[i].getIngredienti().length<=10) {
				pizze++;
			}
			else {
				superPizze++;
			}
		}
		System.out.println("Nel menu ci sono " + pizze + " pizze e " + superPizze + " superpizze");
	}
	
	public void pizzaPiuEconomica() {
		Pizza economica = menu[0];
		for(int i=1; i<index; i++) {
			if(menu[i].getPrezzo()<economica.getPrezzo()) {
				economica = menu[i];
			}
		}
		System.out.println("La pizza più economica è " + economica.getNome());
	}
	
}
