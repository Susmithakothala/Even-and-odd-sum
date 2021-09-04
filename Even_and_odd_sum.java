import java.util.Scanner;
class Even_and_odd_sum
{
public static void main(String[] args)
{
 Scanner s = new Scanner(System.in);
  System.out.println("enter a number:");
  int n = s.nextInt();
    int rem = 0;
   int eve = 0, odd = 0; 
    int eve_sum = 0, odd_sum = 0;
   while(n!=0)
{
   rem  = n%10;
   if(rem%2== 0)
{
  eve++;
 eve_sum = eve_sum + rem;
}
else
{
 odd++;
 odd_sum = odd_sum + rem;
}
n = n/10;
}
System.out.println("Even sum = " + eve_sum);
System.out.println("no of even numbers = " + eve);
System.out.println("odd sum = " + odd_sum);
System.out.println("no of odd numbers = " + odd);
}
}