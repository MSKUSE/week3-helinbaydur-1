public class Main {
    public static void main(String[] args) {


        if (args.length >= 1) {


            int score = Integer.parseInt(args[0]);
            if (score >= 90) {
                System.out.println("Grade: A");
            } else if (score >= 80 && score < 89) {
                System.out.println("Grade: B");

            } else if (score >= 70 && score < 79) {
                System.out.println("Grade: C");

            } else if (score >= 60 && score < 69) {
                System.out.println("Grade: D");

            } else if (score >= 0 && score < 59) {
                System.out.println("Grade: F");
            } else {
                System.out.println("Invalid Grade");

            }
        }else{
            System.out.println("Please provide a score");
        }
    }   }


