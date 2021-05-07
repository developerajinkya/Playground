#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin >> n;
    
    int temp = n;
    int sum, count = 0;
    vector <int> v;
    int len = 0;
    while(n != 0)
    {
        v.push_back(n % 10);
        n = n / 10;
    }
    reverse(v.begin(), v.end());
    for(int i = 0; i < v.size(); i++)
    {
        sum = v[i];
        for(int j = i+1; j < v.size(); j++)
        {
            sum = sum * 10 + v[j];
            if(sum % 11 == 0)
                count++;
        }
    }
    cout << count;
}