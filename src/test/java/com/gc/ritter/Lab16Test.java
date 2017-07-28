package com.gc.ritter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mark on 7/27/2017.
 */
public class Lab16Test {
    @Test
    public void isPrime() throws Exception {

        Lab16 lab16 = new Lab16();
        boolean expected = false;
        boolean actual = Lab16.isPrime(12);


        assertEquals("It's not prime", expected, actual);
    }
    @Test
    public void isPrime2() throws Exception {

        Lab16 lab16 = new Lab16();
        boolean expected = true;
        boolean actual = Lab16.isPrime(13);


        assertEquals("It's not prime", expected, actual);
    }
    @Test
    public void isPrime3() throws Exception {

        Lab16 lab16 = new Lab16();
        boolean expected = true;
        boolean actual = Lab16.isPrime(17);


        assertEquals("It's not prime", expected, actual);
    }

    @Test
    public void sequencePrime() throws Exception {
        Lab16 lab16 = new Lab16();
        int expected = 37;
        int actual = Lab16.sequencePrime(12);


        assertEquals("Not working", expected, actual);
    }
    @Test
    public void sequencePrime2() throws Exception {
        Lab16 lab16 = new Lab16();
        int expected = 5;
        int actual = Lab16.sequencePrime(3);


        assertEquals("Not working", expected, actual);
    }
    @Test
    public void sequencePrime3() throws Exception {
        Lab16 lab16 = new Lab16();
        int expected = 11;
        int actual = Lab16.sequencePrime(5);


        assertEquals("Not working", expected, actual);
    }


}