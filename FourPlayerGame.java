/*CSCI 1101 - Project
  This class defines four-player game objects*/
import java.util.LinkedList;
public class FourPlayerGame extends Game{
   //attributes
   private Player player1;
   private Player player2;
   private Player player3;
   private Player player4;
   private Deck wholeDeck;
   private int turn;
   private int currentValue;
   //constructor
   public FourPlayerGame(String name1,String name2,String name3,String name4,Deck newWholeDeck){
      super();
      player1 = new Player(name1);
      player2 = new Player(name2);
      player3 = new Player(name3);
      player4 = new Player(name4);
      //shallow copy
      wholeDeck = newWholeDeck;
      currentValue = 0;
      turn = 1;
   }
   //getters and setters
   public void setPlayer1(Player p){player1 = p;}
   public void setPlayer2(Player p){player2 = p;}
   public void setPlayer3(Player p){player3 = p;}
   public void setPlayer4(Player p){player4 = p;}
   public void setWholeDeck(Deck d){wholeDeck = d;}
   public Player getPlayer1(){return player1;}
   public Player getPlayer2(){return player2;}
   public Player getPlayer3(){return player3;}
   public Player getPlayer4(){return player4;}
   public Deck getWholeDeck(){return wholeDeck;}
   public int getTurn(){return turn;}
   //dealing method
   public void dealing(){
      //first shuffle the deck
      wholeDeck.shuffle();
      //dealing cards
      for(int i=0;i<(wholeDeck.getCards().size()/4);i++){
         player1.addCard(wholeDeck.getCards().get(i));
      }
      for(int i=(wholeDeck.getCards().size()/4);i<(wholeDeck.getCards().size()/2);i++){
         player2.addCard(wholeDeck.getCards().get(i));
      }
      for(int i=(wholeDeck.getCards().size()/2);i<((wholeDeck.getCards().size()/4)*3);i++){
         player3.addCard(wholeDeck.getCards().get(i));
      }
      for(int i=((wholeDeck.getCards().size()/4)*3);i<wholeDeck.getCards().size();i++){
         player4.addCard(wholeDeck.getCards().get(i));
      }
   }
   //update turns
   public void updateTurn(){
      if(turn == 1&&player2.getPlayerCards().size()!=0){
         turn = 2;
         System.out.print(player2.getName()+" turn\n");
      }
      else if(turn == 1&&player3.getPlayerCards().size()!=0){
         turn = 3;
         System.out.print(player3.getName()+" turn\n");
      }
      else if(turn == 1&&player4.getPlayerCards().size()!=0){
         turn = 4;
         System.out.print(player4.getName()+" turn\n");
      }
      else if(turn == 2&&player3.getPlayerCards().size()!=0){
         turn = 3;
         System.out.print(player3.getName()+" turn\n");
      }
      else if(turn == 2&&player4.getPlayerCards().size()!=0){
         turn = 4;
         System.out.print(player4.getName()+" turn\n");
      }
      else if(turn == 2&&player1.getPlayerCards().size()!=0){
         turn = 1;
         System.out.print(player1.getName()+" turn\n");
      }
      else if(turn == 3&&player4.getPlayerCards().size()!=0){
         turn = 4;
         System.out.print(player4.getName()+" turn\n");
      }
      else if(turn == 3&&player1.getPlayerCards().size()!=0){
         turn = 1;
         System.out.print(player1.getName()+" turn\n");
      }
      else if(turn == 3&&player2.getPlayerCards().size()!=0){
         turn = 2;
         System.out.print(player2.getName()+" turn\n");
      }
      else if(turn == 4&&player1.getPlayerCards().size()!=0){
         turn = 1;
         System.out.print(player1.getName()+" turn\n");
      }
      else if(turn == 4&&player2.getPlayerCards().size()!=0){
         turn = 2;
         System.out.print(player2.getName()+" turn\n");
      }
      else if(turn == 4&&player3.getPlayerCards().size()!=0){
         turn = 3;
         System.out.print(player3.getName()+" turn\n");
      }
   }
   //check if one team already win
   public boolean checkWin(){
      if(player1.getPlayerCards().size()==0&&player3.getPlayerCards().size()==0){
         return true;
      }
      else if(player2.getPlayerCards().size()==0&&player4.getPlayerCards().size()==0){
         return true;
      }
      return false;
   }
   //check how many active players are there right now(some player may already have no cards)
   public int getActivePlayer(){
      int activePlayer = 0;
      if(player1.getPlayerCards().size()!=0){
         activePlayer++;
      }
      if(player2.getPlayerCards().size()!=0){
         activePlayer++;
      }
      if(player3.getPlayerCards().size()!=0){
         activePlayer++;
      }
      if(player4.getPlayerCards().size()!=0){
         activePlayer++;
      }
      return activePlayer;
   }
   //playOneCardGame method
   public void playOneCardGame(){
      int value;
      int occur = 0;
      while(checkWin()==false&&occur != getActivePlayer()-1){
         updateTurn();
         if(turn == 1){
            value = player1.playOneCard(currentValue);
            if(value != currentValue){
               currentValue = value;
               occur = 0;
            }
            else{
               occur = occur + 1;
            }
         }
         else if(turn == 2){
            value = player2.playOneCard(currentValue);
            if(value != currentValue){
               currentValue = value;
               occur = 0;
            }
            else{
               occur = occur + 1;
            }
         }
         else if(turn == 3){
            value = player3.playOneCard(currentValue);
            if(value != currentValue){
               currentValue = value;
               occur = 0;
            }
            else{
               occur = occur + 1;
            }
         }
         else if(turn == 4){
            value = player4.playOneCard(currentValue);
            if(value != currentValue){
               currentValue = value;
               occur = 0;
            }
            else{
               occur = occur + 1;
            }
         }
      }
   }
   //play Two card game
   public void playTwoCardGame(){
      int value;
      int occur = 0;
      while(checkWin()==false&&occur != getActivePlayer()-1){
         updateTurn();
         if(turn == 1){
            value = player1.playTwoCard(currentValue);
            if(value != currentValue){
               currentValue = value;
               occur = 0;
            }
            else{
               occur = occur + 1;
            }
         }
         else if(turn == 2){
            value = player2.playTwoCard(currentValue);
            if(value != currentValue){
               currentValue = value;
               occur = 0;
            }
            else{
               occur = occur + 1;
            }
         }
         else if(turn == 3){
            value = player3.playTwoCard(currentValue);
            if(value != currentValue){
               currentValue = value;
               occur = 0;
            }
            else{
               occur = occur + 1;
            }
         }
         else if(turn == 4){
            value = player4.playTwoCard(currentValue);
            if(value != currentValue){
               currentValue = value;
               occur = 0;
            }
            else{
               occur = occur + 1;
            }
         }
      }
   }
   //play Three Card Game
   public void playThreeCardGame(){
      int value;
      int occur = 0;
      while(checkWin()==false&&occur != getActivePlayer()-1){
         updateTurn();
         if(turn == 1){
            value = player1.playThreeCard(currentValue);
            if(value != currentValue){
               currentValue = value;
               occur = 0;
            }
            else{
               occur = occur + 1;
            }
         }
         else if(turn == 2){
            value = player2.playThreeCard(currentValue);
            if(value != currentValue){
               currentValue = value;
               occur = 0;
            }
            else{
               occur = occur + 1;
            }
         }
         else if(turn == 3){
            value = player3.playThreeCard(currentValue);
            if(value != currentValue){
               currentValue = value;
               occur = 0;
            }
            else{
               occur = occur + 1;
            }
         }
         else if(turn == 4){
            value = player4.playThreeCard(currentValue);
            if(value != currentValue){
               currentValue = value;
               occur = 0;
            }
            else{
               occur = occur + 1;
            }
         }
      }
   }
   //play Four Card Game
   public void playFourCardGame(){
      int value;
      int occur = 0;
      while(checkWin()==false&&occur != getActivePlayer()-1){
         updateTurn();
         if(turn == 1){
            value = player1.playFourCard(currentValue);
            if(value != currentValue){
               currentValue = value;
               occur = 0;
            }
            else{
               occur = occur + 1;
            }
         }
         else if(turn == 2){
            value = player2.playFourCard(currentValue);
            if(value != currentValue){
               currentValue = value;
               occur = 0;
            }
            else{
               occur = occur + 1;
            }
         }
         else if(turn == 3){
            value = player3.playFourCard(currentValue);
            if(value != currentValue){
               currentValue = value;
               occur = 0;
            }
            else{
               occur = occur + 1;
            }
         }
         else if(turn == 4){
            value = player4.playFourCard(currentValue);
            if(value != currentValue){
               currentValue = value;
               occur = 0;
            }
            else{
               occur = occur + 1;
            }
         }
      }
   }
   //get first card of a round
   public int firstPlay(){
      int n = 0;
      if(turn == 1){
         int value;
         value = player1.playFourCard(0);
         if(value==0){
            value = player1.playThreeCard(0);
            if(value==0){
               value = player1.playTwoCard(0);
               if(value==0){
                  currentValue = player1.playOneCard(0);
                  n = 1;
               }
               else{
                  currentValue = value;
                  n = 2;
               }
            }
            else{
               currentValue = value;
               n = 3;            
            }
         }
         else{
            currentValue = value;
            n = 4;
         }
      }
      if(turn == 2){
         int value;
         value = player2.playFourCard(0);
         if(value==0){
            value = player2.playThreeCard(0);
            if(value==0){
               value = player2.playTwoCard(0);
               if(value==0){
                  currentValue = player2.playOneCard(0);
                  n = 1;
               }
               else{
                  currentValue = value;
                  n = 2;
               }
            }
            else{
               currentValue = value;
               n = 3;
            }
         }
         else{
            currentValue = value;
            n = 4;
         }
      }
      if(turn == 3){
         int value;
         value = player3.playFourCard(0);
         if(value==0){
            value = player3.playThreeCard(0);
            if(value==0){
               value = player3.playTwoCard(0);
               if(value==0){
                  currentValue = player3.playOneCard(0);
                  n = 1;
               }
               else{
                  currentValue = value;
                  n = 2;
               }
            }
            else{
               currentValue = value;
               n = 3;
            }
         }
         else{
            currentValue = value;
            n = 4;
         }
      }
      if(turn == 4){
         int value;
         value = player4.playFourCard(0);
         if(value==0){
            value = player4.playThreeCard(0);
            if(value==0){
               value = player4.playTwoCard(0);
               if(value==0){
                  currentValue = player4.playOneCard(0);
                  n = 1;
               }
               else{
                  currentValue = value;
                  n = 2;
               }
            }
            else{
               currentValue = value;
               n = 3;
            }
         }
         else{
            currentValue = value;
            n = 4;
         }
      }
      return n;
   }
   public LinkedList getPlayers(){
      LinkedList players = new LinkedList();
      players.add(player4.getName());
      players.add(player3.getName());
      players.add(player2.getName());
      players.add(player1.getName());
      if(player1.getPlayerCards().size()==0){ players.remove(player1.getName());}
      if(player2.getPlayerCards().size()==0){players.remove(player2.getName());}
      if(player3.getPlayerCards().size()==0){players.remove(player3.getName());}
      if(player4.getPlayerCards().size()==0){players.remove(player4.getName());}
   return players;
   }
      //actual game
   public void playGame(){
      //first determine how many cards the first player should play
      dealing();
      System.out.println("Game Begin");
      System.out.println("************************************ROUND**************************");
      System.out.println("Players: " + getPlayers());

      int numberOfCard = firstPlay();
      //then start the round, until winner exist or one player play card that others cannot conquer
      while(checkWin()==false){
         //updateTurn();
         if(numberOfCard==1){
            playOneCardGame();
         }
         else if(numberOfCard==2){
            playTwoCardGame();
         }
         else if(numberOfCard==3){
            playThreeCardGame();
         }
         else if(numberOfCard==4){
            playFourCardGame();
         }
         //after this round, check if the winner already exist or the occur is 3
         System.out.println("**********************************ROUNDEND*****************");
         if(checkWin()==false){
            /*at this point, someone put a card that all other active players cannot conquer, it is this person's turn again
              to decide how many cards to play if he still has cards at his hands. In the situation that he has no card left, 
              the next person will decide how many cards to play and new round begin and game continues, the updateTurn method
              will take care of all these*/
               System.out.println("************************************ROUND**************************");
               System.out.println("Players: " + getPlayers());

            updateTurn();
            numberOfCard = firstPlay();
         }
      }
      //at this point winners already exist
      if(player1.getPlayerCards().size()==0&&player3.getPlayerCards().size()==0){
         System.out.println(player1.getName()+", and "+player3.getName()+" wins, congratulations!");
    
      }
      else if(player2.getPlayerCards().size()==0&&player4.getPlayerCards().size()==0){
         System.out.println(player2.getName()+", and "+player4.getName()+" wins, congratulations!");
         
      }
   }
}