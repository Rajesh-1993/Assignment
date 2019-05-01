public class Dog{
	String name ;
	
public static void main(String[] args){
 Dog dog1 = new Dog();
 dog1.name = "Fredo";
 dog1.bark();

Dog[] dogArray = new Dog[3];
dogArray[0] = new Dog();
dogArray[1] = new Dog();
dogArray[2] = dog1;

dogArray[0].name = "Pinto";
dogArray[1].name = "Vento";

System.out.println("Last dog's name is : "+dogArray[2].name);
System.out.println();

int x = 0;
while(x<dogArray.length){
	
	dogArray[x].bark();
	x = x+1;
	
}
}
public void bark(){
	System.out.println(name +"Ruff!");
	
}



}