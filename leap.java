import java.util.*;
class leap
{
   public static void main(String args[])
{
   int startYear,endYear,i;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the startYear:");
   startYear=sc.nextInt();
   System.out.println("Enter the endYear:");
   endYear=sc.nextInt();
   System.out.println("leapYear");
 for(i=startYear;i<=endYear;i++)
{
  if(0==i%4 && 0!=i%100|| 0==i%400 )
{
  System.out.println(i);
}

}
 
}

}