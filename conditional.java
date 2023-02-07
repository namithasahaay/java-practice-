import java.util.Scanner;
class conditional
{
  public static void main(String arg[])
{ 
  int num1,num2,num3,biggest;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter all te values:");
  num1=sc.nextInt();
  num2=sc.nextInt();
  num3=sc.nextInt();
  biggest=num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3);
  System.out.println("The biggest number is:"+biggest);
 
  }
}