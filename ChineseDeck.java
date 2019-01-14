/*CSCI 1101 - project
  This class entends Deck class*/
public class ChineseDeck extends Deck{
   public ChineseDeck(){
      super();
      for(int i = 2;i<15;i++){
         Card c = new Card("Hearts",i);
         super.getCards().add(c);
         super.getCards().add(c);
      } 
      for(int i = 2;i<15;i++){
         Card c = new Card("Diamonds",i);
         super.getCards().add(c);
         super.getCards().add(c);
      }
      for(int i = 2;i<15;i++){
         Card c = new Card("Clubs",i);
         super.getCards().add(c);
         super.getCards().add(c);
      }
      for(int i = 2;i<15;i++){
         Card c = new Card("Spades",i);
         super.getCards().add(c);
         super.getCards().add(c);
      }
   }

}