#include<iostream>
using namespace std;
int main()
{
  int a,b,c,mid,small,big;
  cin>>a>>b>>c;
  if(((a<b)&&(a>c)) || ((a>b)&&(a<c)))
  {
      mid = a;
      if(b>c) 
      {
          small = c;
          big = b;
      }
      else
      {
          small = b;
          big = c;
      }
  }
  else if(((b<a)&&(b>c)) || ((b>a)&&(b<c)))
  {
      mid = b;
      if(a>c) 
      {
          small = c;
          big = a;
      }
      else
      {
          small = a;
          big = c;
      }
    }
  else if(((c<b)&&(c>a)) || ((c>b)&&(c<a)))
  {
      mid = c;
      if(b>a)
      {
          small = a;
          big = b;
      }
      else
      {
          small = b;
          big = a;
      }
  }
  cout<<"The treasure is in box which has number "<<mid<<"\n";
  if(big%small==0 && mid%small==0)
  {
      cout<<"The code to open the box is "<<small;
  }
  else
  {
      cout<<"The code to open the box is "<<1;
  }
}