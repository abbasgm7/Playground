#include<iostream>
using namespace std;
int main()
{
  int x,r,y,a,b;
  float c,d;
  std::cin>>x>>y>>r;
  a=x*r*y/100; //total interest
  b=x+a; //total amount
  c=a*0.02; //discount amount
  d=b-c; //final amount to be paid
  std::cout<<a<<"\n"<<b<<"\n"<<c<<"\n"<<d;
}