import java.util.Scanner ;

public class Sumof3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("enter the number : ");
            int a = sc.nextInt();

            System.out.print("enter the number : ");
            int b = sc.nextInt();

            int sum = a + b ;
            System.out.println("the sum of the numbers is : " + sum);
        }
    }
    
}
