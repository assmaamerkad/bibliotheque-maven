package io.github.assmaamerkad;


public class Etudiant {
	
	private String name ;
	private  double[] notes;
	
	public String getName() {
		return name;
	}
	
	public Etudiant(String name, double[] notes) {
		this.name=name;
		this.notes=notes;
	}
	
	
	public double moyenne() {
		double moyenne=0;
		for(double note : notes ) {
			moyenne+=note;
		}
		return moyenne/notes.length ;
	}
	

}
