package com.careerdevs;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
            System.out.println("Starting Game");

            String notUsed = "abccdefghijklmnopqrstuvwxyz";

            String[] words = new String[] { "computer", "mouse","screen","display","language"};

            String  randomWord = words [ (int) (Math.random() * words.length)];
            //Int gives value a whole number
            //math.random gives a number 0-
            //.length gives of array
        System.out.println("The word has " + randomWord.length() + " letters. ");

        char[] letters = new char[randomWord.length()];
        // char letter is where the user guessing are being stored


        for (int i = 0; i < letters.length; i++) {
                letters[i] = '.';

        }

            int lives = 3;

            Scanner scanner = new Scanner(System.in);

            while (lives > 0 ) {
                System.out.print("Lives: ");

                for (int i = 0; i < lives; i++){
                    System.out.print("O");
                }
                System.out.println();

                System.out.println("Input: ");

                String input = scanner.nextLine();

                char letter = input.charAt(0);


                boolean isGuessedCorrect =  false;

                for (int i = 0; i < randomWord.length(); i++)   {
                    char l = randomWord.charAt(i);

                    if (l == letter){
                        letters[i] = l;
                        isGuessedCorrect = true;
                    }
                // forloop seeing if any of the user guess adds up to random word length

                }
                if (!isGuessedCorrect) {
                    lives = lives --;
                //this if statement is stating if guess is wrong  take away a life (lives = lives - 1)
                }

             boolean isGameFinished = true;
             //boolean isGameFinished will end game

                System.out.print("word: ");

                for (int i = 0; i < letters.length; i++) {
                    if (letters[i] == '.') {
                        isGameFinished = false;
                        //print each letter
                        //if any '.' are left game is not finished
                    }
                    System.out.print(letters[i]);
                    //prints out correct guesses
                }

                System.out.println();

                notUsed = notUsed.replace(letter, '.');

                System.out.println("Not used: " + notUsed);


                System.out.println("---------");
                if (isGameFinished) {
                    System.out.println("You Won!");
                    break;
                //if finished print you won
                }
            }
            if (lives == 0 ){
                System.out.println("You lost! The word was: " + randomWord);
            // if no more lives print you lost and Word
            }
            System.out.println("Exiting Game");
    }
}


///live : o o o
//Input: x
//word:.ell.
//Not used: abcd. f ..
//-------------------