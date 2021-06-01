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
public class Player {
    // This will hold the players guess
    int number = 0; 
    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("I'm guesing "+number);
    }
}
