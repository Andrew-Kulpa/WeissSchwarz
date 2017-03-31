/*
class Deck
	# Vars
		Private CardList DeckCardList
	# Methods
		Protected Card PopCard(Card card):
			# remove and return the top card in the deck
				# Remove DeckCardList[0]
				# Return this card
		end
		Protected void Refresh(Cardlist WRCards):
			# perform the "refresh" of waiting room cards into the deck
				# Shuffle WRCards
				# DeckCardList = WRCards
		end
end
*/
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
 * @author user
 */
public class Deck {
    ArrayList<Card> deck = new ArrayList<Card> ();
    public Deck(){
        for(int i = 1; i < 50; i++){
            this.deck.add(new Card(i,"place_holder_type", 0, "place_holder_icon", "Deck"));
        }
    }

    public void printAllCards(){
        for (Card card : deck){
            System.out.println(card);
        }
    }
    
    public void shuffle(){
        Collections.shuffle(deck);
    }
    
    protected Card pop(){
        Card card =  deck.get(0);
        deck.remove(0);
        return card;
    }
}
