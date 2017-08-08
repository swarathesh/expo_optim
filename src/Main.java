import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number1 = scanner.nextInt();
        int Number2 = scanner.nextInt();
        int result = Gcd(Number1,Number2);
        System.out.print(result);

    }

    private static int Gcd(int number1, int number2) {
        int min = Math.min(number1,number2);
        int gcd = 0 ;
        for (int i = min; i>0 ; i--){
            if(number1%i==0 && number2%i==0){
                gcd = i;
                return gcd;


            }
        }
        return gcd;

    }


}
