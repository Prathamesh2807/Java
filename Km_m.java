import java.util.Scanner ;
public class Km_m {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("enter the km : ");
            float km = sc.nextFloat();

            float miles = km / 0.62f ;
            System.out.println(miles);

        }
    }
}
