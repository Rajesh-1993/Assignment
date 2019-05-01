public class Triangle{

double araa;
int height;
int length;

public static void main(String[] args){
int x = 0;
Triangle[] tl = new Triangle[4];

while(x<4){
	tl[x] = new Triangle();
	tl[x].height = (x+1)*2;
	tl[x].length = x+4;
	tl[x].setArea();
	System.out.print("Triangle"+x+"area");
	System.out.println(" = "+tl[x].area);
	x = x+1;
}

int y = x;
x = 27;
Triangle t5 = tl[2];
tl[2].area = 343;
System.out.print("y = " +y);
	System.out.println(", t5 area = "+t5.area);

}
void setArea(){
	area = (height*lenght)/2
}
}