package exo2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		B b = new B();
		A a1 = new A();
		
		
		a.m(b);
		a.n(b);
		
		b.m(b);
		b.n(b);
		
		a.m(a1);
		a.n(a1);
		
		a1.m(b);
		a1.n(b);
	}

}
