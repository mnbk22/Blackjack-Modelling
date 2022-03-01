package com.turntabl;

import java.util.ArrayList;

public class Player {
    private String name;
    private int id ;
    private int score;
    private ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.id = id++;
        this.hand = new ArrayList<Card>();
    }

    public boolean getCardForHand(Card c){
         return hand.add(c);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }
}
