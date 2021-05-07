/* C++ program to find the sum of elements in each row and each column of the given matrix and print the greatest of the same */
#include<iostream>
using namespace std;
int main()
{
    int m, n, row, col, sum = 0, row_ind = 0, col_ind = 0;
    //cout << “\nEnter the order of the matrix : “;
    cin >> m >> n;
    int row_arr[m];
    int i, j;
    int mat[m][n];
    //cout << “\nInput the matrix elements : \n”;
    for(i = 0; i < m; i++)
    {
        for(j = 0; j < n; j++)
            cin >> mat[i][j];
    }

    int z = 0;

    //cout << "\nSum of rows is ";
    for(row=0; row<m; row++)
    {
        sum = 0;
        for(col=0; col<n; col++)
        {
            sum += mat[row][col];
        }
        cout << sum <<endl;
        row_arr[z++] = sum;
    }
    //cout << endl;
    int temp_row = row_arr[0];
    for(i=1;i<m;i++)
    {
        if(temp_row < row_arr[i])
        {
            temp_row = row_arr[i];
            row_ind = i;
        }
    }
    
}
