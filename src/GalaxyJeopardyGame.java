import java.awt.*;
//import java.io.File; // Import background image for the applet


	public class GalaxyJeopardyGame extends EasyApp
	{
	  
		private static final long serialVersionUID = 1L; 
		
		/*=============================================================
		 * The display of the game 
		 * ============================================================
		 */

	public static void main(String[] args)
	   {  new GalaxyJeopardyGame(); }
	   
	   Label lJeopardy = addLabel("Galaxy Jeopardy",60,30,300,60,this);  //===================================== THE NAME OF THE GAME =============   
	   Label lpoints = addLabel("Coins",500,50,50,30,this); //====The name of the points or team ======
	   TextField Totalpoints = addTextField("0",575,50,80,30,this);
	   
	   

	   //==================================================================  DISPLAY AND POSITIONING OF THE BUTTONS   =============================================
	   /*===============================
	    *First row of buttons!
	    * ==============================
	    */ 
	   Button Planets = addButton("Planets 100",50,100,200,50,this);//third number is button width
	   Button Constellations = addButton("Constellations 100",450,100,200,50,this);
	   Button Stars = addButton("Stars 100",250,100,200,50,this);
	   Button Moons = addButton("Moons 100",850,100,200,50,this);
	   Button GreekAstrology = addButton("Greek Astrology 100",650,100,200,50,this); //First number moves the button left or right
	   /*===============================
	    *PLANET Second column of buttons!
	    * ==============================
	    */ 
	   
	   Button Planets2 = addButton("Planets 200",50,150,200,50,this);
	   Button Planets3 = addButton("Planets 300",50,200,200,50,this); 
	   Button Planets4 = addButton("Planets 400",50,250,200,50,this); 
	   Button Planets5 = addButton("Planets 500",50,300,200,50,this); 
	   
	   /*============================================
	    * Stars Second column of buttons!
	    * ===========================================
	    */ 
	   Button Stars2 = addButton("Stars 200",250,150,200,50,this); //second number is the position
	   Button Stars3 = addButton("Stars 300",250,200,200,50,this); //second number moves it over to the right
	   Button Stars4 = addButton("Stars 400",250,250,200,50,this);
	   Button Stars5 = addButton("Stars 500",250,300,200,50,this);
	  
	   /*============================================
	    * Constellations Second row of buttons!
	    * ===========================================
	    */ 
	   Button Constellations2 = addButton("Constellations 200",450,150,200,50,this);
	   Button Constellations3 = addButton("Constellations 300",450,200,200,50,this);
	   Button Constellations4 = addButton("Constellations 400",450,250,200,50,this);
	   Button Constellations5 = addButton("Constellations 500",450,300,200,50,this);
	   
	   /*============================================
	    *Greek Astrology Second row of buttons!
	    * ===========================================
	    */ 
	   Button GreekAstrology2 = addButton("Greek Astrology 200",650,150,200,50,this);
	   Button GreekAstrology3 = addButton("Greek Astrology 300",650,200,200,50,this);
	   Button GreekAstrology4 = addButton("Greek Astrology 400",650,250,200,50,this);
	   Button GreekAstrology5 = addButton("Greek Astrology 500",650,300,200,50,this);
	   
	   
	   
	   /*============================================
	    * Moons Second row of buttons!
	    * ===========================================
	    */ 
	   Button Moons2 = addButton("Moons 200",850,150,200,50,this);
	   Button Moons3 = addButton("Moons 300",850,200,200,50,this);
	   Button Moons4 = addButton("Moons 400",850,250,200,50,this);
	   Button Moons5 = addButton("Moons 500",850,300,200,50,this);
	   
	   
	   
	   
	   
	   
	   //Play Again Button
	   Button bPlayAgain = addButton("Play again",450,400,200,50,this);
	   	
	   //First Teams points !!
	   double points = 0;
	 
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   /*===================================================================
		 * Change the Applet's appearance  (Constructor)
		 * =================================================================
		 */

	   public GalaxyJeopardyGame()  
	   {
		//Font, color and font sizes of buttons !!!
	      setSize(500,500);
	      setTitle("Galaxy Jeopardy ! - 2017 Kshara Bass, Jayla Johnson, Kevin Nichols ");
	      lJeopardy.setFont(new Font("Serif",1,36));
	      lJeopardy.setBackground(new Color(100,200,255)); // Set as Light blue 100, 200, 255
	      lJeopardy.setForeground(Color.white);
	      lpoints.setBackground(new Color(100,200,255)); // Set as light blue 100, 200, 255
	      setBackground(new Color(100,200,255));   // Set as light blue background 100,200,255 is light blue !
//The first row categories	      
	      Planets.setFont(new Font("Serif",1,16));
	      Moons.setFont(new Font("Serif",1,16));      
	      Stars.setFont(new Font("Serif",1,16));      
	      Constellations.setFont(new Font("Serif",1,16)); 
	      GreekAstrology.setFont(new Font ("Serif",1, 16));
//Below are are the column categories	     
	      Planets2.setFont(new Font("Serif",1,16));
	      Planets3.setFont(new Font("Serif",1,16));
	      Planets4.setFont(new Font("Serif",1,16));
	      Planets5.setFont(new Font("Serif",1,16));
	      Stars2.setFont(new Font("Serif",1,16));
	      Stars3.setFont(new Font("Serif",1,16));
	      Stars4.setFont(new Font("Serif",1,16));
	      Stars5.setFont(new Font("Serif",1,16));
	      Constellations2.setFont(new Font("Serif",1,16));
	      Constellations3.setFont(new Font("Serif",1,16));
	      Constellations4.setFont(new Font("Serif",1,16));
	      Constellations5.setFont(new Font("Serif",1,16));
	      GreekAstrology2.setFont(new Font ("Serif",1, 16));
	      GreekAstrology3.setFont(new Font ("Serif",1, 16));
	      GreekAstrology4.setFont(new Font ("Serif",1, 16));
	      GreekAstrology5.setFont(new Font ("Serif",1, 16));
	      Moons2.setFont(new Font("Serif",1,16));
	      Moons3.setFont(new Font("Serif",1,16));
	      Moons4.setFont(new Font("Serif",1,16));
	      Moons5.setFont(new Font("Serif",1,16));
	      
	      bPlayAgain.setFont(new Font("Serif",1,16));      
	      
	   }
	   
	   /*==================================================================
		 *	This code enables the questions to popup ad be answered !!
		 * ================================================================
		 */
	   
	   public void actions(Object source,String command)
	   {
	      if (source == Planets) {   
	    	  Planets(); 
	    	  }
	      
	      if (source == Constellations) {  
	    	  Constellations();   
	    	  }
	     
	      if (source == Stars) {  
	    	  Stars();  
	    	  }
	      
	      if (source == Moons) {  
	    	  Moons();  
	    	  }
	      
	      if (source == Constellations2) {
	    	  Constellations2();
	    	  }
	      
	      if (source == Constellations3) {  
	    	  Constellations3(); 
	    	  }
	      
	      if (source == Constellations4) {  
	    	  Constellations4(); 
	    	  }
	      
	      if (source == Constellations5) {  
	    	  Constellations5(); 
	    	  }
	      
	      if (source == Planets2) {  
	    	  Planets2(); 
	    	  }
	      
	      if (source == Planets3) {  
	    	  Planets3(); 
	    	  }
	      
	      if (source == Planets4) {
	    	  Planets4();
	    	  }
	      
	      if (source == Planets5) {
	    	  Planets5(); 
	    	  }
	      
	      if (source == Stars2) {
	    	  Stars2(); 
	    	  }
	      
	      if (source == Stars3) {
	    	  Stars3(); 
	    	  }
	      
	      if (source == Stars4) {
	    	  Stars4(); 
	    	  }
	      
	      if (source == Stars5) {
	    	  Stars5(); 
	    	  }
	      
	      if (source == GreekAstrology) {
	    	  GreekAstrology(); 
	    	  }
	      
	      if (source == GreekAstrology2) {
	    	  GreekAstrology2(); 
	    	  }
	      
	      if (source == GreekAstrology3) {
	    	  GreekAstrology3(); 
	    	  }
	      
	      if (source == GreekAstrology4) {
	    	  GreekAstrology4(); 
	    	  }
	      
	      if (source == GreekAstrology5) { 
	    	  GreekAstrology5(); 
	    	  }
	      if (source == Moons2) {  
	    	  Moons2(); 
	    	  }
	      
	      if (source == Moons3) {  
	    	  Moons3(); 
	    	  }
	      
	      if (source == Moons4) {
	    	  Moons4();
	    	  }
	      
	      if (source == Moons5) {
	    	  Moons5(); 
	    	  }
	      
	      
	      
	      if (source == bPlayAgain)
	      {  
	 	         
	    	
	    	  
	    	  
	//====================================================================================== ENABLE THE BUTTONS AFTER "PLAY AGAIN" IS PRESSED ==================================    	  
	    	  	//Enable rows
		    	 Planets.setEnabled(true);
		         Stars.setEnabled(true);
		         Constellations.setEnabled(true);
		         Moons.setEnabled(true);
		         
		       //Enable other planet categories at play again
		         Planets2.setEnabled(true);
		         Planets3.setEnabled(true);
		         Planets4.setEnabled(true);
		         Planets5.setEnabled(true);
		         
		       //Enable other Stars categories at play again
		         Stars2.setEnabled(true);
		         Stars3.setEnabled(true);
		         Stars4.setEnabled(true);
		         Stars5.setEnabled(true);
		         
		       //Enable other Constellations categories at play again
		         Constellations2.setEnabled(true);
		         Constellations3.setEnabled(true);
		         Constellations4.setEnabled(true);
		         Constellations5.setEnabled(true);
		         
		       //Enable other Constellations categories at play again
		         GreekAstrology.setEnabled(true);
		         GreekAstrology2.setEnabled(true);
		         GreekAstrology3.setEnabled(true);
		         GreekAstrology4.setEnabled(true);
		         GreekAstrology5.setEnabled(true);
		         
		       //Enable other Stars categories at play again
		         Moons2.setEnabled(true);
		         Moons3.setEnabled(true);
		         Moons4.setEnabled(true);
		         Moons5.setEnabled(true);
		         

		         points = 0;

		      }   

		      Totalpoints.setText(points + "");

		   }
	   

	 /*=============================
	  * ALL THE ROW Categories !!!!!
	  * ============================
	  */
	   
	    
	   public void GreekAstrology()  
	   {
	      String guess = inputString("What is the Greek god of Pluto? ");
	      if (guess.equals("Hades")) {
	         points = points + 100;
	         	output("Right !");  
	      }
	      else
	      {  
	         points = points - 100;         
	         	output("Try Again next round !" );
	      }      

	      GreekAstrology.setEnabled(false); //Note this .setenabled false means the button will deactivate after use 
	   }
	   
	   public void Constellations()
	   {
	      String guess = inputString("How many Constellations are there?");
	      if (
	          guess.equalsIgnoreCase("88")
	          || guess.equalsIgnoreCase("eighty-eight")
	          || guess.equalsIgnoreCase("eight eight")
	         )   
	      {
	         points = points + 100;
	         	output("Correct !!");  
	      }

	      else
	      {  
	         points = points - 100;         
	         	output("Try Again Next Round");
	      }      
	      Constellations.setEnabled(false);
	   }

	   public void Stars()
	   {
	      String guess = inputString("How far away is the sun from us?");
	      if (
		          guess.equalsIgnoreCase("93 Million Miles")
		          || guess.equalsIgnoreCase("93 Million")
		          || guess.equalsIgnoreCase("Ninety-three million miles")
		         )   
		      {
	         points = points + 100;
	         	output("Good Job !");  
	      }
	      else
	      {  
	         points = points - 100;         
	         	output("Try Again Next Round");
	      }      
	      Stars.setEnabled(false);
	   }
	   
	   public void Moons()
	   {
	      String guess = inputString("What does Earth's Moons do to the ocean?");
	      if (
	    		  guess.equalsIgnoreCase("Controls the tides")
	    		  ||  guess.equalsIgnoreCase("Controls the waves")
	    		  ||  guess.equalsIgnoreCase("Moves Tides")
	    		  ||  guess.equalsIgnoreCase("Moves Waves"))
	      {
	         points = points + 100;
	         	output("You got it !");  
	      }
	      else
	      {  
	         points = points - 100;         
	         	output("Try Again Next Round");
	      }      
	      Moons.setEnabled(false);
	   }
	   
	   
	   public void Planets()  
	   {
	      String guess = inputString("Which Planet is the Hottest? ");
	      if (guess.equals("Venus")) {
	         points = points + 100;
	         	output("You're on Fire !");  
	      }
	      else
	      {  
	         points = points - 100;         
	         	output("Try Again Next Round" );
	      }      

	      Planets.setEnabled(false);
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   //============== Planet Column ===================
	   
	   public void Planets2()   //====================================================== Planets 2 
	   {
	      String guess = inputString("Which planet has over 49 moons?"); 
	      if (guess.equals("Jupiter")) {
	         points = points + 200;
	         	output("Right!");  
	      }
	      else
	      {  
	         points = points - 200;         
	         	output("Try Again Next Round " );
	      }      
	      Planets2.setEnabled(false);
	   }
	   
	   
	   public void Planets3() //========================================================== Planets 3 
	   {
	      String guess = inputString("Name one of the planets that as 'Diamond Rain'"); 
	      if  
	      		(guess.equalsIgnoreCase("Jupiter")
		  		||  guess.equalsIgnoreCase("Saturn")) {
	         points = points + 300;
	         	output("Great !");  
	      }
	      else
	      {  
	         points = points - 300;         
	         	output("Try Again Next Round " );                  
	      }      
	      Planets3.setEnabled(false);
	}
	   
	   public void Planets4() //========================================================== Planets 4 
	   {
	      String guess = inputString("Which planet has the highest mountain and deepest valley in the Solar System?"); 
	      if (guess.equals("Mars")) {
	         points = points + 400;
	         	output("Correect!");  
	      }
	      else
	      {  
	         points = points - 400;         
	         	output("Try Again Next Round " );                  
	      }      
	      Planets4.setEnabled(false);
	}
	   
	   public void Planets5() //========================================================== Planets 5 
	   {
	      String guess = inputString("Which planet was named after the Greek god of war?"); 
	      if (guess.equals("Mars")) {
	         points = points + 500;
	         	output("Good Job !");  
	      }
	      else
	      {  
	         points = points - 500;         
	         	output("Try Again Next Round " );                  
	      }      
	      Planets5.setEnabled(false);
	}
	   
	   
	   
	   
	   
	   
	   
	   //========================= Stars column ========================
	   
	   public void Stars2() //========================================================== Stars2
	   {
	      String guess = inputString("What does a star turn into when its dying?"); 
	      if ( guess.equalsIgnoreCase("White Dwarf")
	    		  ||  guess.equalsIgnoreCase("white dwarf"))
	    		  {
	         points = points + 200;
	         	output("Right Again !");  
	      }
	      else
	      {  
	         points = points - 200;         
	         	output("Try Again Next Round " );                  
	      }      
	      Stars2.setEnabled(false);
	}
	   public void Stars3() //========================================================== Stars3
	   {
	      String guess = inputString("What does a star turn into after it goes supernova?"); 
	      if ( guess.equalsIgnoreCase("Black Hole")
	    		  ||  guess.equalsIgnoreCase("black hole")
	    		  ||  guess.equalsIgnoreCase("Blackhole")
	    		  ||  guess.equalsIgnoreCase("blackhole")) {
	         points = points + 300;
	         	output("Good !");  
	      }
	      else
	      {                                    
	         points = points - 300;         
	         	output("Try Again Next Round " );                  
	      }      
	      Stars3.setEnabled(false);
	}
	   public void Stars4() //========================================================== Stars4
	   {
	      String guess = inputString("What is the largest star in the known galaxy?"); 
	      if (guess.equals("Canis Major")) {
		         points = points + 300;
		         	output("Right!");  
	      {
	         points = points + 400;
	         	output("Yes !");  }
	      }
	      else
	      {  
	         points = points - 400;         
	         	output("Try Again Next Round " );                  
	      }      
	        Stars4.setEnabled(false);
	   }
	   
	   public void Stars5() //========================================================== Stars5
	   {
	      String guess = inputString("What is the most common type of star within the universe?"); 
	      if    (
	    		  guess.equalsIgnoreCase("Red Dwarves")
	    		  ||  guess.equalsIgnoreCase("Red Dwarf"))
	      {
	         points = points + 400;
	         	output("Good !");  
	      }
	      else
	      {  
	         points = points - 400;         
	         	output("Try Again Next Round " );                  
	      }      
	        Stars5.setEnabled(false);
	   }
	   
	   
	   
	   
	   
	   //===================== Constellations column ===================
	   public void  Constellations2() //========================================================== Constellations2
	   {
	      String guess = inputString("A commom constellation that comes in a pair?"); 
	      if (
	    		  guess.equalsIgnoreCase("Big Dipper Little Dipper")
	    		  ||  guess.equalsIgnoreCase(" The Big Dipper and The Little Dipper")
	    		  ||  guess.equalsIgnoreCase(" The Little Dipper and The Big Dipper")
	    		  ||  guess.equalsIgnoreCase("Little and Big Dipper")
	    		  ||  guess.equalsIgnoreCase("Big and Little Dipper")
	    		  ||  guess.equalsIgnoreCase("Big Dipper and Little Dipper")
	    		  ||  guess.equalsIgnoreCase("Little Dipper and Big Dipper")
	    		  ||  guess.equalsIgnoreCase("Little Dipper and Big Dipper")
	    		  ||  guess.equalsIgnoreCase("Little Dipper Big Dipper")
	    	  	  ||  guess.equalsIgnoreCase("The Dippers"))
	      {
	         points = points + 200;
	         	output("Amazing !");  
	      }
	      else
	      {                                   
	         points = points - 200;         
	         	output("Try Again Next Round " );                  
	      }      
	      Constellations2.setEnabled(false);
}
	   public void  Constellations3() //========================================================== Constellations3
	   {
	      String guess = inputString("What is the largest constellation in the night sky?"); 
	     
	      if (guess.equals("Hydra")) {
	         points = points + 300;
	         	output("Good !");  
	      }
	      else
	      {                                   
	         points = points - 300;         
	         	output("Try Again Next Round" );                  
	      }      
	      Constellations3.setEnabled(false);
	}
	   
	   public void  Constellations4() //========================================================== Constellations4
	   {
	      String guess = inputString("What constellation holds the Big Dipper? "); 
	     
	      if (guess.equals("Ursa Major")) {
	         points = points + 400;
	         	output("Correct!");  
	      } 
	      else
	      {                                   
	         points = points - 400;         
	         	output("Try Again Next Round " );                  
	      }      
	      Constellations4.setEnabled(false);
	}
	   public void  Constellations5() //========================================================== Constellations5
	   {
	      String guess = inputString("What constellation is represented as a man pouring water from a bucket?"); 
	     
	      if ( guess.equalsIgnoreCase("Aquarius")
	    		  ||  guess.equalsIgnoreCase("aquarius")) {
	         points = points + 500;
	         	output("Right!");  
	      }
	      else
	      {                                   
	         points = points - 500;         
	         output("Try Again Next Round " );                  
	      }      
	      Constellations5.setEnabled(false);
	      
	      }
	      
	   
	   
	
	   
	   
	   //===================================== Greek Astrology column 
	      public void GreekAstrology2() //======================================================== GreekAstrology2
		   {
		      String guess = inputString("Who is the Greek god of Earth? ");
		      if (guess.equals("Gaia")) {
		         points = points + 100;
		         	output("Correct !");  
		      }
		      else
		      {  
		         points = points - 100;         
		         	output("Try Again Next Round" );
		      }      

		      GreekAstrology2.setEnabled(false);
		   }
	      
	      
	      public void GreekAstrology3() //======================================================== GreekAstrology3
		   {
		      String guess = inputString("Who is the Greek god of Neptune? ");
		      if (guess.equals("Poseidon")) {
		         points = points + 100;
		         	output("Amazing !");  
		      }
		      else
		      {  
		         points = points - 100;         
		         	output("Try Again Next Round" );
		      }      

		      GreekAstrology3.setEnabled(false);
		   }
	      public void GreekAstrology4() //======================================================== GreekAstrology4
		   {
		      String guess = inputString("Who is the Greek god of Mercury? ");
		      if (guess.equals("Hermes")) {
		         points = points + 100;
		         	output("Correct !");  
		      }
		      else
		      {  
		         points = points - 100;         
		         	output("Try Again Next Round" );
		      }      

		      GreekAstrology4.setEnabled(false);
		   }
	      public void GreekAstrology5() //======================================================== GreekAstrology5
		   {
		      String guess = inputString("Who is the Greek god of Saturn? ");
		      if (guess.equals("Cronus")) {
		         points = points + 100;
		         	output("Right !");  
		      }
		      else
		      {  
		         points = points - 100;         
		         	output("Try Again Next Round" );
		      }      

		      GreekAstrology5.setEnabled(false);
		   }
	      
	      
	      
	      
	      
	      
	      public void Moons2() //====================================================================== Moons2
		   {
		      String guess = inputString("How many people have walked on the moon? ");
		      if (guess.equals("12")) {
		         points = points + 200;
		         	output("Good !");  
		      }
		      else
		      {  
		         points = points - 200;         
		         	output("Try Again Next Round" );
		      }      

		      Moons2.setEnabled(false);
		   }
	      
	      
	      public void Moons3() //====================================================================== Moons3
		   {
		      String guess = inputString("Can a moon have rings? ");
		      if ( guess.equalsIgnoreCase("Yes")
		    		  ||  guess.equalsIgnoreCase("yes")) {
		         points = points + 300;
		         	output("Correct !");  
		      }
		      else
		      {  
		         points = points - 300;         
		         	output("Try Again Next Round" );
		      }      

		      Moons3.setEnabled(false);
		   }
	      
	      public void Moons4() //===================================================================== Moons4
		   {
		      String guess = inputString("How fast does the moon rotate? ");
		      if (
		    		  guess.equalsIgnoreCase("10 miles per hour")
		    	  ||  guess.equalsIgnoreCase("10 mph")) {
		         points = points + 400;
		         	output("Great !");  
		      }
		      else
		      {  
		         points = points - 400;         
		         	output("Try Again Next Round" );
		      }      

		      Moons4.setEnabled(false);
		   }
	      
	      public void Moons5() //===================================================================== Moons5
		   {
		      String guess = inputString("Name one name given to the full moon of April? ");
		      if (
		    		  guess.equalsIgnoreCase("Pink")
		    		  ||  guess.equalsIgnoreCase("Grass")
		    		  ||  guess.equalsIgnoreCase("Egg")
		    		  ||  guess.equalsIgnoreCase("Fish")
		    		  ||  guess.equalsIgnoreCase("Pink Moon")
		    	  	  ||  guess.equalsIgnoreCase("Grass Moon")
		    	  	  ||  guess.equalsIgnoreCase("Egg Moon")
		    	  	  ||  guess.equalsIgnoreCase("Fish Moon")) {  
		    	    
		    	  points = points + 400;
		         	output("Correct !");  
		      }
		      else
		      {  
		         points = points - 500;         
		         	output("Try Again Next Round" );
		      }      

		      Moons5.setEnabled(false);
		   }
	      
	}		
	
	

