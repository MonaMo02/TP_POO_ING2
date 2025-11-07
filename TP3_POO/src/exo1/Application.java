package exo1;

public class Application {

	public static void main(String[] args) {
		Monome m = new Monome(3, 2);
		
		Monome m2 = new Monome(5, 1);
		
		Monome m3 = new Monome(2);
				
		Polynome p = new Polynome(m, m2, m3);

		
		
		Monome m5 = new Monome(5, 1);
		
		Monome m6 = new Monome(2, 2);
		
		Polynome p2 = new Polynome(m6, m5, new Monome(3));
		
		if((p2.terms[0].equals(p.terms[0])) && 
				(p2.terms[1].equals(p.terms[1])) && 
				p2.terms[2].equals(p.terms[2])) System.out.println("Identical Polynomials");
		
		double result = p.evaluate(10);
		System.out.println("result of P(10) = "+ result);
		
		Polynome p3 = p.derive();
		
		System.out.println("The derivative at x=20 is: "+ p3.evaluate(20));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
