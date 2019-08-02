#include<stdio.h>
int main()
{
int num1;
  scanf("%d",&num1);
  int a= num1%100;
  int b= a/10;
  printf("%d",b);
  return 0;
}