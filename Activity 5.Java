/**
 * Activity 5: Improved Student Information System
 * This program stores student details using appropriate data types 
 * and displays them in a formatted console output.
 */
public class StudentInformationSystem {

    public static void main(String[] args) {
        // --- VARIABLE DECLARATIONS & INITIALIZATION ---
        // Using correct data types and camelCase naming conventions
        String studentName = "Sofia Alexa Marinas Ciriaco";
        int age = 17;
        String gradeLevel = "Grade 12";
        String section = "ICT";
        String school = "JASMS QC";
        String favoriteSubject = "Computer Programming";
        double generalAverage = 94.75;
        boolean isHonorStudent = true;

        // --- PROGRAM OUTPUT ---
        // Displaying the formatted student information card
        System.out.println("----------------------------------------");
        System.out.println("          STUDENT INFORMATION           ");
        System.out.println("----------------------------------------");
        
        // Using printf to perfectly align the colons (:) for clean formatting
        System.out.printf("%-17s: %s\n", "Name", studentName);
        System.out.printf("%-17s: %d\n", "Age", age);
        System.out.printf("%-17s: %s\n", "Grade Level", gradeLevel);
        System.out.printf("%-17s: %s\n", "Section", section);
        System.out.printf("%-17s: %s\n", "School", school);
        System.out.printf("%-17s: %s\n", "Favorite Subject", favoriteSubject);
        System.out.printf("%-17s: %.2f\n", "Average", generalAverage);
        System.out.printf("%-17s: %b\n", "Honor Student", isHonorStudent);
        
        System.out.println("----------------------------------------");
    }
}