class Main
{
  public static void main (String[] args) throws java.lang.Exception
  {
     int i;
     int sum = 0;
     for(i = 1 ; i < 1000 ; i++) {
         if (i % 3 == 0 || i % 5 == 0){
             sum += i;
         }
     }
     System.out.println("sum is : " +sum);
  }
}