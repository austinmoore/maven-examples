package de.austinmoore;

import java.util.List;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> list = Arrays.asList("Hello", "World");
        for (String greeting: list) {
            System.out.println( greeting );
        }
    }
}
