package javaapplication6;

public class JavaApplication6 {

    public static void main(String[] args) {
     
    for(int i=0;i<16;i++)
    {
        for(int j=0;j<16;j++)
        {
            
            int a=i+j;
            int b=i-j;
            if(a==15 && b==3)
            {
                System.out.println(i+","+j);
            }
           
                
        }
    }
    }
    
}
