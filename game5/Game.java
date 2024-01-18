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
       boolean inGame=false;
       boolean result=false;
       GreenfootSound bgm = null;
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super(1000, 1000, 1); 

       addObject(p1,300,700);
       p1.getImage().scale(270,200);
       addObject(p2,700,700);
       p2.getImage().scale(270,200);
       //Greenfoot.playSound("pahupahu.mp3");
        bgm = new GreenfootSound( "bgm.mp3" );
    }
     
    public void act()
    {
      
      int delayTime= Greenfoot.getRandomNumber(600);
       bgm.playLoop();
      if(!inGame){
      Greenfoot.delay(delayTime);
    }
      addObject(bikkuri, 500, 300 );
      bgm.stop();
      inGame=true;
      
      if( inGame &&!result){
        if(Greenfoot.isKeyDown( "a" )){
            //1Pのか
           Greenfoot.playSound("katana.mp3");
           inGame=false;
           result=true;
           World left = new left();
           Greenfoot.delay(300);
           Greenfoot.setWorld(left);
           
        }else if(Greenfoot.isKeyDown("l")){
           Greenfoot.playSound("katana.mp3");
           inGame=false;
           result=true;
           World right = new right();
           Greenfoot.delay(300);
           Greenfoot.setWorld(right);
        }
        
    }
    
    
    }
    
   
}
