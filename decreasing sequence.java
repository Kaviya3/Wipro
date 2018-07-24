package javaapplication13;


public class JavaApplication13 {

    public static void main(String[] args) {
        
        int a[]={7,4,3,1,8,5,4,9};
   
    int count=0;
    int sum=0;
    int n=1;
    for(int i=0;i<a.length-1;i++)
    {
     
   
     if(a[i]>a[i+1])
     {
         count++;
         
     }
    
          
     
      if(a[i]<a[i+1])
         {
             System.out.println("no of sequence:"+n);
             n++;
              int y=count+1;
    System.out.println("no of elements in  sequence:"+y);
    count=0;
    
    }
    
   
    }
    
    
    }
    
}
