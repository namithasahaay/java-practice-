import java.util.*;
class primeNum{
public static void main(String arg[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a number:");
 int num=sc.nextInt();
 int count=0;
for(int i=0;i<num;i++)
{
 if(num%1==0)
{
count++;
}
}
if(count==2)
{
System.out.println(" it is a prime number");
}
else{
System.out.println("it is not a prime number");
}
}

}
