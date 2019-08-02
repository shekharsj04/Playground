#include<stdio.h>
int main()
{
int num1;
  scanf("%d",&num1);
  int a=num1/10;
  int b= num1%10;
  int c= a+b;
  printf("%d",c);

  return 0;
}