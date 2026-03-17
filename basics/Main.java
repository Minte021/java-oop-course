import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String stName = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.println("Hello " + stName + "! You are " +  age + " years old!");

        sc.close();

    }
}