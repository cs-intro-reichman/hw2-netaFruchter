// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	    int iteration_to_check = Integer.parseInt(args[0]);

		double rand_num = 0;
		int greater_counter = 0;
		int lower_counter = 0;

		for (int i  = 0; i < iteration_to_check ; i++){
			rand_num = Math.random();
			if (rand_num > 0.5){
				greater_counter++;
			}
			else {
				lower_counter++;
			}
		}

		System.out.println("> 0.5:  " + greater_counter + " times");
		System.out.println("<= 0.5: " + lower_counter + " times");

		if (greater_counter != 0 && lower_counter != 0){
			double ratio = 0;
			if (greater_counter > lower_counter){
				ratio = (double)(lower_counter) / (double)(greater_counter);
			}
			else {
				ratio = (double)(greater_counter) / (double)(lower_counter);
			}
			System.out.println("ratio: " + ratio);
		}
	}
}
