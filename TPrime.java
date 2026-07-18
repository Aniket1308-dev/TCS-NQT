import java.util.Scanner;

public class TPrime {

    public static void main(String[]args) 
    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Boolean isPrime = n > 1;
        for (int i = 2; i * i <= n; i++)
        {
            if (n % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime ? "Yes" : "No");
    }
}