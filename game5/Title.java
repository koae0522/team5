import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{

    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
 
        super(1024, 1024, 1);
        World game = new Game();
        Greenfoot.setWorld( game );
        showText("sキーを押してスタート",600,600);
    }
    
    public void act()
{
    if( Greenfoot.isKeyDown( "s" )){
        
        World game = new Game();
        Greenfoot.setWorld( game );
    }
}
    
    
    
    
}


