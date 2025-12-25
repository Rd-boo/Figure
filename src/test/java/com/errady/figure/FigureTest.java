package com.errady.figure;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FigureTest {

    @Test
    void non_triangle(){
        Figure fg = new Figure(4,2,1);
        assertEquals("N'est pas Triangle", fg.getTypeTriangle());
    }

    @Test
    void triangle_equilateral(){
        Figure fg = new Figure(4,4,4);
        assertEquals("Triangle Equilateral", fg.getTypeTriangle());
    }

    @Test
    void triangle_isocele(){
        Figure fg = new Figure(2,2,1);
        assertEquals("Triangle Isocele", fg.getTypeTriangle());
    }

    @Test
    void triangle_scalene(){
        Figure fg = new Figure(6,7,8);
        assertEquals("Triangle Scalene", fg.getTypeTriangle());
    }

}