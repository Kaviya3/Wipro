package javaapplication35;

public class JavaApplication35 {

    public static void main(String[] args) {
        int age=Integer.parseInt(args[0]);
      
      if(age <= 59 && args[1].equals("Female")) 
      {
     
      System.out.println("Interest=8.2%");
      
    }
    
    if(age > 59 && age < 121)
    {
    if(args[1].equals("Female"))
    {
      System.out.println("Interest=7.6%");
      
    }
    
}
     if(age <61)
     {
    if(args[1].equals("Male"))
    {
      System.out.println("Interest=9.2%");
      
    }
    
}
    if(age>61 && age <121)
    {
    if(args[1].equals("Male"))
    {
      System.out.println("Interest=8.3%");
      
    }
    
}
    }
}
