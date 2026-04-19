package out;
class Village {
    static int  waterAmount ;
    int peopleNumber;
    String name;
    Village(String s){
       name = s;
    }
    static void setWaterAmount(int m){
        if (m>0)
            waterAmount = m;
    }
    void drinkWater(int n){
        if (waterAmount-1>=0){
            waterAmount=waterAmount-n;
            System.out.println(name+" 喝了 "+n+"升水");
        }else {
            waterAmount=0;
        }
    }
    static int lookWaterAmount(){
        return waterAmount;
    }
    void setPeopleNumber(int m){
            peopleNumber = m;
    }
    int getPeopleNumber(){
        return peopleNumber;
    }
}