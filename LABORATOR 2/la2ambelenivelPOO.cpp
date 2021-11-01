#include <iostream>
#include <queue>
#include <cstdlib>
#include<conio.h>
#include<stdlib.h>
using namespace std;

#define M 10

class Box
{
public:
	int height;
	int	width;
	int depth;
public:	
	Box()
	{
		height = 0;
		width = 0;
		depth = 0;
	}
public:	 
	Box(int h, int w, int d) 
	{
		height = h;
		width = w;
		depth = d;
	}
public: void 
Read(){
		cout << "\nIntroduceti datele" << endl;
		cout<<"________________________________"<<endl;
		cout << "\tInaltimea:";
		cin >> height;
		cout << "\tLatimea:" ;
		cin >> width;
		cout << "\tAdincimea:" ;
		cin >> depth;
	}
public: void 
	Display() {
		cout << "\nAfisarea datele" << endl;
		cout<<"________________________________"<<endl;
		cout << "\tInaltimea:" << height <<endl;
		cout << "\tLatimea:" << width << endl;
		cout << "\tAdincimea:" << depth << endl;
	}
public: int Volum_Box() {
	return height * width * depth;
}
public: int Aria_Box() {
	return 2*(height*width + height*depth+width*depth);
}
};


//-------------------Clasa coada---------------

class  Queue
{
public:
	int tabel[M];
	int nr_elem_Max;
	int prim_Elem;
	int ult_Elem;
	int k;

int Marime() {
		return k;
	}
bool Full() {
		return (Marime() == nr_elem_Max);
	}
public: 
	Queue() {	
		prim_Elem = 0;
		ult_Elem = 0;
	}
public:
    Queue( int prim, int u) 
	{	
		prim_Elem = prim;
		ult_Elem = u;
	}
		
public:	void Push_Queue() 
{
		if (ult_Elem == M)
			cout << "\n\tNumarul maxim a fost atins!";
		else {
			cout << "\n\tIntroduceti valoarea : ";
			cin >> nr_elem_Max;
			cout << "\nPozitia : " << ult_Elem + 1 << " , Valoarea  : " << nr_elem_Max;
			tabel[ult_Elem++] = nr_elem_Max;
		}
}
	 
public:	 void Display() 
      {
		  cout << "\n\tMarimea : " << (ult_Elem -prim_Elem);
		  for (int i = nr_elem_Max; i < ult_Elem; i++)
			  cout << "\n--Elementul : " << i << " , Valoare  : " << tabel[i];
	  }
public:	 void PoP_Queue() 
	 {
	if (prim_Elem == ult_Elem)
		cout << "\n\tCoada este fara elemente!";
	else {
		cout << "\n\t Valoarea inlaturata  :" << tabel[prim_Elem];
		prim_Elem++;
	}
}
};

int main() {	
	queue <int> q;
	Queue Q;
	Box b;
	int n;
	int m;
	cout << "\nSarcina Box"<<endl;
	cout<<"________________________________"<<endl;
	cout << "\n\tIntroduceti numarul de elemente:";
	cin >> n;
	for (int i = 0; i < n; i++)
	{
		b.Read();
		b.Display();
		cout << "\n\tVolumul cutiei: "<<b.Volum_Box();
		cout << "\n\tAria cutiei: " << b.Aria_Box()<<endl;
	}
	cout << "\n\nAfisarea cozii"<<endl;
	cout<<"________________________________"<<endl;
	cout << "\n\tIntroduceti numarul de elemente:";
	cin >> m;

	for (int i = 0; i < m; i++)
	{
		cout << "\tElemetele:"<<i<<endl;
		q.push(i);//adaugarea elem
	}
	cout << "\n\tMarimea cozii:" << q.size() << endl;
	cout << "\n\tPrimul element: " << q.front() << endl;
	cout << "\n\tUltimul element: " << q.back() << endl;
	q.pop(); //eliminarea         
	cout << "\n\tMarimea cozii finale:" << q.size() << endl;
		cout<<"________________________________"<<endl;
	cout << "\n\t Coada prin Clasa"<<endl;
		cout<<"________________________________"<<endl;
	Q.Push_Queue();
	Q.Display();
	Q.PoP_Queue();
}

