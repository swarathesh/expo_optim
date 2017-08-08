import java.util.Scanner;

public class Main {
//    Closest Gift
//    You are on your way to find the gifts. All the gifts lie in your path in a straight line at prime numbers and your house is at 0.Given
//    your current position find the closest gift to your position, and calculate the distance between your current position and gift and tell the distance.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum=0;
        if(n>1){
            int count=0;
            for(int i=2;i<=(int)Math.sqrt(n);i++){
                if(n%i==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                sum=0;
            }
            else{
                int f=0;
                for(int i=n+1;i>0;i++){
                    count=0;
                    for(int j=2;j<=(int)Math.sqrt(i);j++){
                        if(i%j==0){
                            count++;
                            break;
                        }
                    }
                    if(count==0){
                        f=i;
                        break;
                    }
                }
                sum=f-n;
            }
        }
        else{
            sum=2-n;
        }
        System.out.println(sum);


    }



}



