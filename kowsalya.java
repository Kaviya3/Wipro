package javaapplication5;

public class JavaApplication5 {

    public static void main(String[] args) {
         String n="$,@";
      String s="kowsalya123@45$saro45";
      String reverse="";
        for(int i=s.length()-1;i>=0;i--)
        {
            reverse=reverse+s.charAt(i);
        }
        System.out.println(reverse);
         System.out.print(reverse.substring(2, 6));
        System.out.print(reverse.substring(13,17));
        System.out.print(reverse.substring(0,2));
        System.out.print(reverse.substring(7,8));
        System.out.print(reverse.substring(9,10));
        System.out.print(reverse.substring(8,9));
        System.out.print(reverse.substring(10,11));
        System.out.print(reverse.substring(6,7));
        System.out.print(reverse.substring(17,21));
        System.out.print(reverse.substring(11,13));
    }
    
}
