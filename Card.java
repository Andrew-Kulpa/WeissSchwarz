/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

/**
 *
 * @author Andrew Kulpa
 */
public class Card {
    private int cardValue;
    private String cardType;
    private int level;
  	private String icon;
  	private String currentPosition;
    
    public Card (int cardValue, String cardType, int level, String icon, String currentPosition){
        this.cardValue = cardValue;
        this.cardType = cardType;
	this.level = level;
	this.icon = icon;
	this.currentPosition = currentPosition;
    }
    
    public int getCardValue(){
        return this.cardValue;
    }
    
    public String getCardType(){
        return this.cardType;
    }
    
    public int getLevel(){
		return this.level;
    }
  	
  	public String getCurrentPosition(){
        return this.currentPosition;
    }
  	
    public int getIcon(){
		return this.icon;
    }
    
  	/*
    public String toString(){
        return this.suit + " :: " + this.faceValue;
    }
    
    public String getImage(){
        String imageName = "";
        if(this.faceValue < 11 && this.faceValue > 1){
            return this.faceValue + this.suit;
        }
        else if(this.faceValue == 1){
            return "Ace" + this.suit;
            //Ace
        }
        else if(this.faceValue == 11){
            return "Jack" + this.suit;
            //Jack
        }
        else if (this.faceValue == 12){
            return "Queen" + this.suit;
            //Queen
        }
        else if (this.faceValue == 13){
            return "King" + this.suit;
            //King
        }
        return imageName;
    }
    */
}
