package javaapplication26;

public class JavaApplication26 {

    public static void main(String[] args) {
       int a[]={23,45,6,7,9};

       for(int i=0;i<a.length;i++)
       {
           int temp=0;
         for(int j=2;j<a[i];j++) 
         {
            if(a[i]%j==0)
            
               temp++;
         
         }
        if(temp==0)
            {
               
                 System.out.println(a[i]);
           
             
         }
        
         }
       }
}

