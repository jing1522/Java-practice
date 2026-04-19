import java.util.Scanner;
class Main {

public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
  // code here
  //1.可以使用Java的System.out.printf()方法来输出指定宽度的整数。
  //2.在这个示例中，%-5d表示左对齐，宽度为5的整数，%5d表示右对齐，宽度为5的整数。
  int a=455;
  int b=-123;
  int c=987654;
  System.out.printf("%-5d %5d\n",a,a);
  System.out.printf("%-5d %5d\n",b,b);
  System.out.printf("%-5d %5d\n",c,c);



  // 读取用户输入的一整串字符串（不带空格）
   String all = input.next();
  // 格式化输出：
  // 截取 0~3 位 → 转整数
  // 截取 3~6 位 → 转整数
  // 截取 6~9 位 → 转整数
  System.out.println(String.format("%d %d %d",
  Integer.parseInt(all.substring(0, 3)),
  Integer.parseInt(all.substring(3, 6)),
  Integer.parseInt(all.substring(6, 9))
   ));

   //gailiang
   for (int i = 0; i < all.length(); i += 3) {
    int end = Math.min(i + 3, all.length());
    System.out.print(all.substring(i, end) + " ");
   }
   //input.next()：读到空格 / 回车就停，只拿一段连续内容，不读换行符
   //input.nextLine()：读到回车才停，拿一整行所有内容（包括空格），会吃掉换行符


  /*  String.format("%1$d %1$#o %1$#x", a)
  String.format(格式串, 参数...)
  Java 里格式化字符串的静态方法
   作用：按你写的格式把数字转成不同进制字符串
   %1$d
   %：格式占位符
   1$：用第 1 个参数 a
   d：按十进制整数输出
    %1$#o
  o：按八进制输出
  #：自动加八进制前缀 0
   %1$#x
   x：按十六进制输出
   #：自动加十六进制前缀 0x
   java
   .toUpperCase()
   String.toUpperCase()
   字符串实例方法
   把所有小写字母转大写（比如 0xa → 0XA）*/


   //replace(" ", "") 就是：把字符串里所有空格，全部删掉。


}
}
