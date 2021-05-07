#include <iostream>
using namespace std;

class TreeHeight
{
    public:
        int feets;
        int inches;
};

int main()
{
    int n;
    cin >> n;
    TreeHeight arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i].feets;
        cin >> arr[i].inches;
    }

    int max = 0;
    for (int i = 0; i < n; i++)
    {
        int temp = arr[i].feets * 12 + arr[i].inches;
        if (max < temp)
            max = temp;
    }

    cout << max;
}