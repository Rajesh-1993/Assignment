public class Clock{

String time;
public void setTime(String t){
time = t;
}
String getTime(){
	return time;
}

public static void main (String[] args ){
	Clock c = new Clock();
	c.setTime("12:45");
	String tod = c.getTime();
	System.out.println("Time : "+tod);	
}

}