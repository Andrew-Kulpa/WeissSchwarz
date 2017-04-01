

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;
import java.util.Collections;
import java.util.ArrayList;

/**
 *
 * @author Andrew
 */
public class Hand{
    ArrayList<Card> hand = new ArrayList<Card> ();
    public Hand(){
        
    }
    
    public void addCard(Card card){
      push(card); //Alternative function name for bridging
    }
    
    public void push(Card card){
        this.hand.add(card);
    }
    
    public int getCount(){
        return this.hand.size();
    }
    
    
    public Card removeCard(int index){
        Card card =  hand.get(index);
        hand.remove(index);
        return card;
    }
    
    //public Card[] mullAgain(void){
    
    //}
    
    public ArrayList getHand(){
      return hand;
    }
    
    /*
    Public Card[] MullAgain(void):
			# perform a mull again
				# pop cards
				# push cards to waiting room
				# pop same amount of cards from deck
				# push same amount of cards to hand
		end
		Public CardList GetPlayerHand(Player player):
			# return the players hand
				# for each card in players hand
					# push card to cardlist
				# return cardlist as a temp copy of the players hand
		end
    */
    /*
    public String getTopCardImageName(){
        Card card =  deck.get(getCount()-1);
        return card.getImage();
    }
    public int getTopCardValue(){
        Card card =  deck.get(getCount()-1);
        return card.getFaceValue();
    }
    */
}