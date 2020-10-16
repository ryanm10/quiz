import java.util.Scanner; //Meant to be for the scanner
class Main { //Starting off
  public static void main(String[] args) {
  Scanner reader = new Scanner(System.in);//My scanner
    System.out.println("Welcome to the quiz!");//Introducing and welcoming the user who is taking the quiz
    
    boolean correct = false;
  
    while (correct == false) {

    
      System.out.println("What the class period?");//Asking what the class period I'm in is
      System.out.println("(A) 1st Period");//Option choice for the first class
      System.out.println("(B) 3rd Period");//Option choice for the second class
      
      String response = reader.nextLine();//Takes/accepts/reads user input
      
      if (response.equals("B"))//If the user sends in B
      {
        System.out.println("You are correct!");//Printing correct if they Send B
        correct = true;
      }
      else //If they DO NOT send B
      {
        System.out.println("Wrong! Sorry!");//Letting them know that B was not the answer to the question, they may retry the quiz
      }
  
    }
  }
}
//