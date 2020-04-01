#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f;
  std::cin>>a;
  std::cin>>b;
  std::cin>>c;
  d=b*75; //adults
  e=c*30; //child
  f=d+e;
  if(f<a)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}