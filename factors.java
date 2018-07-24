package javaapplication13;
public class JavaApplication13 
{
 public static void main(String[] args)
 {
        int a[]={12,20,24,30,35,37,42};
        for(int i=0;i<a.length;i++)
        {
             System.out.print("The factor of "+a[i]+" is ");
            for(int j=1;j<=a[i];j++)
            {
               if(a[i]%j==0)
               {
                   System.out.print(j);
                           if(j<a[i])
                           {
                               System.out.print(",");
                            
                           }
                }
            }
           System.out.println( );
        }
        
    }
