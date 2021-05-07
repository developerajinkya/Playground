#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
	int s = 0, e = 0,count = 0,key;
  	cin >> s >> e >> key;
  	for(int i = s; i <=e; i++)
    {
      int temp = i;
      while(temp != 0)
      {
		if((temp%10) == key)
          count++;
        temp = temp/10;
      }
    }
      cout << count;
  return 0;
}