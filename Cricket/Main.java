#include<iostream>
#include <iomanip>
int main()
{
  int na,a,i,ni;
  float x,y,z,w;
  std::cin>>na>>a>>i>>ni;
  x=((na/6)+(na%6)*0.1);
  y=((ni/6)+((ni%6)*0.1));
  z=(i/y);
  w=(a/x);
  std::cout<<x<<"\n";
  std::cout<<std::fixed << std::setprecision(1)<<y<<"\n";
  std::cout<<std::fixed << std::setprecision(1)<<z<<"\n";
  std::cout<<std::fixed << std::setprecision(1)<<w<<"\n";
  if(z>w)
  {
      std::cout<<"Eligible to Win";
  }
  else
  {
      std::cout<<"Not Eligible to Win";
  }
}