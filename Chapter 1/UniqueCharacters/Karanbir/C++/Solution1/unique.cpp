#include<iostream>
using namespace std;

int i =0;
char input[100], ch='y';
bool flag = true;
int main(){

	while( ch == 'y'){
		cout<<"Please enter any characters \t";
		cin>>input[i++];
		cout<<endl<<"Do you want to continue (y/n)";
		cin>>ch;
	}

	cout<<input<<endl;
	for(int j=0; j<=i; j++){
		char selected = str[j];
		
		for(int k = j+1; k<i;k++){
			
			if(selected == str[k]){
				flag = false;
				break;
			} 
		}
	}

	if(flag) cout<<"No Duplicates found \n";
	else cout<<"Duplicates found \n";


	return 0;
}