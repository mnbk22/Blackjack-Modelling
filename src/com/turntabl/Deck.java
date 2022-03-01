package com.turntabl;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        for (Card.Suit s : Card.Suit.values()){
            for (Card.Value v : Card.Value.values()){
                deck.add(new Card(s,v.getValue()));
            }
        }
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public Card draw(){
        return deck.remove(0);
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }
}
