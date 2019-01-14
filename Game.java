/*CSCI 1101 - Project
  This is a class defines Game objects*/
public abstract class Game{
   /*a Game class has several players and a whole Deck of cards to play with
   however, it does not make sense to do not know how many players there are, so 
   I created this Game class as abstract. It will have concrete subclass with specific numbers of players*/
   public Game(){}
   public abstract void dealing();
   public abstract void updateTurn();
   public abstract boolean checkWin();
   public abstract int getActivePlayer();
   public abstract void playOneCardGame();
   public abstract void playTwoCardGame();
   public abstract void playThreeCardGame();
   public abstract void playFourCardGame();
   public abstract int firstPlay();
   public abstract void playGame();
}