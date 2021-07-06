public class Swapping2Numbers{
       public static void main(String[]args)
     {  
       //logic1 using third variable

       int a=10,b=30;
       System.out.println("before swapping the values are.."+a+" "+b);
       /*int t=a;
           a=b;
           b=t;*/



        //logic2 excepting third variable and using "+" & "-"

          /* a=a+b;

           b=a-b;
           a=a-b;*/

        //logic3 using multiplication and division

        /*a=a*b;
        b=a/b;
        a=a/b;*/

    //logic4 single statement
     
      // b=a+b-(a=b);

     //logic5 using xoR operator

      a=a^b;
      b=a^b;
      a=a^b;

       System.out.println("after swapping the values are.."+a+" "+b);
     }
}
       
     
  
