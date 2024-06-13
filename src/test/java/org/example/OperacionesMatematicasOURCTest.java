package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesMatematicasOURCTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
    OperacionesMatematicasOURC op = new OperacionesMatematicasOURC();

    @Test
    public void testCalcularRaizCuadrada(){

        assertEquals(5, op.raiz(25));

        assertEquals(0.0,op.raiz(0.0), 0.0001);


        assertThrows(IllegalArgumentException.class, () ->{
            op.raiz(-1.0);
        });

    }



}