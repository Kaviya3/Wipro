package javaapplication6;

public class JavaApplication6 {

    public static void main(String[] args) {
    int a[]={5,4,3,7,8,7,6,5};
    int count=0;
    for(int i=0;i<a.length-1;i++)
    {
    int x=(a[i]-a[i+1]);
    if(x==(1))
    {
       count++; 
       
    }
    }
   System.out.println(count);
           
                
        
    }
    
}
