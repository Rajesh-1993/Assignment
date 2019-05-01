public class ElectricGuitar{
String brand;
int numOfPickups;
boolean rockStarUsesIt;

public String getBrand(){
	return brand;
}
public void setBrand(String b){
	brand = b;
}

public int getNumOfPickups(){
	return numOfPickups;
}
public void setNumOfPickups(int n){
	numOfPickups= n;
}

public boolean getRockStarUsesIt(){
	return rockStarUsesIt;
}
public void setRockStarUsesIt(boolean yesOrNo){
	 rockStarUsesIt= yesOrNo;
}
public static void main(String[] args){
	
	ElectricGuitar eg  = new ElectricGuitar();
	
System.out.println("Brand : "+eg.getBrand());	
System.out.println("numOfPickups : "+eg.getNumOfPickups());
System.out.println("rockStarUsesIt : "+eg.getRockStarUsesIt());
}

}