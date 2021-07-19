import java.util.Scanner;
public class LargestNumber{
  public static void main(String [] args){

    Scanner sc=new Scanner(System.in);
    
  
    System.out.println("Enter First Number:");
       int a=sc.nextInt();

    System.out.println("Enter Second Number:");
       int b=sc.nextInt();

    System.out.println("Enter Third Number:");
       int c=sc.nextInt();

    // appraoch1-logic
    
   /* if(a>b && a>c)
     {
       System.out.println(a+ "is largest Number");
       
     }
     else if(b>a && b>c)
     {
      System.out.println(b+ "is largest Number");
      
     }
     else
     {
      System.out.println(c+ "is largest Number");
     
     }*/
     // appraoch2
     //Tarnary operator
     
     int largest1=a>b?a:b; //largest of a & b
     int largest2=c>largest1?c:largest1;
     System.out.println(largest2+ "is Largest Number");
     
   }
}
