
public class Tableau1D {

	public static void main(String[] args) {

		int entiersPremiers [] = {2, 3, 5, 7, 11, 13, 17, 19, 23};
		int [] entiersP = {2, 4, 6, 8, 10, 12};
		int [] tableauImp = new int[5];
		tableauImp[0] = 1;
		tableauImp[1] = 3;
		tableauImp[2] = 5;
		tableauImp[3] = 7;
		tableauImp[4] = 9;
		
		int tailleTableau = entiersPremiers.length;
		
		System.out.println("La taille du tableau : " + tailleTableau);
		
		System.out.println("Le premier �lement du tableau : "  + entiersPremiers[0]);
		System.out.println("Le 2�me �lement du tabkleau : "  + entiersPremiers[1]);
		System.out.println("Le 3�me  �lement du tabkleau : "  + entiersPremiers[2]);
		System.out.println("Le 3�me  �lement du tabkleau : "  + entiersPremiers[3]);
		System.out.println("Le 3�me  �lement du tabkleau : "  + entiersPremiers[4]);
		System.out.println("Le 3�me  �lement du tabkleau : "  + entiersPremiers[5]);
		System.out.println("Le 3�me  �lement du tabkleau : "  + entiersPremiers[6]);
		System.out.println("Le 3�me  �lement du tabkleau : "  + entiersPremiers[7]);
		System.out.println("Le 3�me  �lement du tabkleau : "  + entiersPremiers[8]);
		
		/*
		 * Parcourir un tableau et afficher le contenu 
		 */
		for (int i = 0; i < entiersPremiers.length; i++) {
			System.out.println(entiersPremiers[i]);
		}
		
		String chaines [] = {"Java" , "Html", "CSS", "Javascript", "PHP", "C++","NodeJS"};
		System.out.println("La premi�re chaine : " + chaines[0]);
		/*
		 * Parcourir un tableau et afficher le contenu 
		 * Tableau de chaines de caract�res
		 */
		for (int i = 0; i < chaines.length; i++) {
			System.out.println("Mati�re : " + chaines[i]);
		}
		System.out.println("FIN");
		int resultat = 0 ;
		
		/*
		 * Parcourir un tableau et appliquer un traitement 
		 * +
		 */
		for (int i = 0; i < entiersPremiers.length; i++) {
			resultat = resultat + entiersPremiers[i];
			System.out.println("Resultat int : " + resultat );
		}
		System.out.println("Resultat final = " + resultat);
		
		/*
		 * Parcourir un tableau et appliquer un traitement 
		 * *
		 */
		int resultatMult = 1;
		for (int i = 0; i < entiersPremiers.length; i++) {
			resultatMult = resultatMult * entiersPremiers[i];
			System.out.println("Resultat Int : " + resultatMult);
		}
		System.out.println("Resultat final = " + resultatMult);
		
		/*
		 * Parcourir un tableau et appliquer un traitement 
		 * Chaines de caract�res
		 */
		String resultatChaines = "" ;
		for (int i = 0; i < chaines.length; i++) {
			resultatChaines = resultatChaines + chaines[i];
			System.out.println("Resultat INT : " + resultatChaines);
		}
		
		/*
		 * Parcourir un tableau et Chercher un �l�meent  
		 * Condition if 
		 */
		for (int i = 0; i < entiersPremiers.length; i++) {
			if(entiersPremiers[i] == 11) {
				System.out.println("Le tableau contient la valeur " + entiersPremiers[i]);
			}
		}
	}
}
