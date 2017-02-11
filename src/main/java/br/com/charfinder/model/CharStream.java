package br.com.charfinder.model;

public class CharStream implements Stream {

    private final char[] string;
    private int position = 0;

    public CharStream(String string) {
        this.string = string.toCharArray();
    }

    @Override
    public char getNext() {
        char charactere = string[position];
        position++;
        return charactere;
    }

    @Override
    public boolean hasNext() {
        return position < string.length;
    }
}
