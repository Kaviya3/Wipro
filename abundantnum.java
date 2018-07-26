package javaapplication4;

public class JavaApplication4 {

    public static void main(String[] args) {
        
        int a[]={12,13,14,18,20,24};
       
        for(int i=0;i<a.length;i++)
        { 
            int sum=0;
            for(int j=1;j<a[i];j++)
            {
               
                if(a[i]%j==0)
                {
                    sum=sum+j;
                    
                }
            }
         
           if(sum>a[i]) 
           {
               int b=a[i]/10;
               System.out.println(b+48);
           }
          
        }
        
    }
}

