 import java.io.*;
import java.util.*;

public class ESPGame {

    public static void main(String[] args) throws IOException 
    {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String[] colors = new String[16];
        int correctGuesses = 0;
        int numColorsToShow = 0;
        boolean playAgain = true;

        try {
            Scanner fileScanner = new Scanner(new File("colors.txt"));
            for (int i = 0; i < 16; i++) {
                if (fileScanner.hasNextLine()) {
                    colors[i] = fileScanner.nextLine();
                }
            }
             fileScanner.close();
        } catch (IOException e) {
           // this should display error if i incorrectly placed the colors file provided 
        	System.err.println("Error reading colors.txt: " + e.getMessage());
            return;
        }

        File resultsFile = new File("EspGameResults.txt");
        if (!resultsFile.exists()) {
            try {
                resultsFile.createNewFile();
            } catch (IOException e) {
                //to help ioe issues 
            }
        }

        while (playAgain) {
            try {
                FileWriter fileWriter = new FileWriter("EspGameResults.txt", false);
                fileWriter.close();
            } catch (IOException e) {
                System.err.println("Error truncating EspGameResults.txt: " + e.getMessage());
            }

            correctGuesses = 0;

            for (int i = 0; i < 3; i++) {
                int randomIndex = random.nextInt(16);
                String selectedColor = colors[randomIndex];

                System.out.println("\nGuess the color:");

                if (i == 0) {
                    boolean validChoice = false;
                    while (!validChoice) {
                        System.out.println("1. Show 16 colors\n2. Show 10 colors\n3. Show 5 colors\n4. Exit"); // Added Exit option
                        if(input.hasNextInt()){
                            int choice = input.nextInt();
                            input.nextLine();

                            if (choice == 1 || choice == 2 || choice == 3) {
                                validChoice = true;
                                if (choice == 1) {
                                    numColorsToShow = 16;
                                } else if (choice == 2) {
                                    numColorsToShow = 10;
                                } else {
                                    numColorsToShow = 5;
                                }
                            } else if (choice == 4) { 
                            	// set boolean expression to allow program exit
                                playAgain = false;
                                break;
                                //exits
                            } else {
                                System.out.println("Invalid choice. Please try again.");
                            }
                        } else {
                            System.out.println("Invalid input. Please enter a number.");
                            input.next(); // clear input to help with invalid data
                        }
                    }
                }

                if (!playAgain) break; // exit 

                for (int j = 0; j < numColorsToShow; j++) {
                    System.out.println((j + 1) + ". " + colors[j]);
                }

                String userGuess = input.nextLine();

                System.out.println("The color was: " + selectedColor);

                if (userGuess.equalsIgnoreCase(selectedColor)) {
                    correctGuesses++;
                }
            }

            if (!playAgain) break; // Exit the main loop if user chose to exit earlier

            System.out.println("\nEnter your name:");
            String username = input.nextLine();

            System.out.println("Enter a sentence that describes you:");
            String userDescription = input.nextLine();

            System.out.println("Enter the due date (MM/DD/YY):");
            String dueDate = input.nextLine();

            System.out.println("\nGame Over");
            System.out.println("You guessed " + correctGuesses + " out of 3 colors correctly.");
            System.out.println("Due Date: " + dueDate);
            System.out.println("Username: " + username);
            System.out.println("User Description: " + userDescription);
            System.out.println("Date: " + dueDate);

            try {
                FileWriter fileWriter = new FileWriter("EspGameResults.txt", true);
                fileWriter.write("Game Over\n");
                fileWriter.write("You guessed " + correctGuesses + " out of 3 colors correctly.\n");
                fileWriter.write("Due Date: " + dueDate + "\n");
                fileWriter.write("Username: " + username + "\n");
                fileWriter.write("User Description: " + userDescription + "\n");
                fileWriter.write("Date: " + dueDate + "\n");
                fileWriter.close();
            } catch (IOException e) {
                System.err.println("Error writing to EspGameResults.txt: " + e.getMessage());
            }

            if (playAgain) { // Only ask to play again if the user didn't exit
                System.out.print("\nDo you want to play again? (Yes/No): ");
                String playAgainInput = input.nextLine();
                playAgain = playAgainInput.equalsIgnoreCase("yes");
            }
        }

        input.close();
    }
}