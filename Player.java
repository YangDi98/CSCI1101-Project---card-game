/*CSCI 1101 - project
  This is a class defines player objects*/
import java.util.ArrayList;
public class Player{
   //attributes each player has an arraylist of cards and a name
   private ArrayList<Card> playerCards;
   private String name;
   //constructor
   public Player(String newName){
      name = newName;
      playerCards = new ArrayList<Card>();
   }
   //getters and setters
   public void setPlayerCards(ArrayList<Card> newPlayerCards){
      playerCards = newPlayerCards;
   }
   public void setName(String newName){
      name = newName;
   }
   public ArrayList<Card> getPlayerCards(){return playerCards;}
   public String getName(){return name;}
   //add a card
   public void addCard(Card newCard){
      //add card in order, from smallest to greatest
      if(playerCards.size()==0){
         playerCards.add(newCard);
      }
      else{
         int correctPosition = 0;
         boolean found = false;
         int i=0;
         while(i<playerCards.size()&&found==false){
            if(playerCards.get(i).getValue()>newCard.getValue()){
               correctPosition = i;
               found = true;
            }
            i++;
         }
         //if does not find the correctPosition, it means has to insert to the end
         if(correctPosition==0&&found==false){
            playerCards.add(newCard);
         }
         else{
            playerCards.add(correctPosition,newCard);
         }
      }
   }
   public void loseCard(Card c){
      //lose the first occurence of the card(Chinese deck has two sets)
      playerCards.remove(c);
   }
   //play card return the value of the card being played
   public int playOneCard(int currentValue){
      //the logic is to play the smallest card possible
      int value = 0;
      int index = 0;
      for(int i=0;i<playerCards.size();i++){
         //if first time see a qualified card, just change value and index
         if(playerCards.get(i).getValue()>currentValue&&value==0){
            value = playerCards.get(i).getValue();
            index = i;
         }
         //if not first time see a qualified card, compare it with the previous qualified card
         else{
            if(playerCards.get(i).getValue()>currentValue&&playerCards.get(i).getValue()<value&&value!=0){
               value = playerCards.get(i).getValue();
               index = i;
            }
         }
      }
      //if there is no qualified card, return the same currenValue
      if(value==0){
         System.out.print(name+" does not have suitable one card\n");
         return currentValue;
      }
      //otherwise play card
      System.out.printf("%-22s%-40s%-40s\n",name,playerCards.get(index),((playerCards.size()-1)+" cards left"));
      playerCards.remove(index);
      return value;
   }
   //play Two Card 
   public int playTwoCard(int currentValue){
      int value = 0;
      //check if this player has exactly two same cards(not three or four)
      int index = 0;
      int i=0;
      while(i<=playerCards.size()-3){
         //if this is first time see two same cards, just update the value and the index
         if(playerCards.get(i).getValue()>currentValue&&playerCards.get(i).getValue()==playerCards.get(i+1).getValue()&&playerCards.get(i).getValue()!=playerCards.get(i+2).getValue()&&value==0){
            value = playerCards.get(i).getValue();
            index = i;
         }
         //if this is not the first time see two same cards, update if this time the value is smaller
         else{
            if(playerCards.get(i).getValue()>currentValue&&playerCards.get(i).getValue()==playerCards.get(i+1).getValue()&&playerCards.get(i).getValue()!=playerCards.get(i+2).getValue()&&value!=0&&playerCards.get(i).getValue()<value){
               value = playerCards.get(i).getValue();
               index = i;
            }
         }
         i++;
      }
      if(value==0){
         System.out.print(name+" does not have suitable two cards\n");
         return currentValue;
      }
      System.out.printf("%-22s%-40s%-40s\n",name,(playerCards.get(index)+" "+playerCards.get(index+1)),((playerCards.size()-2)+" cards left"));
      playerCards.remove(index);
      playerCards.remove(index);
      return value;
   }
   //play Three Card 
   public int playThreeCard(int currentValue){
      int value = 0;
      //check if this player has exactly three same cards
      int index = 0;
      int i=0;
      while(i<=playerCards.size()-4){
         //if this is first time see three same cards, just update the value and the index
         if(playerCards.get(i).getValue()>currentValue&&playerCards.get(i).getValue()==playerCards.get(i+1).getValue()&&playerCards.get(i).getValue()==playerCards.get(i+2).getValue()&&playerCards.get(i).getValue()!=playerCards.get(i+3).getValue()&&value==0){
            value = playerCards.get(i).getValue();
            index = i;
         }
         //if this is not the first time see three same cards, update if this time the value is smaller
         else{
            if(playerCards.get(i).getValue()>currentValue&&playerCards.get(i).getValue()==playerCards.get(i+1).getValue()&&playerCards.get(i).getValue()==playerCards.get(i+2).getValue()&&playerCards.get(i).getValue()!=playerCards.get(i+3).getValue()&&value!=0&&playerCards.get(i).getValue()<value){
               value = playerCards.get(i).getValue();
               index = i;
            }
         }
         i++;
      }
      if(value==0){
         System.out.print(name+" does not have suitable three cards\n");
         return currentValue;
      }
      System.out.printf("%-22s%-40s%-40s\n",name,(playerCards.get(index)+" "+playerCards.get(index+1)+" "+playerCards.get(index+2)),((playerCards.size()-3)+" cards left"));
      playerCards.remove(index);
      playerCards.remove(index);
      playerCards.remove(index);
      return value;
   }
   //play Four Card 
   public int playFourCard(int currentValue){
      int value = 0;
      //check if this player has exactly three same cards
      int index = 0;
      int i=0;
      while(i<=playerCards.size()-5){
         //if this is first time see four same cards, just update the value and the index
         if(playerCards.get(i).getValue()>currentValue&&playerCards.get(i).getValue()==playerCards.get(i+1).getValue()&&playerCards.get(i).getValue()==playerCards.get(i+2).getValue()&&playerCards.get(i).getValue()==playerCards.get(i+3).getValue()&&playerCards.get(i).getValue()!=playerCards.get(i+4).getValue()&&value==0){
            value = playerCards.get(i).getValue();
            index = i;
         }
         //if this is not the first time see four same cards, update if this time the value is smaller
         else{
            if(playerCards.get(i).getValue()>currentValue&&playerCards.get(i).getValue()==playerCards.get(i+1).getValue()&&playerCards.get(i).getValue()==playerCards.get(i+2).getValue()&&playerCards.get(i).getValue()==playerCards.get(i+3).getValue()&&playerCards.get(i).getValue()!=playerCards.get(i+4).getValue()&&value!=0&&playerCards.get(i).getValue()<value){
               value = playerCards.get(i).getValue();
               index = i;
            }
         }
         i++;
      }
      if(value==0){
         System.out.print(name+" does not have suitable four cards\n");
         return currentValue;
      }
      System.out.printf("%-22s%-40s%-40s\n",name,(playerCards.get(index)+" "+playerCards.get(index+1)+" "+playerCards.get(index+2)+" "+playerCards.get(index+3)),((playerCards.size()-4)+" cards left"));
      playerCards.remove(index);
      playerCards.remove(index);
      playerCards.remove(index);
      playerCards.remove(index);
      return value;
   }
}