import java.util.Random;

public class Student {

	private int id;

	/*
	 * Default constructor for student, creates a random ID between 0 and 29
	 */
	public Student() {
		Random rand = new Random();
		id = rand.nextInt(30);
	}

	/*
	 * constructor for student, creates student with a specified ID
	 */
	public Student(int newID) {
		id = newID;
	}

	/*
	 * getter for ID number
	 */
	public int getID() {
		return id;
	}

	/*
	 * Make student submit an answer for a multiple choice question A-D
	 */
	public char submitMC() {
		int answer;
		char out = 0;
		Random rand = new Random();
		answer = rand.nextInt(4);
		switch (answer) {
		case 0:
			out = 'A';
			break;
		case 1:
			out = 'B';
			break;
		case 2:
			out = 'C';
			break;
		case 3:
			out = 'D';
			break;
		default:
			System.out.println("Invalid answer");
			break;
		}
		return out;

	}

	public char submitTF() {
		int answer;
		char out = 0;
		Random rand = new Random();
		answer = rand.nextInt(2);
		switch (answer) {
		case 0:
			out = 'T';
			break;
		case 1:
			out = 'F';
			break;
		default:
			System.out.println("Invalid answer");
			break;
		}
		return out;

	}

}
