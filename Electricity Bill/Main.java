#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  if(200 >= n)
  {
      std::cout<<"Rs."<<(int)(n*0.5);
  }
  else if(400 >= n)
  {
      std::cout<<"Rs."<<(int)(n*0.65+100);
  }
  else if(600 >= n)
  {
      std::cout<<"Rs."<<(int)(n*0.80+200);
  }
  else if(600 < n)
  {
      std::cout<<"Rs."<<(int)(n*1.25+425);
  }
}