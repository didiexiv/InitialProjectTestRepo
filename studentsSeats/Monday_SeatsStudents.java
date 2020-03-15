package monday_seatsstudents;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Monday_SeatsStudents {

    public static void main(String[] args) {
//    Let's create a program that creates a class with students and shows where each student is seating.    

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("How many rows does the class have?");
        int rows = input.nextInt();
        System.out.println("How many students does the class have?");
//      Ξεκίνησα να το κάνω έχοντας στο μυαλό μου ότι έχω δυο σειρές και 5 μαθητές
        int students = input.nextInt();
//      ο αριθμός των μαθητών σε κάθε σειρά
        int seatsPerRow = students / rows;
        int remainingStudentsForLasRow = students % rows;
//        προσπαθώ να βρω πόσες είναι τα μάξιμουμ θρανία για να βάλω το περισσευούμενο μαθητή
        int totalSeatsPerRow = seatsPerRow + remainingStudentsForLasRow;
        String[][] classOfStudents = new String[rows][totalSeatsPerRow];
//      εφτιαξα εναν πίνακα που θα έχει όμως κενές θέσεις αν το % δεν είναι μηδέν
        int randomY = 0;
        int seatsCaptured = 0;

        
        while (seatsCaptured != students) {
            Random number = new Random();
            int randomX = number.nextInt(rows);
//            αυτο θα μας δωσει random αριθμό απο το 0 μέχρι και ένα μικρότερο απο τα rows

            if (totalSeatsPerRow != seatsPerRow) {
                randomY = number.nextInt(totalSeatsPerRow);
            } else {
                randomY = number.nextInt(seatsPerRow);
            }

            if (classOfStudents[randomX][randomY] != null) {
                continue;
            }

            input = new Scanner(System.in);
            System.out.println("Give the students name for the position "+randomX+ randomY);
            String name = input.next();

            classOfStudents[randomX][randomY] = name;
            seatsCaptured++;
            System.out.println(students - seatsCaptured + " seats are empty");
//            System.out.println("[" + randomX + "][" + randomY + "] = " + classOfStudents[randomX][randomY]);
        }
//Δύο θέματα, το πιο βασικό δεν κατάφερα να συμπληρώσω σωστά την πρώτη σειρά.
//Δεύτερο θέμα δεν κατάφερα να τα εκτυπώνω σωστά απλά βρήκα το deepToString για να βλέπω τι γράφω στο τέλος

        
//            if    (classOfStudents[0][0] != null);
        
        System.out.println(Arrays.deepToString(classOfStudents));


    }

}
