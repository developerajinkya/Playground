#include<iostream>
using namespace std;
int main()
{
    int r,c;
  cin>>r>>c;
  int a[r][c];
  int b[r][c];
  int sum[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
   for(int m=0;m<r;m++)
  {
    for(int n=0;n<c;n++)
    {
      cin>>b[m][n];
    }
  }
  
  for(int p=0;p<r;p++)
  {
      for(int k=0;k<c;k++)
      {
         sum[p][k]=a[p][k]+b[p][k];
      }
  }
  for(int l=0;l<r;l++)
  {
      for(int t=0;t<c;t++)
      {
          cout<<sum[l] [t]<<" ";
          
      }
      cout<<"\n";
  }
}
  
  
  
