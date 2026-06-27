import java.util.Scanner;
public class Isint {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter the number " );
            boolean num = sc.hasNextInt();
            System.out.println(num);
        }
    }
}
