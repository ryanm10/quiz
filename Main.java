//Welcome to my coding project for class! The main purpose of this project was to be a simple quiz where you just answer a little question about what class period of programming I have. Now, ready to take the quiz? Go for it!
//Ryan Milton
//Period 3 
//October 16th 2020 

import java.util.Scanner; //Meant to be for the scanner
class Main { //Starting off
  public static void main(String[] args) {
  Scanner reader = new Scanner(System.in);//My scanner
    System.out.println("Welcome to the quiz! In this short little quiz, you will be answering a question about what class period I have Ms. Gaber! :)");//Introducing and welcoming the user who is taking the quiz
    
    boolean correct = false;
  
    while (correct == false) { //While

    
      System.out.println("What class period do I have Ms. Gaber?");//Asking what the class period I'm in is
      System.out.println("(A) 1st Period");//Option choice for the first class
      System.out.println("(B) 3rd Period");//Option choice for the second class
      
      String response = reader.nextLine();//Takes/accepts/reads user input
    
      if (response != null && response.equals("B"))//If the user sends in B
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