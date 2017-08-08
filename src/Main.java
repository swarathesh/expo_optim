import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        int power = scanner.nextInt();
        int result = calculate(Number,power);
        System.out.print(result);
    }



    private static int calculate(int x, int n) {
        System.out.print(x+" "+ n+"in \n");
        if(n==0){
            System.out.print(x+" "+ n+" 1 \n");
            return 1;}

        else if(n%2 == 0)   {
            System.out.print(x+" "+ n+"even \n");//n is even
            return  calculate(x*x,n/2);}
        else    {
            System.out.print(x+" "+ n+"odd \n");//n is odd
            return x* calculate(x*x,(n-1)/2);}
    }

    }


