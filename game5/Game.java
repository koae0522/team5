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
     Actor bikkuri= new bikkuri();
      Actor p1 = new player1();
       Actor p2 = new player2();
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super(1000, 1000, 1); 

       addObject(p1,300,700);
       p1.getImage().scale(270,200);
       addObject(p2,700,700);
       p2.getImage().scale(270,200);
  
    }
     
    public void act()
    {
      int delayTime= Greenfoot.getRandomNumber(1000);
      Greenfoot.delay(delayTime);
      addObject(bikkuri, 500, 300 );
  
      boolean inGame=true;
      
      if( Greenfoot.isKeyDown( "a" )&& inGame ){
        if(!Greenfoot.isKeyDown( "l" )){
            //1Pのかち
           showText( "1Pの勝ち！", 0, 0 );
           inGame=false;
        }
    }
    if( Greenfoot.isKeyDown( "l" )&& inGame ){
        if(!Greenfoot.isKeyDown( "a" )){
            //2Pのかち
            showText( "2Pの勝ち！",0, 0 );
            inGame=false;
        }
    }
    
    }
    
   
}
