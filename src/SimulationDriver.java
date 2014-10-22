import java.util.*;

public class SimulationDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean MC = false;
		String input;
		Scanner kb = new Scanner(System.in);

		System.out
				.println("Do you want to ask a Multiple Choice question? y/n");
		input = kb.nextLine();
		input.toUpperCase();
		if (input.equals("YES") || input.equals("Y"))
			MC = true;

		Student[] s = new Student[30];
		iClicker c = new iClicker();
		Questions q = new Questions();

		for (int j = 0; j < 30; j++)
			s[j] = new Student();

		for (int i = 0; i < 30; i++) {
			if (MC == true) {
				c.addAnswer(s[i].getID(), s[i].submitMC());
			} else {
				c.addAnswer(s[i].getID(), s[i].submitTF());
			}
		}

		Object[] array = new Object[30];
		//System.out.print(c.map.values());
		array = c.map.values().toArray();
		q.setMC(MC);
		q.addAnswer(array, 30);
		q.printResults();
		

	}
}