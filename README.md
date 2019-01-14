# CSCI1101-Project---Card-Game
Introduction
  Our project is to write basic classes and methods that can be used for any general card games and extend those to one card game. We created a Card class, a Deck class with several specific classes representing different types of decks inherited from it. We created a Player class that has methods of adding cards, losing cards, and playing different numbers of cards. Then we created an abstract Game class with two concrete classes inherited from it, representing a two-player game and a four-player game. They each have methods for dealing cards, updating turns, checking winners, and playing a different number of cards. These classes and methods give freedom to design a lot of different card games. Programmers can use different combinations of those methods to create their own card games. 
  We then extend these to one specific automatic card game that supports four-player mode and two-player mode. Four players will split into two groups and play against each group while two players will play against each other. Players beat each other’s cards by playing the same number of cards but higher values. The player or group that runs out of cards first wins. 

Classes and Program Features in the code

Card Class: this class defines card objects
  Also, as we all know, in the real world, we can regard a deck of card as an object, and its suit and value can be seen as two important attributes, and what can be done on both of them are called operations. Therefore, we used Object-oriented programming approach, which organizes programs in a way that mirrors the real world. Besides, in OOP, objects can interact with each other to complete a task. This can be reflected when we create different cards with different suits and value.

Deck class, Canadian Deck class, Chinese Deck class, Special Deck class:
	The Deck class is the superclass of the other three. Different decks have different numbers of cards or different suits. They share a common public shuffle method in the superclass Deck. Each deck contains an arraylist of cards. Aggregation is used here. 

Player Class
	Each player has an arraylist of cards and a name. A player can lose a card, add a card, play one card, play two, three, or four cards. Because this is an automatic game, the logic is to play to smallest possible value card. 

Game class, FourPlayerGame Class, TwoPlayerGame Class
	Game class represents the actual game. Game class is a superclass for the other two. Game class is an abstract class because it does not specify the number of players, and it does not make sense to have a game with an undefined number of players. However, Game class provides a way to connect FourPlayerGame class and TwoPlayerGame class together. Aggregation is also used here. Each game has a number of player objects and a deck object represents a whole deck to play with. It also has instance variables for representing turns and the current value of the card on the table. It has methods for updating turns and checking for winners. Each game can play one card game, or two, three, or four card game, or combinations of these. Programmers can use those methods to create their own games. 
In FourPlayerGame class, a linkedlist is also used to store players’ names. The game shows the players’ names each round. If one player runs out of cards, his name will be removed from the linkedlist and will not show in next round.

We used those methods to create an automatic game. In this game, players can play one or multiple cards with the same value at a time. For example, if the previous player plays four cards, the next player has to play four of a kind but of higher value to beat the current cards on the table. If a player does not have cards that can beat the current cards on the table, the turn will pass to the next player. Each round ends when one player plays card(s) that all other players cannot beat, then a new round starts and this player gets to play first in this round and choose how many and what value cards to play. In four-player games, four players are split into two groups. In two-player games, players play against each other. The group or player who runs out of cards first wins. We used all our methods to implement this game, but programmers can use different combinations of methods we write to create their own games. 
	
GUIs were used in our project. We created figures representing faces of players, and will show them when the game is running. 
	
Reading files is also used in our program. We have two files, one for two-player game rules and the other one for four-player game rules. Rules will be read line by line and printed to the screen. 
	
