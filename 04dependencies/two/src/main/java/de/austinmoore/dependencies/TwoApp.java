package de.austinmoore.dependencies;

import org.springframework.core.io.FileSystemResource;

/**
 */
public class TwoApp 
{
    private FileSystemResource fileSystemResource;  // dependency to spring core

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
