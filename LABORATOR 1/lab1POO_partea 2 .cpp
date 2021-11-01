#include <iostream>
using namespace std;

class student
{
public:
    string nume;
    int an;
    int nota;
    int n;
public : student()
    {
        nume = "";
        an = 0;
	   nota = 0;
    };
public : student(char n, int an, int nota)
    {
    	int i;
        nume = n;
        an = an;
        nota = nota;
    };
 public: void Citeste_ST()
    {
        cout<<"Nume : ";
        cin>>nume;
        cout<<"Anul : ";
        cin>>an;
        cout<<"Nota : "; 
        cin>>nota;
    };

    public: void Afisare_ST()
    {

        cout<<"Nume : "<<nume<<endl;
        cout<<"Anul : "<<an<<endl;
        cout<<"Nota : "<<nota<<endl;

    };
public:
    void Media()
	{
		int nota[10];
	    float s = 0;
	    for(int i = 0 ; i<n; i++)
	    {
	    s = s + nota[i];
	    }
		float media = s / n;
		cout<<"Media: "<<media<<endl;
    }
};


class Universitate
{
public:
    string Nume;
    int An_fondarii;
    int n;
    

    public : Universitate()
    {
        Nume = " ";
        An_fondarii = 0;
    }

public:
    Universitate(string univer, int an)
    {
        Nume = univer;
        An_fondarii = an;
    }

public:
    void Citeste()
    {
        cout << "Nume universitate : ";
        cin >> Nume;
        cout << "Anul fondarii : ";
        cin >> An_fondarii;
    }

public:
    void Afiseaza()
    {
        cout << "Afisarea datelor : "<<endl;
        cout << "Nume universitate : " << Nume<<endl;
        cout << "Anul Fondarii : " << An_fondarii<<endl;
    }

};

int main()
{
    float media;
    Universitate u[10];
    student st[10];
    int n,m;
    cout<<"Introduceti numarul de studenti:    ";
    cin>>n;
    cout<<"Introduceti datele : "<<endl;
    cout<<"___________________________"<<endl;
    for(int i=0;i<n;i++)
	{
        st[i].Citeste_ST();
    }
    cout<<"Afisarea datele : "<<endl;
    cout<<"___________________________"<<endl;
    for(int i=0;i<n;i++)
	{
        st[i].Afisare_ST();
        cout<<"___________________________"<<endl;
    }
    cout<<"Introduceti numarul de Universitati : ";
    cin>>m;
    cout<<"Introduceti datele : "<<endl;
    for(int j=0;j<m;j++)
	{
        u[j].Citeste();
        cout<<"___________________________"<<endl;
    }
    cout<<"Afisarea datele : ";
    for(int j=0;j<m;j++)
	{
        u[j].Afiseaza();
        cout<<"___________________________"<<endl;
    }
    cout<<"Lista de studenti a Universitatii:"<<endl;
    for(int i=0;i<n;i++)
	{
        st[i].Afisare_ST();
        cout<<"___________________________"<<endl;
    }
    cout<<"NOta medie a studentilor:   "<<endl;
    
        st->Media();
        cout<<"___________________________"<<endl;
    return 0;
	}



