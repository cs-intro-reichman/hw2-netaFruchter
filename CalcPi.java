// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num_of_terms = Integer.parseInt(args[0]);
		double pi_calc = 1.0;
		double counter = 3.0;

		for (int i = 0; i < (num_of_terms-1); i++) {
			if (i%2 == 0) {
				pi_calc -=  (1.0/counter);
				counter += 2;
			}
			else {
				pi_calc += (1.0/counter);
				counter += 2;
			}

		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + pi_calc * 4.0);
	}
}
