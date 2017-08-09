import java.util.Scanner;

public class Main {
    // next prime
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int c = n;
        int countleft = 0, countright = 0;
        if (n == 0 || n == 1) {
            System.out.println(2 - n);
        }
        else if (IsPrime(n)) {
            System.out.println(0);
        }

        else {
            while (true) {
                if (IsPrime(--c))
                    break;
                else countleft++;
            }
            while (true) {
                if (IsPrime(++n))
                    break;
                else countright++;
            }
            int result = (countleft) < (countright) ? countleft: countright;
            System.out.print(result+1);
        }
    }

    private static boolean IsPrime(int n) {
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}



