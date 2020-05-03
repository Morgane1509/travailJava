//java.lang
//System.out=>Ecran
//System.in=>Clavier
//Scanner se trouve dans util, qui lui se trouve dans java

import java.util.Scanner;
public class Main{

	public static void main(String args[]){
		
		System.out.println("Bonjour à Tous");
		System.out.println("Les Etudiants de la GLRS et MAE");
		
		//Scanner clavier pour lire les données tapées au clavier
		Scanner clavier=new Scanner(System.in);
		System.out.println("Veuillez saisir un Mot");
		
		//Lire une donnée de type chaine
		String prenom = clavier.next();
		System.out.println("Bonjour "+prenom);

		//type primitfs ou de données => int, float, double, char, boolean 
		//classes wappers ou Enveloppes => Integer, Float, Double, Character, Boolean
		//Chaque type primitif a une classe enveloppe
		
		System.out.println("Veuillez saisir un entier");
		int x = clavier.nextInt();
		System.out.println("Le nombre est "+x);

		
		
	

	}

}