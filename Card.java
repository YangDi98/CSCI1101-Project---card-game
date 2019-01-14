/*CSCI 1101 - Project
  This is a class defines card objects*/
public class Card{
   //attributes
   private String suit;
   private int value;
   //constructor
   public Card(){
      suit = "";
      value = 0;
   }
   public Card(String s,int v){
      suit = s;
      value = v;
   }
   //getters and setters
   public void setSuit(String s){
      suit = s;
   }
   public void setValue(int v){
      value = v;
   }
   public String getSuit(){return suit;}
   public int getValue(){return value;}
   //toString method
   public String toString(){
      if(value<=10){
         return value+" "+suit;
      }
      else{
         String temp = "";
         if(value == 11)
            temp = "Jack";
         else if(value == 12)
            temp = "Queen";
         else if(value == 13)
            temp = "King";
         else if(value == 14)
            temp = "Ace";
         return temp+" "+suit;
      }
   }
}