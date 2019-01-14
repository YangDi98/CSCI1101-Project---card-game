/*CSCI 1101 - Project
  This is a program for a card game*/
import java.util.Scanner;
import java.io.*;
import javafx.application.Application;     //extends from the application class
public class Demo{

   public static void main(String args[])throws IOException {
      Scanner kb = new Scanner(System.in);
      System.out.println("Welcome to the card game!");
      //get how many players
      System.out.print("Enter 2 for two-player mode, enter 4 for four-player mode: ");
      //**error checking
      int mode = kb.nextInt();
      while(mode!=2&&mode!=4){
         System.out.print("Invalid input. Please try again: ");
         mode = kb.nextInt();
      }
      //get what deck to play with
      Deck deck = new Deck();
      System.out.print("Enter 1 for Canadian deck, enter 2 for Chinese deck, enter 3 for deck with your own suits: ");
      int d = kb.nextInt();
      while(d!=1&&d!=2&&d!=3){
         System.out.print("Invalid input. Please try again: ");
         d = kb.nextInt();
      }
      if(d==1){
         deck = new CanadianDeck();
      }
      else if(d==2){
         deck = new ChineseDeck();
      }
      else if(d==3){
         System.out.print("Enter you own four suits: ");
         deck = new SpecialDeck(kb.next(),kb.next(),kb.next(),kb.next());
      }
      //give users rules
      File file = new File("TwoPlayerRules.txt");
      if(mode==2){
         file = new File("TwoPlayerRules.txt");
         SmileyFace1 faces1 = new SmileyFace1();
         faces1.main(args);         
      }
      else if(mode==4){
         file = new File("FourPlayerRules.txt");
         SmileyFace faces = new SmileyFace();
         faces.main(args);
      }
      Scanner inputFile = new Scanner(file);
      while(inputFile.hasNext()) {
         String line = inputFile.nextLine();
         System.out.println(line);
      }
      inputFile.close();
      //play the actual game
      if(mode == 2){
         System.out.print("Enter players' names: ");
         String player1 = kb.next();
         String player2 = kb.next();
         TwoPlayerGame game = new TwoPlayerGame(player1,player2,deck);
         game.playGame();
      }
      else if(mode==4){
      System.out.print("Enter players' names: ");
      String player1 = kb.next();
      String player2 = kb.next();
      String player3 = kb.next();
      String player4 = kb.next();
      FourPlayerGame game = new FourPlayerGame(player1,player2,player3,player4,deck);
      game.playGame();
      
      }
   }
   
}
   