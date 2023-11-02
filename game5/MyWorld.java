import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
       Actor p1 = new player1();
       addObject(p1,100,200);
       p1.getImage().scale(150,100);
       Actor p2 = new player2();
       addObject(p2,500,200);
       p2.getImage().scale(150,100);
       
    }
}
