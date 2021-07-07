import java.util.Scanner;
public class ReverseNumber{
   public static void main(String[] args){
  

     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number:");
  
    int num=sc.nextInt();
  //logic1 using algorithm
   /*int rev=0;
   while(num!=0)
     {
       rev=rev*10+num%10;
       num=num/10;*/
     //logic2 using StringBuffer
     StringBuffer rev;
    StringBuffer sb=new StringBuffer(String.valueOf(num));
     StringBuffer rev=sb.reverse();
    
     


    
       
     }
      System.out.println("Reverse number is:" + rev);


       
   }

}
    
   

