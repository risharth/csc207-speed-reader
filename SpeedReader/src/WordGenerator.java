import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WordGenerator {
	
	private Scanner input;
	private int count;
	private int sCount;
	
	public WordGenerator(String filename) throws FileNotFoundException {
		input = new Scanner(new File(filename));
		count = 0;
		sCount = 0;
	}
	
	public boolean hasNext(){
		if (this.input.hasNext()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String next(){
		String current = this.input.next();
		int len = current.length();
		char [] inputarr = new char[len];			
		inputarr = current.toCharArray();
		if (inputarr[len-1] == '.' || inputarr[len-1] == '!' || inputarr[len-1] == '?'){
			this.sCount++;
			this.count++;
		}
		else{
			this.count++;
		}
		return current;
	}
	
	public int getWordCount(){
		return this.count;
	}
	
	public int getSentenceCount(){
		return this.sCount;
	}
	

   
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
