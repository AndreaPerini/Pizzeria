import java.util.*;

public class Avvia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pizza p = new Pizza();
		SuperPizza sp = new SuperPizza();
		String nome;
		String[] ingredienti;
		float prezzo;
		int nIngredienti;
		boolean termina = false;
		Menu m = new Menu();
		do {
			System.out.println(
					"Scegli l'operazione da eseguire:\n1-Inserisci una pizza nel menu\n2-Trova le pizze senza un certo ingredienti\n3-Trova le pizze sopra il prezzo indicato\n4-Vedi gli ingredienti di una pizza\n5-Conta le pizze\n6-Trova la pizza più economica");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Inserisci il nome della pizza: ");
				nome = sc.next();
				System.out.println("Inserisci il numero di ingredienti: ");
				nIngredienti = sc.nextInt();
				if (nIngredienti <= 10) {
					ingredienti = new String[10];
				} else {
					ingredienti = new String[30];
				}
				for (int i = 0; i < nIngredienti; i++) {
					System.out.println("Inserisci l'ingrediente: ");
					ingredienti[i] = sc.next();
				}
				for (int i = nIngredienti; i < ingredienti.length; i++) {
					ingredienti[i] = null;
				}
				System.out.println("Inserisci il prezzo della pizza: ");
				prezzo = sc.nextFloat();
				if (ingredienti.length == 10) {
					p.setNome(nome);
					p.setIngredienti(ingredienti);
					p.setPrezzo(prezzo);
				} else {
					sp.setNome(nome);
					sp.setPrezzo(prezzo);
					sp.setIngredienti(ingredienti);
				}
				break;
			case 2:
				System.out.println("Inserisci l'ingrediente indesiderato per visualizzare le pizze senza di esso");
				m.pizzeSenzaIngrediente(sc.next());
				break;
			case 3:
				System.out.println("Inserisci il prezzo minimo");
				m.pizzeCostose(sc.nextFloat());
				break;
			case 4:
				System.out.println("Inserisci il nome della pizza di cui vuoi vedere gli ingredienti");
				m.trovaPizza(sc.next());
				break;
			case 5:
				m.contaPizze();
				break;
			case 6:
				m.pizzaPiuEconomica();
				break;
			default:
				termina = true;
			}
		} while (!termina);
		System.out.println("Grazie per essere venuto nella nostra pizzeria, Arrivederci");
		sc.close();
	}

}
