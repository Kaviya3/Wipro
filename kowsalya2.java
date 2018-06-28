
package javaapplication8;

public class JavaApplication8 {

    public static void main(String[] args) {
    
        StringBuffer sb=new StringBuffer();

        StringBuffer sb1=new StringBuffer();

        String str="Kowsalya123@45$saro45";

        String s1="";

        String s2="";

       for(int i=0;i<str.length();i++)

       {

       if(Character.isLetter(str.charAt(i)))

       {

           s1=s1+str.charAt(i);  

	}

        if(Character.isDigit(str.charAt(i)))

       {

           s2=s2+str.charAt(i);

       }       

}

       sb.append(s1);

     sb.reverse();

       sb1.append(s2);

     sb1.reverse();

       String str1=sb.toString();

       String str2=sb1.toString();

      String s= str1+str2;

       System.out.print(s.substring(0,8));

    System.out.print(s.substring(12,15));

    System.out.print("@");

      System.out.print(s.substring(15,17));

    System.out.print("$");

    System.out.print(s.substring(8,12));

     System.out.print(s.substring(17,19));

    

    }

}
