package com.example.spotitsim;

import java.util.ArrayList;

public class Card {
    private int numSymbols;
    private ArrayList<Integer> symbols = new ArrayList<>();

    public Card(int numSymbols, ArrayList<Integer> symbols) {
        this.numSymbols = numSymbols;
        this.symbols = symbols;
    }

    public int getNumSymbols() {
        return numSymbols;
    }

    public ArrayList<Integer> getSymbols() {
        return symbols;
    }

    public void setNumSymbols(int numSymbols) {
        this.numSymbols = numSymbols;
    }

    public void addSymbol(int symbol) {
        symbols.add(symbol);
    }
}
