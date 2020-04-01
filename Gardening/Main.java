#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  std::cin>>a>>b>>c;
  if(((c<=(a*b-a) && c>=(a*b-(a*2))) || (c>=a+1 && c<=a*2)))
    std::cout<<"It is a mango tree";
  else
    std::cout<<"It is not a mango tree";
}