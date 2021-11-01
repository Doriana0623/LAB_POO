#include <iostream>
#include <string.h>
using namespace std;

class Monitor{
public :  
string culoare;
int dimensiune;
int rezolutia;

void setR(int rezolutia){
	this->rezolutia = rezolutia;
}

void setD(int dimensiune){
	this->dimensiune = dimensiune;
}

void setC(string culoare){
	this->culoare = culoare;
}

public : int getRez(){
	return this->rezolutia;
}

public : int getDim(){
	return this->dimensiune;
}

public : string getCul(){
	return this->culoare;
}


public : Monitor(int rezolutia, int dimensiune, string culoare)
{
	this->culoare = culoare;
	this->dimensiune = dimensiune;
	this->rezolutia  = rezolutia;
}
};


int main(){
	
        Monitor* m1 = new Monitor(90, 19, "alb");
        Monitor* m2 = new Monitor(50, 1980, "negru");
        cout<<"\n\tprimul monitor: \nCuloare: " + m1->getCul() + "\nDimensiunea: " <<m1->getDim()  <<"\nRezolutia: " << m1->getRez();
        m1->culoare = "ALB";
        m1->dimensiune = 43; 
        m1->rezolutia = 1200;
        cout<<"\n\tprimul monitor actualizat: \nCuloare: " + m1->getCul() + "\nDimensiunea: " <<m1->getDim()  <<"\nRezolutia: " << m1->getRez();
        cout<<"\n\tal doilea monitor: \nCuloare: " + m2->getCul() + "\nDimensiunea: " <<m2->getDim()  <<"\nRezolutia: " << m2->getRez();
        
return 0;
}
