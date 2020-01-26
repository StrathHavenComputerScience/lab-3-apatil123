public class Lab3
{
  public static void testLightCandles1()
  {
    Robot.load("candles1.txt");
    Robot.setDelay(0.05);
    lightCandles();
  }
  
  public static void testLightCandles2()
  {
    Robot.load("candles2.txt");
    Robot.setDelay(0.05);
    lightCandles();
  }
    
  public static void lightCandles()
  {
    //insert instructions below
    Robot.turnLeft(); Robot.move(); Robot.move(); turnRight(); Robot.move(); turnRight();
    clearcolumn();
    clearcolumn();
    clearcolumn();
    clearcolumn();
    clearcolumn();
    clearcolumn();
    clearcolumn();
    clearcolumn();
    clearcolumn();
    clearcolumn();
    clearcolumn();
    clearcolumn();
    clearcolumn();
    clearcolumn();
    clearcolumn();
    clearcolumn();
    clearcolumn();
    clearcolumn();
    clearcolumn();
    clearcolumn();
  }
  public static void clearcolumn()
  {
      //pre: Robot is facing down on a column that possibly has a candle.  
      //post: Robot searches where to light the candle and ends up in the next column, facing down.
      if (Robot.frontIsClear())
      {
          Robot.move(); if (Robot.frontIsClear()) {Robot.turnLeft(); Robot.turnLeft(); Robot.move(); turnRight(); if (Robot.frontIsClear()) {Robot.move(); turnRight();}} else {Robot.makeDark(); Robot.turnLeft(); Robot.turnLeft(); Robot.move(); turnRight(); if (Robot.frontIsClear()) {Robot.move(); turnRight();}}
      }
      else
      {
          Robot.makeDark(); Robot.turnLeft(); if (Robot.frontIsClear()) {Robot.move(); turnRight();} 
      }
  }
  public static void turnRight()
  { 
    //pre: Robot is facing any direction
    //post: Robot if facing to the right of the original position
      Robot.turnLeft(); Robot.turnLeft(); Robot.turnLeft();
  }
  
  //Run this method to test completeRoom on map room1.txt
  public static void testCompleteRoom1()
  {
     Robot.load("room1.txt");
     Robot.setDelay(0.05);
     completeRoom();
  }
  
  //Run this method to test completeRoom on map room2.txt
  public static void testCompleteRoom2()
  {
    Robot.load("room2.txt");
    Robot.setDelay(0.05);
    completeRoom();
  }
  
  //Complete this method.  You will need to write additional helper methods.
  public static void completeRoom()
  {
    //insert instructions below
    checkleft();checkleft();checkleft();checkleft();checkleft();checkleft();
    checkleft();checkleft();checkleft();checkleft();checkleft();checkleft();
    checkleft();checkleft();checkleft();checkleft();checkleft();checkleft();
    checkleft();checkleft();
  }
  public static void checkleft()
  {
      //pre: Robot begins to the right of a wall or empty spot where a wall 
      //pre: belongs.
      //post: Robot ends in the next open spot, after filling in the wall.
      if (Robot.frontIsClear()){
      Robot.turnLeft();
      functionone();
    } 
    else 
    {
    Robot.turnLeft();
      if (Robot.frontIsClear()) {Robot.move(); if (Robot.onDark()) 
          {Robot.turnLeft(); Robot.turnLeft();Robot.move();Robot.turnLeft();
           if (Robot.frontIsClear()) {Robot.move();} else {turnRight();}} 
          else {Robot.makeDark();Robot.turnLeft(); Robot.turnLeft();
                Robot.move();Robot.turnLeft(); if (Robot.frontIsClear())
                {Robot.move();} else {turnRight();}}}
      else 
      {
          Robot.turnLeft();Robot.turnLeft();Robot.turnLeft(); 
          if (Robot.frontIsClear()) {Robot.move();} else {turnRight();}
      }
    } 
}
public static void functionone()
{if (Robot.frontIsClear()) {Robot.move(); if (Robot.onDark()) 
          {Robot.turnLeft(); Robot.turnLeft();Robot.move();Robot.turnLeft();
           if (Robot.frontIsClear()) {Robot.move();} else {turnRight();}} 
          else {Robot.makeDark();Robot.turnLeft(); Robot.turnLeft();
                Robot.move();Robot.turnLeft(); if (Robot.frontIsClear())
                {Robot.move();} else {turnRight();}}}
      else 
      {
          Robot.turnLeft();Robot.turnLeft();Robot.turnLeft(); 
          if (Robot.frontIsClear()) {Robot.move();} else {turnRight();}
      }
}
  
  //Run this method to test swapAll on map swap1.txt
  public static void testSwapAll1()
  {
    Robot.load("swap1.txt");
    Robot.setDelay(0.05);
    swapAll();
  }
  
  //Run this method to test swapAll on map swap2.txt
  public static void testSwapAll2()
  {
    Robot.load("swap2.txt");
    Robot.setDelay(0.05);
    swapAll();
  }

  //Complete this method.  You will need to write additional helper methods.
  public static void swapAll()
  {
    //insert instructions below
    rightp();Robot.move();rightp();Robot.move();rightp();Robot.move();rightp();Robot.move();rightp();
    Robot.move();rightp();Robot.move();rightp();Robot.move();rightp();Robot.move();rightp();
    Robot.move();rightp();
    
  }
  public static void rightp()
  {
      turnRight();Robot.move(); if(Robot.onDark()) 
      {Robot.makeLight();Robot.turnLeft();Robot.turnLeft();Robot.move();turnRight();rightr();}
      else {Robot.turnLeft();Robot.turnLeft();Robot.move();turnRight();leftp();}
  }
  public static void leftp()
  {
      Robot.turnLeft();Robot.move(); if(Robot.onDark())
      {Robot.makeLight();Robot.turnLeft();Robot.turnLeft();Robot.move();Robot.turnLeft();leftr();}
      else {Robot.turnLeft();Robot.turnLeft();Robot.move();Robot.turnLeft();}
  }
  public static void rightr()
  {
      Robot.turnLeft();Robot.move(); if(Robot.onDark())
      {Robot.turnLeft();Robot.turnLeft();Robot.move();Robot.turnLeft();turnRight();Robot.move();
      Robot.makeDark();Robot.turnLeft();Robot.turnLeft();Robot.move();turnRight();}
       else {Robot.makeDark();Robot.turnLeft();Robot.turnLeft();Robot.move();Robot.turnLeft();}
  }
  public static void leftr()
  {
      turnRight();Robot.move(); if(Robot.onDark()) 
      {Robot.turnLeft();Robot.turnLeft();Robot.move();turnRight();}
       else {Robot.makeDark();Robot.turnLeft();Robot.turnLeft();Robot.move();turnRight();}
  }
  
  //Don't run these. I will!
  public static void testLightCandles3()
  {
    Robot.load("candles3.txt");
    Robot.setDelay(0.05);
    lightCandles();
  }
  
  public static void testLightCandles4()
  {
    Robot.load("candles4.txt");
    Robot.setDelay(0.05);
    lightCandles();
  }
  public static void testCompleteRoom3()
  {
     Robot.load("room3.txt");
     Robot.setDelay(0.05);
     completeRoom();
  }
  
  public static void testCompleteRoom4()
  {
    Robot.load("room4.txt");
    Robot.setDelay(0.05);
    completeRoom();
  }
  
  public static void testSwapAll3()
  {
    Robot.load("swap3.txt");
    Robot.setDelay(0.05);
    swapAll();
  }
  
  //Run this method to test swapAll on map swap2.txt
  public static void testSwapAll4()
  {
    Robot.load("swap4.txt");
    Robot.setDelay(0.05);
    swapAll();
  }
}