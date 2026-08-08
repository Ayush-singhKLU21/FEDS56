import java.util.Scanner;
public class basics
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.print("Enter age:");
        int age = sc.nextInt();
        System.out.println("Bonjour  " + name);
        System.out.println("age: " + age );

    }
}
