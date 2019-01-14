/*CSCI 1101 - Project
  This is a class defines Deck objects*/
import java.util.ArrayList;
import java.util.Random;
public class Deck{
   //attributes
   private ArrayList<Card> cards;
   //constructor
   public Deck(){
      cards = new ArrayList<Card>();
      //give values to the arraylist
   }
   //get and set methods
   public void setCards(ArrayList<Card> cards1){
      //shallow copy
      cards = cards1;
   }
   public ArrayList<Card> getCards(){return cards;}
   //shuffle method
   public void shuffle(){
      //go through the arraylist and swap cards every card with a random card
      Random ran = new Random();
      if(cards.size()!=0){
         for(int j = 0;j<cards.size();j++){
            int i = ran.nextInt(cards.size());
            Card temp = cards.get(j);
            cards.set(j,cards.get(i));
            cards.set(i,temp);
         }
      }
   }
}