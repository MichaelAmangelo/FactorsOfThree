import java.util.Scanner;

public class problem4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        System.out.println("Enter integer" + n);

        int n1 = Math.abs(n); // returns all negative values into positive//

        int sum = 0;

        if (n1 !=0) {

            sum += n1 % 10; }

        else if (n1 == 0) {

            n1 /= 10;
        }

        System.out.println("The sum of all digits of " + n + " is: " + sum);

    }
}
