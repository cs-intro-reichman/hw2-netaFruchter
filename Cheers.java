// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word_to_print = args[0].toUpperCase();
                int times_to_cheer = Integer.parseInt(args[1]);

                String char_to_check = "AEFHILMNORSX";

                for (int i = 0; i < word_to_print.length(); i++) {
                        if (char_to_check.indexOf(word_to_print.charAt(i)) != -1){
                        System.out.println("Give me an " + word_to_print.charAt(i) + ": " + word_to_print.charAt(i) + "!");
                        }
                        else {
                                System.out.println("Give me a  " + word_to_print.charAt(i) + ": " + word_to_print.charAt(i) + "!");
                        }
                }
                System.out.println("What does that spell?");
                for (int i =0; i < times_to_cheer; i++){
                        System.out.println(word_to_print+"!!!");
                }
}       }
