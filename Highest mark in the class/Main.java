#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(int j=0;j<n;j++)
  {
   if (a[0] < a[j])
            a[0] = a[j];
  }
  cout<<a[0];
  return 0;
}