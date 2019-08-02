#include<stdio.h>
int main()
{
int num1;
  scanf("%d",&num1);
  int a= num1/100;
  int b= num1%100;
  int c= b%10;
  int d= c+a;
printf("%d",d);
  return 0;
}