#include<iostream>
using namespace std;
int main()
{
int petrol,dist,possibleDist;
float milage;
cin>>milage>>petrol>>dist;
possibleDist=milage*petrol;
if(possibleDist >= dist)
cout<<"Can reach";
else
cout<<"Cannot reach";
return 0;
}
