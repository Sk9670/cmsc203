/*
 * Class: CMSC203 
 * Instructor: Professor Grinberg
 * Description: driver to run patient app program
 * Due: 03/03/25
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Shane Kepner
*/
package patient;

import java.util.Scanner;

public class PatientDriverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting patient information from user
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter Middle Name: ");
        String middleName = scanner.nextLine();
        
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Enter Street Address: ");
        String streetAddress = scanner.nextLine();
        
        System.out.print("Enter City: ");
        String city = scanner.nextLine();
        
        System.out.print("Enter State: ");
        String state = scanner.nextLine();
        
        System.out.print("Enter ZIP Code: ");
        String zipCode = scanner.nextLine();
        
        System.out.print("Enter Phone Number (e.g., 301-123-4567): ");
        String phoneNumber = scanner.nextLine();
        
        System.out.print("Enter Emergency Contact Name: ");
        String emergencyContactName = scanner.nextLine();
        
        System.out.print("Enter Emergency Contact Phone Number: ");
        String emergencyContactPhone = scanner.nextLine();

        // Creating Patient instance
        Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zipCode, phoneNumber, emergencyContactName, emergencyContactPhone);

        // Creating Procedure instances
        Procedure procedure1 = new Procedure("X-Ray", "06/12/2023", "Dr. Smith", 150.00);
        Procedure procedure2 = new Procedure("Blood Test", "06/15/2023");
        procedure2.setPractitionerName("Nurse Jane");
        procedure2.setCharges(75.50);
        
        Procedure procedure3 = new Procedure();
        procedure3.setProcedureName("Check-Up");
        procedure3.setProcedureDate("06/20/2023");
        procedure3.setPractitionerName("Dr. Doe");
        procedure3.setCharges(100.00);

        // Display patient and procedure information
        displayPatient(patient);
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        // Calculate and display total charges
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.println("Total Charges: $" + String.format("%.2f", totalCharges));
        System.out.println("Student name: Shane Kepner\n" + "MC#: M20976073 \n" + "Due Date: 03/03/2025");
        
        
        scanner.close();
    }

    public static void displayPatient(Patient patient) {
        System.out.println("\nPatient Information:\n" + patient);
    }

    public static void displayProcedure(Procedure procedure) {
        System.out.println("\n" + procedure);
        
    }

    public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
        return p1.getCharges() + p2.getCharges() + p3.getCharges();
        
    }
   
    
}