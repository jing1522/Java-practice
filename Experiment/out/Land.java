package out;
public class Land {
    public static void main(String[] args) {
        Village.setWaterAmount(200);
        int leftWater = Village.waterAmount;
        System.out.println("水井里有 "+leftWater+"升水");
        Village zhaoZhuang,majiaHezi;
        zhaoZhuang = new Village("赵庄");
        majiaHezi = new Village("马家河子");
        zhaoZhuang.setPeopleNumber(80);
        majiaHezi.setPeopleNumber(120);
        zhaoZhuang.drinkWater(50);
        leftWater=majiaHezi.lookWaterAmount();
        String name = majiaHezi.name;
        System.out.println(name+"水井里还有 "+leftWater+"升水");
        majiaHezi.drinkWater(100);
        leftWater=zhaoZhuang.lookWaterAmount();
        name = zhaoZhuang.name;
        System.out.println(name+"水井里还有 "+leftWater+"升水");
        int peopleNumber = zhaoZhuang.getPeopleNumber();
        System.out.println("赵庄的人口是 "+peopleNumber);
        peopleNumber = majiaHezi.getPeopleNumber();
        System.out.println("马家河子的人口是 "+peopleNumber);
    }
    
}
