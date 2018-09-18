import java.util.Scanner;

public class ExoTableau {

	public static void main(String[] args) {
		String cours [] = {"Java" , "Html", "CSS", "Javascript", "PHP", "C++","NodeJS", ".NET", "Typescript", "Golang", "Scala", "Kotlin"};
		// 1. Afficher les �l�ments du tableau 
		for (int i = 0; i < cours.length; i++) {
			System.out.println(cours[i]);
			// System.out.println("Mati�re : " + cours[i]);
			// System.out.println("Mati�re : " + cours[i] + ",");
		}
		
		// 2. Afficher les �l�ments sur la m�me ligne s�par�s par �, �
		for (int i = 0; i < cours.length; i++) {
			System.out.print(cours [i] + ", ");
		}

		for (int i = 0; i < cours.length; i++) {
			System.out.println(cours [i] + " = 10. ");
		}

		for (int i = 0; i < cours.length; i++) {
			System.out.print(cours [i] + " = 10. ");
		}

		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Saisir le nom : ");
		sc.nextLine();
		
		// Les indices
		System.out.println();
		for (int i = 0; i < cours.length; i++) {
			System.out.println("Indice : " + i + "     Valeur : " + cours[i]);
		}
		
		for (int i = 0; i < cours.length; i++) {
			if(cours[i].equals("PHP")) {
				System.out.println("PHP se trouve � l'indice " + i) ;
			}else {
				System.out.println("A l'indice " + i + " se trouve la valeur :  "  + cours[i]);
			}
		}
		
		
		System.out.println("Veuillez saisir le nom d'un mati�re: ");
		String varUtilisaateur = sc.nextLine();
		for (int i = 0; i < cours.length; i++) {
			if(cours[i].equals(varUtilisaateur)) {
				System.out.println("La valeur " + varUtilisaateur + " se trouve � l'indice " + i);
			}else {
				System.out.println("La valeur "  + varUtilisaateur  + " est diff�rente de la valeur pr�snete dans le tableau � l'indice " + i);
			}
		}
		
		System.out.println("Veuillez saisir le nom d'une mati�re:");
		boolean existe = false ; 
		
		String nomMatiere = sc.nextLine();
		int indice = 0 ;
		for (int i = 0; i < cours.length; i++) {
			if(nomMatiere.equals(cours[i])) {
				existe = true;
				indice = i;
			}
		}
		
		if(existe) {
			System.out.println("La valeur " + varUtilisaateur + " se trouve danns le tableau � l'indice :" + indice );
		}else {
			System.out.println("La valeur " + varUtilisaateur + " ne se trouve pas danns le tableau" );
		}
		
	}
}
