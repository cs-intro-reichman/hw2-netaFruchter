public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int min_to_add = Integer.parseInt(args[1]); 

        int total_min = (hours * 60) + minutes + min_to_add;
        int total_hours = total_min / 60;
        int new_hours = total_hours % 24;
        int new_minutes = total_min - (total_hours*60);

        String final_min = "";
        String final_hours = "";

        if (new_minutes < 10){
            final_min = "0"+new_minutes;
        }
        else {
            final_min = ""+new_minutes;
        }

        if (new_hours < 10){
            final_hours = "0"+new_hours;
        }
        else {
            final_hours = ""+new_hours;
        }

        System.out.println(final_hours + ":" + final_min);
    }
}
