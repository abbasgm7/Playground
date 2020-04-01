#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int s,m,t,w,th,f,sa,salary,x;
  std::cin>>s>>m>>t>>w>>th>>f>>sa;
  salary=(m+t+w+th+f)*100;
  if(m>8 && m<24)
  {
    x=m-8;
    salary=salary+15*x;
  }
  if(t>8 && t<24)
  {
    x=t-8;
    salary=salary+15*x;
  }
  if(w>8 && w<24)
  {
    salary=salary+15*(w-8);
  }
  if(th>8 && th<24)
  {
    salary=salary+15*(th-8);
  }
  if(f>8  && f<24)
  {
    salary=salary+15*(f-8);
  }
  if((m+t+w+th+f)>40)
  {
    salary=salary+((m+t+w+th+f)-40)*25;
  }
  if(sa>0 && (m+t+w+th+f)<40)
  {
    salary=salary+125*sa;
  }
  if(s>0 && (m+t+w+th+f)<40)
  {
    salary=salary+150*s;
  }  
  std::cout<<salary;
}