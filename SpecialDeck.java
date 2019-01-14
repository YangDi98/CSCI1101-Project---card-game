/*CSCI 1101 - project
  This class extends Deck class*/
public class SpecialDeck extends Deck{
   //this deck allow users to create a deck with special suits they choose but the size is 52 cards
   public SpecialDeck(String suit1,String suit2,String suit3,String suit4){
      super();
      for(int i = 2;i<15;i++){
         Card c = new Card(suit1,i);
         super.getCards().add(c);
      } 
      for(int i = 2;i<15;i++){
         Card c = new Card(suit2,i);
         super.getCards().add(c);
      }
      for(int i = 2;i<15;i++){
         Card c = new Card(suit3,i);
         super.getCards().add(c);
      }
      for(int i = 2;i<15;i++){
         Card c = new Card(suit4,i);
         super.getCards().add(c);
      }
   }
}