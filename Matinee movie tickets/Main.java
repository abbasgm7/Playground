#include<iostream>
using namespace std;
int main()
{
  int a;
  float b;
  std::cin>>a>>b;
  if(a>13 && (b<11 || b>14))
    std::cout<<"$8.00";
  else if(a>13 && (b>11 || b<14))
    std::cout<<"$5.00";
  else if(a<13 && (b<11 || b>14))
    std::cout<<"$4.00";
  else if(a<13 && (b>11 || b<14))
    std::cout<<"$2.00";
}