#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  std::cin>>a;
  b=a%10; //last digit
  a/=10;
  a/=10;
  a/=10;
  c=a;
  d=b+c;
  std::cout<<d;
}