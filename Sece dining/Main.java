#include<iostream>
#include <string>
using namespace std;
int main()
{
  string a;
  string f="front";
  int b;
  std::cin>>a>>b;
  if(a==f)
  {
     if(b==1)
     {
       std::cout<<"Left Handed";
     }
     else
     {
       std::cout<<"Right Handed";
     }
  }
  else
  {
     if(b==1)
     {
       std::cout<<"Right Handed";
     }
     else
     {
       std::cout<<"Left Handed";
     }
  }
}