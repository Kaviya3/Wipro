
package javaapplication3;

public class JavaApplication3 {

    public static void main(String[] args) {
        String s="kowsalya123@45$saro45";
        String reverse="";
        for(int i=s.length()-1;i>=0;i--)
        {
            reverse=reverse+s.charAt(i);
        }
        System.out.print(reverse);
    }
}
