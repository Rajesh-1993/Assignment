class Movie{
String title;
String genre;
int rating;

void playIt(){

System.out.print("Playing the movie");

}
}

public class MovieTestDriver{
public static void main(String[] args){

Movie one  = new Movie();
one.title = "Gone with the Stock";
one.genre = "Tragic";
one.rating = 2 ;


Movie two = new Movie();
two.title = "Lost in Cubicle Space";
two.genre = "Comedy";
two.rating = 5;
two.playIt();

Movie three = new Movie();
three.title = "Byte Club";
three.genre = "Tragic but ultimately up lifting";
three.rating = 125;

}



}