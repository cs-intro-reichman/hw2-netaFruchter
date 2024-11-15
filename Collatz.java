// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		
		System.out.println("1 4 2 1 (4)");
		if (mode.equals("v")){
			for (int i = 2; i <= seed; i++){
				System.out.print(i + " ");
				int current_num = i;
				int counter = 1;
				while (current_num != 1) {
					if (current_num%2 == 0) {
						current_num /= 2;
					}
					else {
						current_num = (current_num*3)+1;
					}
					System.out.print(current_num + " ");	
					counter++;
				}
				System.out.println("(" + counter + ")");
			}
			System.out.println("");
		}
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");

	}
}
