package javaapplication3;
import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        int temp;
        boolean isprime=true;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=s.nextInt();
        for(int i=2;i<n;i++)
        {
            temp=n%i;
                    if(temp==0)
                    {
                        isprime=false;
                        break;
                    }
        }
        if(isprime==true)
           System.out.println("prime number"); 
        else
            System.out.println("not a prime number");
    }
    
}


