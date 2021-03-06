package tableau2;

public class Exo4 {
	
	// Soit un tableau T à deux dimensions (12, 8) préalablement rempli de valeurs numériques.
	// Écrire un algorithme qui recherche la plus grande valeur au sein de ce tableau.
	
	public static void main(String[] args) {
		
		System.out.println("Exercice 4 Tableaux multidimensionnels");


		int mini = 0;
		int max = 10;
		int range = max - mini ;
		int imax = 0;
		int jmax = 0;
		int mmax = 0;

		int[][] table = new int[12][8];
 
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				table[i][j] = (int) ((Math.random() * range) - mini); // La fonction Math.random()
				// nous permet de générer des valeurs aléatoires dans le tableau
				if (table[i][j] > mmax) {
					mmax = table[i][j];
					imax = i;
					jmax = j;
				}
				System.out.print(table[i][j]+ " ");
			}
			System.out.println(" ");
		}
		System.out.println();
		System.out.println("Le plus grand élément est " + mmax + " et il se trouve aux indices " + imax + "," + jmax);
		
		
	}
}
