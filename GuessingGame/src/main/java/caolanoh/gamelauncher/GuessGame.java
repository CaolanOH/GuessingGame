/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caolanoh.gamelauncher;

/**
 *
 * @author caolanohagan
 */
public class GuessGame {
    // Three instance variables for the three Player objects
    Player p1;
    Player p2;
    Player p3;
    
    public void startGame(){
        // Three player objects are assigned to the three instance variables
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        
        // Three variables to hold the three guesses the Players make
        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;
        
        // Three variables to hold a true or false based on the players answer
        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;
        
        // Make a target number that the players have to guess
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");
        
        
        while(true) {
            System.out.println("Number to guess is "+targetNumber + " (Players cannot see this)");
            
            // Call each players guess method
            p1.guess();
            p2.guess();
            p3.guess();
            
            // Get each player's guess, the result of the guess() method is stored in the number variable of each player 
            guessP1 = p1.number;
            System.out.println("Player one guessed " +guessP1);
            guessP2 = p2.number;
            System.out.println("Player two guessed " +guessP2);
            guessP3 = p3.number;
            System.out.println("Player three guessed " +guessP3);
            
            
            // Check each player's guess to see if it mathced the target number. If the player is right then set 
            if(guessP1 == targetNumber){
                p1IsRight = true;
            }
            if(guessP2 == targetNumber){
                p2IsRight = true;
            }
            if(guessP3 == targetNumber){
                p2IsRight = true;
            }
            
            // if player one OR two OR three is right
            if(p1IsRight || p2IsRight || p3IsRight){
                System.out.println("We have a winner!");
                System.out.println("Player one got it right?" + p1IsRight);
                System.out.println("Player two got it right?" + p2IsRight);
                System.out.println("Player three got it right?" + p3IsRight);
                System.out.println("GameOver.");
                break;
            } else {
                System.out.println("Players will have to try again");
            }
        }
    }
    
}
