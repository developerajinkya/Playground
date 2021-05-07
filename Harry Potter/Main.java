#include<iostream>

using namespace std;

int main()

{

int n,i,r1,sum,n1[10];

cin>>n;

i=0;

while(n!=0)

{

 r1=n%10;
n1[i]=r1;
i++;
n=n/10;

}

sum=n1[0]+n1[3];

cout<<sum;

}
