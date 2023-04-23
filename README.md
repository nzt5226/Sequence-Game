# Sequence Game

## Overview
This simple game generates a random sequence of five numbers in the terminal. The user is tasked with guessing the next number in the sequence.

My 2-minute descritpion video: https://youtu.be/bLSQWhbF2MI

## How to Play
Follow these steps to play!

>1. Study the sequence shown.
>2. Determine the next number in the sequence, then type it in the terminal.
>3. If you are correct, great job!
>4. If not, try again!

## Development
This code uses two classes ```SequenceGame.java``` and ```SequenceGeneratorHard.java```.

### SequenceGame.java
This class is the main class that collects the ```userGuess``` and runs it through the sequences in ```SequenceGeneratorHard.java``` to verify the guess.

### SequenceGeneratorHard.java
>Note: This class includes *Hard* in the name since the nature of the sequences generated are fairly difficult. Adjustments or additions could be made that include easier sequences.

This class contains the random number generators, the code that generates the random sequence, and the code that verifies the ```userGuess```. The main elements of this class are explained below:

#### Random Numbers
This code utilizes four individual number generators: one to randomly determine the types of operators that will be used on the sequence and three to determine the starting number and the values that will be operated with.
```java
int sequenceOperator = rand.nextInt(9);
```
This line generates a random number from 0 to 9 and saves it to the variable ```sequenceOperator``` which is then called in the ```sequence()``` function, which is a series of if/else if statements:
```java
if(sequenceOperator == 0) {
  . . .
}
else if(sequenceOperator == 1) {
  . . .
}
.
.
.
else if(sequenceOperator == 8) {
  . . .
}
```
The following lines determine the random values that are used in the sequence:
```java
int randomNumStart = rand.nextInt(9) + 2;     //Starting number greater than 1
int randomNumIterate1 = rand.nextInt(4) + 2;  //Value used for the first operation on the sequence greater than 1   
int randomNumIterate2 = rand.nextInt(4) + 2;  //Value used for the second operation on the sequence greater than 1
```

#### Sequence Generation
Based on the value of ```sequenceOperator```, one of nine possible operation combinations is performed on ```randomNumStart``` to generate the five term sequence:

>1. Add then Add
>2. Add then Subtract
>3. Add then Multiply
>4. Subtract then Add
>5. Subtract then Subtract
>6. Subtract then Multiply
>7. Multiply then Add
>8. Multiply then Subtract
>9. Multiply then Multiply

Each of these operation combinations uses ```randomNumIterate1``` as the value for the first operation and ```randomNumIterate2``` as the value for the second.

>*Example:*
>Add then Multiply-
>```randomNumIterate1 = 4``` and ```randomNumIterate2 = 2```.
>'4' will be added to the starting number, then that new quantity will be multiplied by '2'. This new quantity will have '4' added to it, and then multiplied by '2', and so on and so forth.

#### Verification
The ```userGuess``` value from ```SequenceGame.java``` is run through a chain of code very similar to the sequence generation code. After checking ```sequenceOperator```, the ```verify()``` function will calculate the sixth term in the sequence given the random values and the operations and compare it to ```userGuess```. If the values match, the code returns:
```java
"Correct!"
```
If the values do not match, the code returns:
```java
"Sorry, you're incorrect. Try another puzzle!"
```
