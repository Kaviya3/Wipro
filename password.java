package javaapplication2;
import java.util.Scanner;

public class JavaApplication2 {

    public static void main(String[] args) {
        String s=" ";
 int m;int x;
 int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the customer name:");
        s=sc.next();
        int len=s.length();
        String str = s.charAt(len-1);
        System.out.println(str);
        System.out.println("enter the room no:");
         int n=sc.nextInt();
        int b=n%10;
        int c = n/10;
        int d=c%10;
       //  System.out.println(b);
       //System.out.println(d);
        //System.out.print(s.charAt(len-1)+""+b+""+d);
       // System.out.print(b);
     //sdf   System.out.print(d);
     while(n>0)
     {
         m=n%10;
         sum=sum+m;
         n=n/10;
     }
       System.out.println(sum);
      // x=s.charAt(len-1)+b+d+sum;
       System.out.print(s.charAt(len-1)+""+b+""+d+""+sum);
     
       StringBuilder sb=new StringBuilder();
       System.out.println(sb.reverse().toString());
    }
      
    }
    
