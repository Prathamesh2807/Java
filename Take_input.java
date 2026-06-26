import java.util.Scanner;

public class Take_input {
    public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)){

        System.out.println("enter num 1 : ");
        int a = sc.nextInt();

        System.out.println("enter num 2 : ");
        int b = sc.nextInt();
        
        int sum = a + b ;

        System.out.println("the sum is : " + sum);

    } 
    }
}

