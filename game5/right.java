import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class right here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class right extends World
{

    /**
     * Constructor for objects of class right.
     * 
     */
    public right()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1020, 1020, 1); 
        Greenfoot.playSound("clear.mp3");
        if( Greenfoot.isKeyDown( "s" )){
        World title = new Title();
        Greenfoot.setWorld( title );
    }
    }
}
