package io.github.assmaamerkad;


public class Main {

	public static void main(String[] args) {
		Etudiant etudiant1=new Etudiant("Ahmed" , new double[] {15 , 12 , 16});
		Etudiant etudiant2=new Etudiant("Salma", new double[]{18 , 16 , 15});
		Etudiant etudiant3=new Etudiant("Ali", new double[] {19 , 19 , 19});
		
		
		Etudiant[] etudiants= {etudiant1, etudiant2, etudiant3};
		Etudiant meilleur=etudiants[0];
		for (Etudiant e : etudiants ) {
			if (e.moyenne() > meilleur.moyenne()) {
				meilleur=e;
			}
		}
		System.out.println("la moyenne la plus haute est " + meilleur.moyenne() + " celle de : "  +meilleur.getName());

	}

}
