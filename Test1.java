import java.util.Scanner;
public class Test1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first value");
        int a = input.nextInt();
        System.out.println("Enter the second value");
        int b = input.nextInt();
        int sum = (a+b);
        System.out.println("Result = "+sum);
    }
}
