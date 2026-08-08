import java.util.Scanner;
public class Reverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no:");
        int n = sc.nextInt();
        int nn= 0;
        while(n!=0){
            int a = n%10;
            nn = nn*10+a;
            n=n/10;
        }
        System.out.println("Reverse no is:" + nn);
sc.close();
    }
}
