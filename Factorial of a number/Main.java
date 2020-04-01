#include<iostream>
int main()
{
  int a;
  std::cin>>a;
  int b=1;
  for(int i=1; i<=a ; i++)
  {
    b = b*i;
  }
  std::cout<<b;
}