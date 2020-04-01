#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  std::cin>>a>>b>>c;
  if(c<=b || c%b==0 || (c-1)%b==0)
    std::cout<<"Yes";
  else
    std::cout<<"No";
}