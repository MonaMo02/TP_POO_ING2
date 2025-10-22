package exo2;

public class MainApp {

	public static void main(String[] args) {
		Training training1, training2 ;
		
		Instructor instructor = new Instructor("Djeraoui Mouna", "OOP");
		
		training1 = new Training("Java Training", instructor);
		
		Learner l1 = new Learner();
		Learner l2 = new Learner("Djeraoui", "Douaa", "djeraouiD@gmail.com");
		Learner l3 = new Learner("Djeraoui", "Hiba", "djeraouiH@gmail.com");
		
		training2 = new Training("Python Training");
		
		training1.addLearner(l1);
		System.out.println("***************************************************");
		training1.addLearner(l2);
		System.out.println("***************************************************");
		
		
		
		training2.addLearner(l3);
		System.out.println("***************************************************");
		
		training1.displayTraining();
		System.out.println("***************************************************");
		
		training2.displayTraining();
		System.out.println("***************************************************");
		Training.displayCount();
	}

}
