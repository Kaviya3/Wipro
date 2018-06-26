package javaapplication5;


public class JavaApplication5 {

   
    public static void main(String[] args) {
        int i;
        for(i=1;i<=50;i++)
        {
        
        
        if(i % 3 == 0)
        {
            System.out.println("Fizz");
            continue;
        }
        if(i % 5 == 0)
        {
            System.out.println("Buzz");
            continue;
        }
        if(i % 3 == 0 && i % 5 == 0)
        {
            System.out.println("FizzBuzz");
            continue;
        }
         System.out.println(i);
    }
       
    }
    
}

