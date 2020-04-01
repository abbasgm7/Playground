#include<iostream>
using namespace std;
int main()
{
  int w,x,y,z,a,n;
  std::cin>>w; //copies sold
  std::cin>>x; //cost per copy
  std::cin>>y; //agency cost price
  z=w*x;
  a=w*y;
  n=z-a-100;
  std::cout<<n;
}