/*
 * Class: CMSC203 
 * Instructor: Professor Grinberg
 * Description: class to initialize patient data
 * Due: 03/03/25
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Shane Kepner
*/

package patient;


public class Patient {
private String firstName;
private String middleName;
private String lastName;
private String streetAddress;
private String city;
private String state;
private String zipCode;
private String phoneNumber;
private String emergencyContactName;
private String emergencyContactPhone;

    // constructor
public Patient() {
   }

    
public Patient(String firstName, String middleName, String lastName) {
	
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    }

    // constructor for traits
public Patient(String firstName, String middleName, String lastName, String streetAddress, String city, String state,
    String zipCode, String phoneNumber, String emergencyContactName, String emergencyContactPhone) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.streetAddress = streetAddress;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
    this.phoneNumber = phoneNumber;
    this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhone = emergencyContactPhone;
    }

    // Accessors and mutators
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getMiddleName() { return middleName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getStreetAddress() { return streetAddress; }
    public void setStreetAddress(String streetAddress) { this.streetAddress = streetAddress; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getZipCode() { return zipCode; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmergencyContactName() { return emergencyContactName; }
    public void setEmergencyContactName(String emergencyContactName) { this.emergencyContactName = emergencyContactName; }

    public String getEmergencyContactPhone() { return emergencyContactPhone; }
    public void setEmergencyContactPhone(String emergencyContactPhone) { this.emergencyContactPhone = emergencyContactPhone; }

    // Methods to build strings
    public String buildFullName() {
        return firstName + " " + middleName + " " + lastName;
    }

    public String buildAddress() {
        return streetAddress + ", " + city + ", " + state + " " + zipCode;
    }

    public String buildEmergencyContact() {
        return emergencyContactName + " - " + emergencyContactPhone;
    }

    
    public String toString() {
        return "Patient: " + buildFullName() + "\nAddress: " + buildAddress() +
               "\nPhone: " + phoneNumber + "\nEmergency Contact: " + buildEmergencyContact();
    }
}