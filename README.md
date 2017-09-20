# dicegame
Simulate a fun dice game in Java - Fives Alive!

Let me describe a simple game for you. Start with any number of dice.
The goal is to have each 6-sided die showing the number 5.
You begin by rolling all the dice. If they are all 5's, you win!
If you roll atleast one 6, you stay alive! 6's allow you to reroll all dice that are not 5's.
For every 6 you roll, one reroll is banked.
The game ends in a loss if none of the dice are 6's and you are out of rerolls. 

What is the probability of winning the game if it is played with a single die?
Call the probability of winning p.
If a 1,2,3, or 4 is rolled, you lose. Let's call these four bad results collectively as X. (4/6 probability)
If a 5 is rolled, you win! (1/6 probability)
If a 6 is rolled, you are allowed to roll again. 
  That means there is a 1/6 probability to have probability to win of p.
This gives an equation for p: p=1/6+p*1/6
The solution is p=1/5.
Hence, this is like rolling a 5-sided die. Rolling a 6 is a null outcome.

What is the probability of winning the game if it is played with two dice?
There is a 1/36 probability of winning outright by rolling (5,5),
  and a 24/36 probability of losing altogether (X,X), (X,5).
There is a 8/36 probability of starting the game over (6,X), 
  and a 2/36 probability of this reducing to the single die game (6,5) since the 5 is not rerolled.
All of these results are understood at this point.  
But, there is a 1/36 chance of rolling (6,6)! Both dice are rerolled, and one reroll is banked for later.
We need to know, what is the probability of winning the game with 2 dice, and a banked reroll?
  We cannot go through all the outcomes by hand, because there will always be the possibility of rolling (6,6),
  and therefore restarting the game having two banked rerolls, etc.

We certainly cannot calculate by hand the probability of winning the game starting with N dice. 
But the game can easily be simulated and the probabilities found using Monte Carlo methods. 

Some questions to test your intuition:
  If I offered you 40-1 odds for you to win the game with 5 dice, would you take the bet?
  Is the probability of winning higher with 1 die, or 100?
  What number of dice gives the lowest probability of winning?
  
By simulating many games in Java we quickly find the answers to these questions. It's harder to win than you may think!
  
