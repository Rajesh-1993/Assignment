class Hobbits{
String name;
}

public class HobbitsTestDrive{
public static void main(String[] args){
	
	Hobbits[] h = new Hobbits[3];
	//int z = 0;
	int z = -1;
	//while(z<4){
		while(z<2){
		z = z+1;
		h[z] = new Hobbits();
		h[z].name = "Frido"; 
		if (z == 1){
			h[z].name = "Tredo";	
		}
		
		if (z == 2){
			h[z].name = "Sam";	
		}
		System.out.print(h[z].name + " is a ");
		System.out.println(" good hobbit name");
		
	}
	
	
}

}