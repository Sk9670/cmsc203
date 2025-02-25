import java.util.Scanner;

public class MovieDriver {

    public static void main(String[] args) {

    	Scanner keyboard = new Scanner(System.in);


        System.out.print("Enter the movie title: ");
        String title = keyboard.nextLine();

        System.out.print("Enter the movie rating: ");
        String rating = keyboard.nextLine();

        int tickets = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Enter the number of tickets sold: ");
            if (keyboard.hasNextInt()) {
                tickets = keyboard.nextInt();
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                keyboard.next();
            }
            keyboard.nextLine(); //consume leftover newline
        }

        Movie myMovie = new Movie(title, rating, tickets);

        System.out.println("\nMovie details:");
        System.out.println(myMovie.toString());

        keyboard.close();
    }
}