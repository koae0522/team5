import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{

    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 1000, 1); 
        Actor p1 = new player1();
       addObject(p1,300,700);
       p1.getImage().scale(270,200);
       Actor p2 = new player2();
       addObject(p2,700,700);
       p2.getImage().scale(270,200);
    }
}
