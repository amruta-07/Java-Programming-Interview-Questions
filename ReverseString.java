public class ReverseString{
   public static void main(String [] args){
   //logic1 by using +(string concatenation) operator

   String str="Amruta";
   String rev="";

   /*int len=str.length();
   for(int i=len-1;i>=0;i--)
   {
     rev=rev+str.charAt(i);
   }
   System.out.println("Reversed string is:"+ rev);*/

   //logic2 by using charArray
   
   /*char a[]=str.toCharArray();
   int len=a.length;
   for(int i=len-1;i>=0;i--)
   {
     rev=rev+a[i];

   }  
   System.out.println("Reversed string is:"+ rev);*/ 
   
   //logic3 by using StringBuffer
   
    StringBuffer sb=new StringBuffer(str);
    System.out.println(sb.reverse());
       
    //Output: aturmA

 }
}
