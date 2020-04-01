#include <iostream>
int main() 
{
  int a,b;
  std::cin>>a;
  while(a>0)
  {
    b=a%10;
    std::cout<<b;
    a/=10;
  }
	return 0;
}