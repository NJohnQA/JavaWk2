package main;

public class Results {
	public static int physicsMarks = 84;
	public static int chemistryMarks = 150;
	public static int biologyMarks = 150;
	
	public static int total = 0;
	public static double percentage = 0;
	
	
	public static void getResults() {
		System.out.println(physicsMarks);
		System.out.println(chemistryMarks);
		System.out.println(biologyMarks);
		
	}
	
	public static void calResults() {
		total = physicsMarks + chemistryMarks + biologyMarks;
		double perc = (total/450)*100;
		percentage = perc;
		System.out.println("Altogether you obtain " + total + " out of 450 marks");
		System.out.println("You got " + percentage + "%");
		
		
	}
	public static void passOrFail() {
		calResults();
		if (percentage<60) {
			System.out.println("You have failed");
		} else if (percentage > 60) {
			System.out.println("You passed");
		}		

	}

	
}
