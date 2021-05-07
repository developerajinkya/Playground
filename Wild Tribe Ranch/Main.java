#include<iostream>
using namespace std;
int main ()
{
int num1,num2;

cin>>num1>>num2;
if (num1>num2)
cout<<"Yes, you can enter.";
else if (num1<num2) cout<<"Sorry, you can't enter";
else if (num1==num2)
cout<<"Yes, you can enter. Kindly use a rope.";

return 0;
}