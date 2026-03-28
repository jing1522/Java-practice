import java.util.*;
public class CollectionPractice {
    public static void main(String[] args){
        //ArrayList
        ArrayList<String> studentList =new ArrayList<>();
        studentList.add("张三");
        studentList.add("李四");
        studentList.add("王五");
        System.out.println("===ArrayList====");
        System.out.println("学生列表:"+studentList);
        System.out.println("第一个学生"+studentList.get(0));
        //shangchu
        studentList.remove("李四");
        System.out.println("===ArrayList====");
        System.out.println("学生列表:"+studentList);
        //HashMap
        HashMap<String,Integer> ages =new HashMap<>();
        ages.put("张三",20);
        ages.put("李四",22);
        ages.put("王五",21);

        System.out.println("===HashMap====");
        System.out.println("年龄列表:"+ages);
        System.out.println("张三的年龄:"+ages.get("张三"));

        //jiancha
        if(ages.containsKey("李四")){
            System.out.println("李四的年龄:"+ages.get("李四"));
        }
        System.out.println("\n遍历所有键值对:");
        for(String name : ages.keySet()){
            System.out.println(name+"的年龄:"+ages.get(name));
        }



    }
    
}
