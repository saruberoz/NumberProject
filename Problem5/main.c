#include <stdio.h> 

int main(void) {
   int x = 2520;
  
// since we know that 2520 is easily divisible by 1..10 then  we can multiply 2520 by all prime between 10..20
   and also 16, but because 16 can be break into 2 * 8 and 2520 is already div by 8.. then we can easily multiply by 2
   so n = 2520 * all prime between 10..20 * 2
   
   int n = 2520 * 11 * 13 * 17 * 19 * 16/8;
   int i;
   for(i = 1 ; i <= 20 ; i++)
	if(n % i != 0)
		printf("number not divisible by %d", i); 
   printf("number div by 1..20 is %d", n);
   return 0; 
}