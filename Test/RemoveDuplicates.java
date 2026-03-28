
import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the number:");
            nums[i] = scanner.nextInt();
        }
        int slow=0;
        for(int fast =1;fast<nums.length;fast++){
            if(nums[slow]!=nums[fast]){
                slow++;
                nums[slow]=nums[fast];
            }
        }        System.out.println(slow+1);
        scanner.close();
    }
    
}
