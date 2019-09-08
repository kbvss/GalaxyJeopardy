import java.io.File;
import java.util.ArrayList;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;



//=============================================  Part of our advanced features that could not get fully implemented  =================================================





/*===========================================================================================
 * This package was created so we could play background music by creating an actual player
 * ==========================================================================================
 */

public class Music implements Runnable {

	/*===================================================
	 * Creating the music player
	 * ==================================================
	 */

	private ArrayList<String> mFiles; //mFiles is the PlayList
	private int currentSong;         // a controlling variable which will be 0 be default
	//constructor
	public Music(String... files) {
		mFiles = new ArrayList<String>();
		for(String file : files)
			mFiles.add("./resources/audio/" + file + ".wav"); // .wav is the type of file we use for the music 
		
		
	}
	
	/*==============================================
	 * This method plays the sound !
	 * =============================================
	 */
	   //Reference for us: theFormat, theinfo, and volume are variable names
	
		private  void playSound(String fileName) {
			try {
				File soundFile = new File(fileName);
				AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile); //Audio stream (which is an object) allows us to get the audio format
				AudioFormat theformat = ais.getFormat();	 //This allow us to the audio information
				DataLine.Info theinfo = new DataLine.Info(Clip.class, theformat);
				Clip clip = (Clip) AudioSystem.getLine(theinfo);
				clip.open(ais); 

				
				
//Changing the volume here ================================================
				FloatControl volume = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
				volume.setValue(-10); //This lowers the volume by 10
				clip.start(); //this is how we start the sound
				
				
				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
			
	/*=============================================================
	 * This is the method with the loop for the background music 
	 * ============================================================
	  */ 
		
		@Override
		public void run() {
			playSound(mFiles.get(currentSong)); //this is the first song 
			
			
			
			
			
			
			
			
			
		
	}
	
	

}
