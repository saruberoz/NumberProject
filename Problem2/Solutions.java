class Main
{
  public static void main (String[] args) throws java.lang.Exception
  {
     int x = 4000000;
     
     int a = 2;
     int temp = 0;
     int temp2 = 2;
     int sum = 2;
     
     while(true) {
         a = 4*a + temp;
         if (a > x)
            break;
         temp = temp2;
         temp2 = a;
         sum += a;
         System.out.println("a is :" + a);
         System.out.println("sum is : " +sum);
     }
  }
}

// It actually appears that the even fibonacci number is
// 2
// 8 = 4*0 + 0
// 34 = 4*0 + 2
// 144 = 4*0 + 8
// 610 = 4*0 + 34
// etc