import java.io.*;
class GameHelper{
public String getUserInput(String prompt){
String inputLine = null;
System.out.print(prompt+" ");
try{
BufferedReader bf  = new BufferedReader(new InputStreamReader(System.in));
inputLine = bf.readLine();
if(inputLine.length() == 0){
return null;
}
}
catch(IOException e){
System.out.print("IOException : "+e);

}
return inputLine;
}
}


class SimpleDotCom{

int[] locationCells;
int numOfHits;

public void setLocationCells(int[] locs){
locationCells = locs;

}

public String checkYourSelf(String stringGuess){
int guess = Integer.parseInt(stringGuess);
String result = "miss";
for(int cell: locationCells){
if(guess == cell){
result = "hit";
numOfHits++;
break;
}
}
if(numOfHits == locationCells.length){
result = "kill";
}
System.out.println(result);
return result;
}

}

public class SimpleDotComTestDrive{

public static void main(String[] args){
int noOfGuesses = 0;
GameHelper helper = new GameHelper();
int randomNum = (int)(Math.random()*5);

SimpleDotCom dot  = new SimpleDotCom();
int[] locations = {randomNum,randomNum+1,randomNum+2};
dot.setLocationCells(locations);

boolean isAlive = true;
while(isAlive == true){
String guess = helper.getUserInput("enter a number");
String result = dot.checkYourSelf(guess);
noOfGuesses++;
if(result.equals("kill")){
isAlive = false;
System.out.println("You took " +noOfGuesses+ " guesses.");


}
}

//String userGuess = 2;
//String result  = dot.checkYourSelf(userGuess);
}

}