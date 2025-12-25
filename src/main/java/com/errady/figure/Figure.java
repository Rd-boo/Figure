package com.errady.figure;

public class Figure {
    private int c1;
    private int c2;
    private int c3;

    public Figure(int c1, int c2, int c3){
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    public int getCote1() {
        return this.c1;
    }

    public int getCote2() {
        return this.c2;
    }

    public int getCote3() {
        return this.c3;
    }

    public String getTypeTriangle(){ return null; }

}
