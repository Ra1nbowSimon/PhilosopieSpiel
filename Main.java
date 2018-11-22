package simon.thesimonlp.philosophie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import simon.thesimonlp.philosophie.person.Person;

public class Main {
	static ArrayList<Person> array = new ArrayList<>();
	static int maxpersons;
	static int maxfaul;
	static int maxunehrlich;
	static int maxaggressiv;
	static boolean solved = false;

	public static void main(String[] args) {
		newPerson(2, true, true, true);
		newPerson(2, true, true, true);
		
		newPerson(1, true, false, false);
		newPerson(1, false, true, true);
		newPerson(1, false, false, true);
		newPerson(1, true, true, false);
		newPerson(1, true, false, true);
		newPerson(1, false, true, false);
		newPerson(1, true, false, false);
		newPerson(1, false, true, true);
		newPerson(1, false, false, true);
		newPerson(1, true, true, false);
		newPerson(1, true, false, true);
		newPerson(1, false, true, false);
		
		newPerson(0, false, false, false);
		newPerson(0, false, false, true);
		newPerson(0, false, true, false);
		newPerson(0, true, false, false);
		newPerson(0, false, true, true);
		newPerson(0, true, false, true);
		

		double mp = array.size() * 0.6;
		maxpersons = (int) Math.round(mp);
		double mf = maxpersons * 0.5;
		maxfaul = (int) Math.round(mf);
		double mu = maxpersons * 0.5;
		maxunehrlich = (int) Math.round(mu);
		double ma = maxpersons * 0.5;
		maxaggressiv = (int) Math.round(ma);
		System.out.println("Personen:" + maxpersons);
		System.out.println("Max. Faul:" + maxfaul);
		System.out.println("Max. Unehrlich:" + maxunehrlich);
		System.out.println("Max. Aggressiv:" + maxaggressiv);

		int ii = 0;

		while (solved == false) {
			ii++;
			
			int numArm = 0;
			int numReich = 0;

			int numF = 0;
			int numU = 0;
			int numA = 0;
			ArrayList<Integer> which = new ArrayList<Integer>();
			
			ArrayList<Integer> pp = new ArrayList<>();

			while (pp.size() < maxpersons) {
				Random r = new Random();
				int rdm = r.nextInt(array.size());
				if (!pp.contains(rdm)) {
					pp.add(rdm);
					
					Person rP = array.get(rdm);
					which.add(rdm);
					if (rP.getGehalt() == 0) {
						numArm++;
					} else if (rP.getGehalt() == 2) {
						numReich++;
					}
					if (rP.isFaul()) {
						numF++;
					}
					if (rP.isUnehrlich()) {
						numU++;
					}
					if (rP.isAggressiv()) {
						numA++;
					}
				}

			}

			if (numF <= maxfaul && numU <= maxunehrlich && numA <= maxaggressiv && numReich*2 >= numArm) {
				solved = true;
				
				Collections.sort(which);
				System.out.println("Finished!");
				System.out.println("Personen: " + which);
				System.out.println("Arm: " + numArm);
				System.out.println("Reich: " + numReich);
				System.out.println("Faul: " + numF);
				System.out.println("Unehrlich: " + numU);
				System.out.println("Aggressiv: " + numA);
				System.out.println("Versuche: " + ii);
				break;
			}
		}
	}

	public static void newPerson(int g, boolean f, boolean u, boolean a) {
		array.add(new Person(g, f, u, a));
	}
}
