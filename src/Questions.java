import java.util.*;

public class Questions {

	private int[] answers = new int[4];
	private boolean multChoice = false;

	public void setMC(boolean MC) {
		multChoice = MC;
	}

	public int[] getAnswers() {
		return answers;
	}

	public void addAnswer(Object[] array, int size) {
		size = array.length;
		for (int i = 0; i < size; i++) {
			addAnswer(array[i]);
		}

	}

	public void printResults() {
		if (multChoice == true) {
			System.out.println("A: " + answers[0] + "\nB: " + answers[1]
					+ "\nC: " + answers[2] + "\nD: " + answers[3]);
		} else {
			System.out
					.println("True: " + answers[0] + "\nFalse: " + answers[1]);
		}
	}

	private void addAnswer(Object input) {
		if (multChoice == true) {
			if (input.equals('A'))
				answers[0]++;
			else if (input.equals('B'))
				answers[1]++;
			else if (input.equals('C'))
				answers[2]++;
			else if (input.equals('D'))
				answers[3]++;
			else
				System.out.println("Invalid answer");

		} else {
			if (input.equals('T'))
				answers[0]++;
			else if (input.equals('F'))
				answers[1]++;
			else
				System.out.println("Invalid answer");
		}

	}
}
