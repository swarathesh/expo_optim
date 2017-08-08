import java.util.Scanner;

public class Main {
//    Gas Stations
//    Xenny's is competing in a race and his car has
//    X
//    X litres of fuel. There are
//    N
//    N milestones in the competition. It takes no fuel at all to travel between gas stations, but at the
//            i
//    t
//            h
//    ith gas station,
//    P
//            i
//    Pi amount of petrol is drained.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] i = new int[100];
        for (int j = 0 ; j<a ;j++){
            int c = scanner.nextInt();
            i[j] = c;
        }
        int j=0 ,count=0;
        while(b>0){
            b = b-i[j++];
            count++;

        }
        System.out.print(count);


    }



}



