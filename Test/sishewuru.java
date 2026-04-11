
import java.util.Scanner;
public class sishewuru {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        solve(input);

        input.close();
    }

    public static void solve(Scanner input) {
        int nums = input.nextInt();
        double pass = 0;
        double excellent = 0;

        for (int i = 0; i < nums; i++) {
            int score;
            if ((score = input.nextInt()) >= 60) {
                pass++;
            }
            if (score >= 85) {
                excellent++;
            }
        }
        //直接输出小数，默认保留6位小数
        System.out.println(pass / nums * 100+0.5);
        System.out.println(excellent / nums * 100+0.5);
        
        /*
        System.out.printf("%.2f%%\n", pass / nums * 100);
        System.out.printf("%.2f%%\n", excellent / nums * 100);
         */

        /*
        System.out.printf("%d%%\n", (int) (Math.round(pass / nums * 100)));
        System.out.printf("%d%%\n", (int) (Math.round(excellent / nums * 100)));
        */

}}
