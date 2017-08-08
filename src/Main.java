import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int result = solve(a, b);
        result = result / c;
        result = result %d;
        System.out.print(result);

    }

    private static int solve(int x, int n) {

               if(n==0){

                        return 1;}

                       else if(n%2 == 0)   {

                        return  solve(x*x,n/2);}
             else    {

                        return x* solve(x*x,(n-1)/2);}
                        //push
    }

}



