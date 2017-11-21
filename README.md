# DeckOfCardsAssignment
Deck of Cards

52 cards with:

      ● 4 suits: hearts , spades , clubs , diamonds
      
      ● Face values of: Ace , 2-10 , Jack , Queen , and King ).
      
Within one of your classes, you must provide two operations:

shuffle() - shuffle returns no value, but results in the cards in the deck being randomly
permuted

dealOneCard() - returns one card from the deck to the caller. Specifically, a call to
shuffle() followed by 52 calls to dealOneCard() should result in the caller being provided
all 52 cards of the deck in a random order. If the caller then makes a 53rd call
dealOneCard(), no card is dealt.

This is a sample program which deals with Deck of Cards.

Instruction: Go to folder DeckOfCards/src and run the following commands.

run javac Main.java 

run java Main

The following menu will pop out and user can choose between 1-3.

Please choose one of the actions:

1. Shuffle the deck
2. Deal with a card
3. Quit

Action 1: Shuffle current remaining cards on the deck.

Action 2: Deal one card each time, if user chose deal a card before shuffle cards, the cards will be dealed in increasing rank order. If user chose deal a card after shuffle, the cards will be dealt in shuffled order.

Action 3: Quit card game.


