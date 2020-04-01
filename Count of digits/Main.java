#include<iostream>
int main()
{
  int a,b;
  std::cin>>a;
  int c=0;
  do
    if(a>=0)
    {
      b=a%10;
      c=c+1;
      a/=10;
    }
  while(a>0);
  {
  std::cout<<c;
  }
}