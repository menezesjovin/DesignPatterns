abstract class Game {
   
   abstract void startPlay();
   abstract void endPlay();
   void initialize(){
 	  System.out.println("game is initialized"); 
   }
   //template method
   public final void play(){
	    initialize();
      //initialize the game
     

      //start game
      startPlay();

      //end game
      endPlay();
   }
}
 class Cricket extends Game {

	   @Override
	   void endPlay() {
	      System.out.println("Cricket Game Finished!");
	   }

	  

	   @Override
	   void startPlay() {
	      System.out.println("Cricket Game Started. Enjoy the game!");
	   }
	}
 class Football extends Game {

	   @Override
	   void endPlay() {
	      System.out.println("Football Game Finished!");
	   }

	  

	   @Override
	   void startPlay() {
	      System.out.println("Football Game Started. Enjoy the game!");
	   }
	}
class TemplateDesignpatternClass {
	   public static void main(String [] args) {

	      Game game = new Cricket();
	      game.play();
	      System.out.println();
	      game = new Football();
	      game.play();		
	   }
 }

