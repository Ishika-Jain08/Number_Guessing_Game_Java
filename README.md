# TITLE : InnvoateEd  Solutions Internship Task - Number_Guessing_Game_Java

**INTERN INFORMATION**  : 
Name : Ishika Jain
Email Id : ishikajian@gmail.com


**Number Guessing Game Documentation**

**Introduction:**
The Number Guessing Game is a simple console-based game where the player tries to guess a randomly generated number within a certain range. This documentation provides an overview of the game's functionality, how to play it, and details about the implementation in Java.

**Game Overview:**
- The game generates a random number within a specified range (e.g., between 1 and 100).
- The player is prompted to guess the number.
- After each guess, the game provides feedback indicating whether the guess is too high, too low, or correct.
- The game continues until the player guesses the correct number.
- Once the correct number is guessed, the game displays the number of attempts made and offers the option to play again.

**How to Play:**
1. Run the Java program containing the Number Guessing Game.
2. The game will prompt you to enter the range for the random number generation (e.g., minimum and maximum values).
3. Guess a number within the specified range.
4. The game will provide feedback on whether your guess is too high, too low, or correct.
5. Repeat steps 3 and 4 until you correctly guess the number.
6. Once the correct number is guessed, the game will display the number of attempts made and ask if you want to play again.

**Implementation Details:**
The Number Guessing Game can be implemented in Java using object-oriented programming principles. Here's a high-level overview of the implementation:

1. **Main Class (NumberGuessingGame):** This class contains the main method and is responsible for starting the game. It prompts the user to enter the range for the random number generation and initiates the game loop.

2. **Game Class:** This class represents the game logic. It generates a random number within the specified range, compares the player's guesses with the correct number, and provides feedback accordingly. It also keeps track of the number of attempts made by the player.

3. **Player Class:** This class represents the player. It may contain methods for taking input from the user (guessing a number) and interacting with the game.

4. **Input Validation:** Input validation is essential to ensure that the user enters valid input for the range and guesses. This can be implemented using try-catch blocks or other validation techniques to handle exceptions and ensure the program doesn't crash due to invalid input.

5. **Play Again Functionality:** After the game is completed, the program should prompt the user to play again. This can be implemented using a loop that continues until the user decides to quit the game.

**Conclusion:**
The Number Guessing Game is a fun and interactive way to practice programming concepts such as random number generation, user input, loops, and conditional statements in Java. By following the provided documentation and sample code, you can easily implement and play the game. Have fun guessing numbers!
