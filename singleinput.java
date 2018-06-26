package javaapplication6;
import java.util.Scanner;
public class JavaApplication6 {

      public static void main(String[] args) {
        int s=0,r;
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        while(num>0)
        {
        r=num%10;
        s=s+r;
        num=num/10;
    }


        System.out.println(s);
    
}
}
