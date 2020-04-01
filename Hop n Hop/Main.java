#include<iostream>
#include<cmath>
using namespace std;
int main()
{
 int a,b,x,y,c,d,e;
  a=3;
  b=4;
  std::cin>>x>>y;
  c=(a-x)*(a-x);
  d=(b-y)*(b-y);
  e=sqrt(c+d);
  std::cout<<e;
}