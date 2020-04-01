#include<iostream>
using namespace std;
int main()
{
  float a,b,c,d;
  std::cin>>a>>b>>c;
  d=a*b; //distance can be travelled
  if(d>=c)
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
}