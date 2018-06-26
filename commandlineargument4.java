package javaapplication18;

public class JavaApplication18 {

    public static void main(String[] args) {
     int n=args.length;
       int i;
       if(n==0)
       {
           System.out.println("no values");
       }
       for(i=0;i<n;i++)
       {
           System.out.print(args[i]);
       
           if(i<n-1)
           {
           System.out.print(",");
           }
}

    }
   }
