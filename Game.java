/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;
import java.awt.event.*;
/**
 *
 * @author user
 */
public class Game {
    public static WeissSchwarzGameBoard game;
    public static EndGame end;
    protected Deck player1Deck = new Deck();
    protected Hand player1Hand = new Hand();
    protected Deck player2Deck = new Deck();
    protected Hand player2Hand = new Hand();
    protected String phase = "start";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game setup = new Game();
        setup.begin();
        
    }

    protected void begin(){
        game = new WeissSchwarzGameBoard();
        game.setVisible(true);
        phase = "start";
        DrawPhase();
        game.Player1DeckLabel.addMouseListener(new MouseAdapter()   {   
            public void mouseClicked(MouseEvent e)   
            {   
                // Skeleton code for adding listeners to each of the labels.
                // THEN: Labels appear how a normal card would, but have the
                //       same functionalities of a button.
            }   
        });
        game.startMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    //jButton3ActionPerformed(evt);
           }
        });
        game.endScreen.addMouseListener(new MouseAdapter()   {   
            public void mouseClicked(MouseEvent e)   
            {   
                   
                    endGame();
           }
        });
    }
    protected void endGame(){
        
        game.setVisible(false);
        end = new EndGame(true);
        end.setVisible(true);
        end.Yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                    game = new WeissSchwarzGameBoard();
                    game.setVisible(true);
                    end.setVisible(false);
                    begin();
           }
        });
    }
    //protected void initHandLabels(){
    //    player1HandLabels = {};
    //}
    protected void DrawPhase(){
        if(phase.equals("start")){
            player1Deck.shuffle();
            player2Deck.shuffle();
            for(int i = 0; i < 5; i++){
                player1Hand.push(player1Deck.pop());
                player2Hand.push(player2Deck.pop());
            }
            System.out.println("First Draw Phase has begun");
            updateHandCardLabels();
            //updateCardCounts();
            //updateDiscardPileImages();
        }
        else if (phase.equals("Player1DrawPhase")){
            //player 1 draws a card!
        }
        else if (phase.equals("Player2DrawPhase")){
            //player 2 draws a card!
        }
    }
    protected void updateHandCardLabels(){
        game.Player1HandCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource(player1Hand.getHand().get(0).toString())));
        game.Player1HandCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource(player1Hand.getHand().get(1).toString())));
        game.Player1HandCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource(player1Hand.getHand().get(2).toString())));
        game.Player1HandCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource(player1Hand.getHand().get(3).toString())));
        game.Player1HandCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource(player1Hand.getHand().get(4).toString())));
        game.Player2HandCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource(player2Hand.getHand().get(0).toString())));
        game.Player2HandCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource(player2Hand.getHand().get(1).toString())));
        game.Player2HandCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource(player2Hand.getHand().get(2).toString())));
        game.Player2HandCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource(player2Hand.getHand().get(3).toString())));
        game.Player2HandCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource(player2Hand.getHand().get(4).toString())));
    }
}
