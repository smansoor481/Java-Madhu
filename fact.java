import java.util.Scanner;

/**
 * fact
 */
public class fact {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int nums = sc.nextInt();
        int fact=1;
        for(int i=nums;i>=1;i--)
        {
            fact = fact*i;
        }
        System.out.print("Factorial of the number: "+fact);
    }
}