import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Variable
        double f = 0;
        double c = 0;
        boolean done = false;

        do{
            System.out.println("Enter the degrees in fahrenheit: ");
            if(scan.hasNextDouble()){
                f = scan.nextDouble();

                c = ((f -32) * 5) / 9;

                System.out.printf("%-12s%8.2f", "Celsius:", c);
                System.out.printf("\n%-12s%8.2f", "Fahrenheit:", f);

                done = true;

            }else{
                System.out.println("Your input was invalid. Try again.");
            }
        }while(!done);
    }
}