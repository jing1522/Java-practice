import java.util.Scanner;
public class huiwenshu {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个整数：");
            int num = sc.nextInt();
        if (isPalindrome(num)) {
            System.out.println(num + " 是回文数");
        } else {
            System.out.println(num + " 不是回文数");
        }
    }

    public static boolean isPalindrome(int num) {
        if (num < 0) return false;
        int original = num;
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }
}
