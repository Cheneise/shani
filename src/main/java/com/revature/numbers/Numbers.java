package com.revature.numbers;

import org.apache.log4j.Logger;


public class Numbers {
    private static final Logger LOGGER = Logger.getLogger(Numbers.class);
    /*
     * -> Stored in the stack
     * -> Only long double and float can have suffixes
     * -> yes you can use underscore to seperate big numbers
     * -> yes you can have hex syntax
     * -> upcasting is implicit
     * -> downcasting is explicit and you might lose precision
     *
     * -----------------------------------------------
     * -> This method is instance scope
     */
    public void primitives() {
        //1 Bit
        boolean bo = true;
        //8 bits
        byte b = 7;
        
        //16 Bit
        short s = 32767;
        
        //16 Bit unsigned
        char c = 65534;
        //c = -7; NO!
        c = '5';
        
        /*
         * 32
         *
         * All whole number literals are considered an int by the compiler
         */
        int i = Integer.MAX_VALUE;
        
        /*
         * 64 Bit
         *
         * Use the suffix to actually make it a long directly
         */
        long l = 28L;
        //l = 2_147; No
        l = 2_247L;
        
        /*
         * 32 Bit floating point
         *
         */
        float f = 5; // Yes it works with int
        //f=2.5; NO!
        //Use the suffix
        f = 2.5f;
        /*
         * 64 bit (use double all the time)
         */
        double d = 5.0;
        d = 5.0d; //Yes
        
        /*
         * Up-casting (implicit)
         */
        i = b;
        i = (int) s; // redundant
        
        /*
         * down casting (explicit)
         */
        i = 32768;
        s = (short) i;
        LOGGER.info(s);
        
        
        //same level casting is okay - not the other way around
        f=i;
    }
    /*
     * -> Wrapper classes are immutable (they are final, and the value they hold is also final)
     *
     */
    
    public void wrappers() {
        //The only ones that change the name
        Integer i = 5;
        Character c = '5';
        
        //Everything else
        Boolean bo = true;
        
        /*
         * Auto-boxing
         *
         * equivalent i = new Integer(7)
         */
        i = 7;
        
        /*
         * Un-boxing
         *
         * equivalent: int primitive = i.<primitive>Value();
         */
        int primitive = i;
        primitive = new Integer(7);
        /*
         * Useful methods
         */
        
        //Changing between primitives without casting (more object oriented)
        byte b = i.byteValue();
        short s = i.shortValue();
        
        //Constructors (OCA)
        bo = new Boolean("TRue");
        LOGGER.info(bo);
        
        //Static methods or fields
        Integer.parseInt("545");
        LOGGER.info(Integer.MAX_VALUE);
        
        //Use operators between primitives and wrappers
        LOGGER.info(7+ new Integer(8));
        
        //OCA
        LOGGER.info(5+5+"Hello");
        LOGGER.info(5+"Hello"+5+7);
    }
    
    
    /*
     * Static scope
     */
    public static void main(String[] args) {
        
        //Remember the bare-minimum of instantiation
        //new Numbers().primitives();
        
        //Here is where you see the value of a reference
        Numbers numbers = new Numbers();
        numbers.primitives();
        numbers.wrappers();
    }

}