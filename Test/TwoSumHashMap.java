import java.util.Scanner;
import java.util.HashMap;



public class TwoSumHashMap {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the target value:");
        int target=sc.nextInt();
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[] nums =new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the number,one by one:");
            nums[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
           if(map.containsKey(target-nums[i])){
            System.out.println("Indices: "+map.get(target-nums[i])+" and "+i);
                sc.close();
            return;
           }
           else{
            map.put(nums[i],i);
           }
          
        }
        System.out.println("No solution found.");
       
    }

    
}
