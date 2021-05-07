
#include<iostream>
//#include<conio>
#include<string.h>
//#include<stdio>
using namespace std;
int main()
{
    
    char str1[100], str2[100];
    //cout<<"Enter first string : ";
    gets(str1);
    //cout<<"Enter second string : ";
    gets(str2);
    if(strcmp(str1, str2)==0)
    {
        cout<<"It is correct";
    }
    else
    {
        cout<<"It is wrong";
    }

}

