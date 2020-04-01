#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f,g,h,i;
  cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  int x,y,z;
  x=(a-((a*b)/100))+c;
  y=(d-((d*e)/100))+f;
  z=(g-((g*h)/100))+i;
  
  cout<<"In Flipkart Rs."<<x;
  cout<<"\nIn Snapdeal Rs."<<y;
  cout<<"\nIn Amazon Rs."<<z;
  
  cout<<"\nHe will prefer ";
  if(x<=y && x<=z)
  {
    cout<<"Flipkart";
  }
  else if(y<=z)
  {
      cout<<"Snapdeal";
  }
  else
  {
      cout<<"Amazon";
  }
}