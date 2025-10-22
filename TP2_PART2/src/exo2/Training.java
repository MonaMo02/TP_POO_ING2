package exo2;

public class Training {

	public String title;
	public Instructor instructor; 
	public Learner[] learners = new Learner[3];
	public int nbLearners;
	public static int trainingCount = 0;
	
	public Training(String Title, Instructor inst) {
		title = Title;
		instructor = inst;
		trainingCount++;
	}
	
	public Training(String Title) {
		title = Title;
		instructor = null;
		trainingCount++;
	}
	
	public void addLearner(Learner l) {
		for(int i = 0 ; i<3; i++) {
			if(learners[i] == null) {
				learners[i] = l;
				System.out.println("Added new Learner");
				return;
			}
		}
		System.out.println("Cannot add new learner, Training is already full");
	}
	
	public void displayTraining() {
		System.out.println("Training: "+title);
		if(instructor != null) {
			System.out.println("Instructed by: ");
			instructor.displayInfo();
		}
		
		System.out.println("Learners: ");
		for(int i = 0 ; i < 3; i++) {
			if(learners[i] != null) learners[i].displayInfo();
		}
	}
	
	public static void displayCount() {
		System.out.println("Trainings counter: "+trainingCount);
	}
	
}
