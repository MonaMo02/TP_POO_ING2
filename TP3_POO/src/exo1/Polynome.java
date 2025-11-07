package exo1;

public class Polynome {
	
	public Monome[] terms  = new Monome[3];
	
	public Polynome (Monome m1, Monome m2, Monome m3) {
		terms[0] = m1;
		terms[1] = m2;
		terms[2] = m3;
	}
	
	public int degree() {
		int max = -1;
		
		for(int i = 0; i<terms.length; i++) {
			if(terms[i].coefficient != 0) {
				if(terms[i].degree > max) {
					max = terms[i].degree;
				}
			}
		}
		return max;
	}
	
	public Polynome derive() {
		Monome[] derivatives = new Monome[3];
		
		for(int i = 0; i<terms.length; i++) {
			derivatives[i] = terms[i].derive();
		}
		
		return new Polynome(derivatives[0], derivatives[1], derivatives[2]);
	}
	
	
	public double evaluate (float x) {
		double sum = 0;
		
		for(int i = 0; i < terms.length; i++) {
			sum = sum + terms[i].evaluate(x);
		}
		
		return sum; 
	}
	
	public boolean equals(Polynome p) {
		
	return (terms[0].equals(p.terms[0])) && 
			(terms[1].equals(p.terms[1])) && 
			terms[2].equals(p.terms[2]);
	}
	
	
	

}
