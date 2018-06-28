
package javaapplication4;

public class JavaApplication4 {

    public static void main(String[] args) {
        String s="ab12cd34ef56";
        Separate(s);
    }
    public static void Separate(String str){
    String number="";
    String letter="";
    for(int i=0;i<str.length();i++)
    {
    char a=str.charAt(i);
    if(Character.isDigit(a))
    {
        number+=a;
    }
   
    else
    {
        letter+=a;
    }
    }
     System.out.println("The numbers are:"+number);
    System.out.println("the alphabets are:"+letter);
        
    }
    
}
