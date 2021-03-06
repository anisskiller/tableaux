package tableau1;

import java.util.Scanner;
 
public class Exo9 {
	public static void main(String [] args) 
	{ 
		// Ecrivez un algorithme permettant, toujours sur le m�me principe, 
		// � l�utilisateur de saisir un nombre d�termin� de valeurs.
		// Le programme, une fois la saisie termin�e, renvoie la plus grande valeur 
		// en pr�cisant quelle position elle occupe dans le tableau.
		// On prendra soin d�effectuer la saisie dans un premier temps, 
		// et la recherche de la plus grande valeur du tableau dans un second temps.
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Exercice 9 Tableaux");
			
			int n=0;
			int plusgrand=-1;
			System.out.println("Entrez le nombre de valeurs : ");
			n = Integer.parseInt(sc.nextLine());
			int tbl[] = new int[n];

			int position = 1;
			
			for(int i=0; i<=n-1; i++) {
					System.out.println("Entrez le nombre num�ro : " + (i+1));
					tbl[i] = Integer.parseInt(sc.nextLine());
					if(tbl[i] > plusgrand) {
						// on effectue le test pour d�terminer la valeur la plus grande du tableau 
						plusgrand = tbl[i];
						position = i + 1;
					}
			}
			

			System.out.println("La plus grande valeur est : " + plusgrand);
			System.out.println("Position occup�e : " + position);
			
			
			
	}
}
