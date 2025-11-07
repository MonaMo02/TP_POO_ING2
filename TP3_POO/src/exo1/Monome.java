package exo1;

public class Monome {
	
	public double coefficient;
	public int degree;
	
	public Monome(double coefficient, int degree) {
		this.coefficient = coefficient;
		this.degree = degree;
	}
	
	public Monome(double coefficient) {
		this.coefficient = coefficient;
		degree = 0;
	}
	
	public Monome derive() {
		if(degree == 0) return new Monome(0, 0);
		return new Monome(coefficient * degree, degree--);
	}
	
	
	public double evaluate(float x) {
	return coefficient* Math.pow(x, degree);
	}
	
	public void display() {
		System.out.println(coefficient+"x^"+degree); 
	}
	
	
	public Monome product(Monome m) {
		double coeff = this.coefficient * m.coefficient;
		int deg = this.degree + m.degree;
		return new Monome(coeff, deg);
	}
	
	public boolean equals(Monome m) {
		return this.coefficient == m.coefficient && this.degree == m.degree;
	}

}
