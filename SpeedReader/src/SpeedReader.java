import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



 public class SpeedReader {

//arguments used in testing: wikitest.txt 500 400 25 500	
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		if(!(args.length == 5)) {
			System.out.println("Incorrect number of arguments for SpeedReader, Program Terminated");
			return;
		}
		
		String filename = args[0];
		int width = Integer.parseInt(args[1]);
		int height = Integer.parseInt(args[2]);
		int fontSize = Integer.parseInt(args[3]);
		int WPM = Integer.parseInt(args[4]);
		
		
		 DrawingPanel canvas = new DrawingPanel(width, height);
		    Graphics nvidia = canvas.getGraphics();
		    Font custom = new Font("Courier", Font.BOLD, fontSize);
		    nvidia.setFont(custom);
		    
		    
		    WordGenerator steve = new WordGenerator(filename);
		    
		    while (steve.hasNext()) {
		    nvidia.setColor(Color.black);
		    nvidia.drawString(steve.next(), 100, 100);
		    Thread.sleep(60000/WPM);
		    nvidia.setColor(Color.white);
		    nvidia.fillRect(0, 0, width, height);
		    }
		    
		    System.out.println("Words processed = "+steve.getWordCount()+"\nSentences processed = "+steve.getSentenceCount());
		    
	}
	
}
		
	
