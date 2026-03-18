import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of courses: ");
        int n = scanner.nextInt();
        System.out.println("Enter your marks: ");
        float total = 0;

        for (int i = 0; i < n; i++){
            float mark = scanner.nextInt();
            total += mark;
        }

        float average = total / n;
        System.err.println("Average: " + average);

        if (average >= 85 && average <= 100) {
            System.out.println("A");
        }
        else if (average >= 80) {
            System.out.println("A-");
        }
        else if (average >= 75) {
            System.out.println("B+");
        }
        else if (average >= 70) {
            System.out.println("B");
        }
        else if (average >= 65) {
            System.out.println("B-");
        }
        else if (average >= 60){
            System.out.println("C+");
        }
        else if (average >= 55){
            System.out.println("C");
        }
        else if (average >= 50) {
            System.out.println("C-");
        }
        else if (average >= 40) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }

        scanner.close();
        }
    }
        
        
        