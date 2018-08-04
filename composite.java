package javaapplication9;
import java.util.Scanner;

public class JavaApplication9 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the number");
        int n=sc.nextInt();
        int Flag=0;
       
       
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                Flag=1;
                break;
            }
              
            }
        if(Flag==1)
        {
            System.out.println(n +" is a composite number");
        }
        else
        {
            System.out.println(n +" is a not composite number");
        }
       
    }
    
    }
