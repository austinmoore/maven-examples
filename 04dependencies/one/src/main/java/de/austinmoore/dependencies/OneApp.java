package de.austinmoore.dependencies;

import org.springframework.core.io.FileSystemResource;
import org.springframework.aop.config.AdviceEntry;

/**
 */
public class OneApp
{
    private FileSystemResource fileSystemResource;  // dependency to spring core
    private AdviceEntry adviceEntry; // dependency to spring aop


    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
