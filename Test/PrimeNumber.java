import java.util.Scanner;
import static java.lang.Math.sqrt;
public class PrimeNumber {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean flag=true;
        if(num<=1){
            System.out.println("not a prime");
        }
        else{
            for(int i =2;i<=sqrt(num);i++){
                if(num%i==0){
                    flag=false;
                    break;
                }

            }
            if(flag==true){
                System.out.println("prime");
            }
            else{
                System.out.println("not a prime");
            }
        }
        sc.close();


    }
    
}
