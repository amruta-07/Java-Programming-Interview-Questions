class NumericPattern6
{
    public static void main(String[] args)
  {
      int count=0;
      for(int i=1;i<=5;i++)
      {
         if(i%2!=0)
         {
             for(int j=1;j<=3;j++)
             {
                 count=count+1;
                 System.out.print(count+" ");
             }
             //System.out.println();
         }

      
         else
         {
              int temp=count+1;
              for(int j=count+3;j>=temp;j--)
              { 
                 count=count+1;
                 System.out.print(count+j+" ");

              }
             

          }
           System.out.println();
      
       
        
    }

  }

}
/* output
 
1 2 3
10 10 10
7 8 9
22 22 22
13 14 15    */
 









