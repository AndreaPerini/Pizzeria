import java.util.*;

public class Avvia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pizza p;
		String nome;
		String[] ingredienti;
		float prezzo;
		int nIngredienti;
		boolean termina = false;
		do {
			System.out.println(
					"Scegli l'operazione da eseguire:\n1-Inserisci una pizza nel menu\n2-Trova le pizze senza un certo ingredienti\n3-Trova le pizze sopra il prezzo indicato\n4-Vedi una certa pizza\n5-Conta le pizze con più di 10 ingredienti\n6-Trova la pizza più economica");
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
					p = new Pizza(nome, ingredienti, prezzo);
				} else {
					p = new SuperPizza(nome, prezzo, ingredienti);
				}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			default:
				termina = true;
			}
		} while (termina = false);
		System.out.println("Grazie per essere venuto nella nostra pizzeria, Arrivederci");
	}

}
