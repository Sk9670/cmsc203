/*
 * Class: CMSC203 
 * Instructor: Professor Grinberg
 * Description: class to initialize procedure data 
 * Due: 03/03/25
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Shane Kepner
*/
package patient;

public class Procedure {
    private String procedureName;
    private String procedureDate;  
    private String practitionerName;
    private double charges;

    
    public Procedure() {
        }

    
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
      
        }

    
    public Procedure(String procedureName, String procedureDate, String practitionerName, double charges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.charges = charges;
        }

  
    public String getProcedureName() {
        return procedureName;
        }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
        }

    public String getProcedureDate() {
        return procedureDate;
        }

    public void setProcedureDate(String procedureDate) {
        this.procedureDate = procedureDate;
        }

    public String getPractitionerName() {
        return practitionerName;
        }

    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    public double getCharges() {
        return charges;
    }

    public void setCharges(double charges) {
        this.charges = charges;
    }

    @Override
    public String toString() {
        return "Procedure: " + procedureName + "\n" +
               "Date: " + procedureDate + "\n" +
               "Practitioner: " + practitionerName + "\n" +
               "Charges: $" + String.format("%.2f", charges);
    }
}