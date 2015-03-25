package board;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Board {
	private Cell[][] cells;
	private Block[][] blocks;
	private int length;
	private int blockRow;
	private int blockColumn;
	private String preset;
	private char[] charSet;
	
	public Board(String preset) throws IllegalArgumentException{
		int stringLength = preset.length();
		if (Math.sqrt(stringLength)==(int)Math.sqrt(stringLength)){
			length = (int) Math.sqrt(stringLength);
		}
		else{
			throw new IllegalArgumentException();
		}
		if (length < 4){
			throw new IllegalArgumentException();
		}
		try{
			createBlocks();
		}
		catch(IllegalStateException e){
			throw new IllegalArgumentException();
		}
		blocks = new Block[blockRow][blockColumn];
		cells = new Cell[length][length];
		this.preset = preset;
		fillBoard();
	}
	
	private void fillBoard() {
		// TODO Auto-generated method stub
		
	}

	private void createBlocks() throws IllegalStateException{
		if(Math.sqrt(length)==(int)Math.sqrt(length)){
			blockRow = blockColumn = (int) Math.sqrt(length);
			return;
		}
		int[] blockSize = findBlockPairs();
		if (blockSize[0]==-1){
			throw new IllegalStateException();
		}
		else{
			blockRow = blockSize[1];
			blockColumn = blockSize[0];
		}
	}
	
	private int[] findBlockPairs(){
		int[] rInt = new int[2];
		rInt[0] = findHighestFactor();
		rInt[1] = length/rInt[0];
		return rInt;
	}
	
	private int findHighestFactor(){
		for (int i = (int)Math.sqrt(length)+1;i > 0; i--){
			if (length%i==0){
				return i;
			}
		}
		return -1;
	}
	
	private char findMostReccuringChar(){
		HashMap<Character,Integer> charFreq = new HashMap<Character,Integer>();
		for(char c: preset.toCharArray()){
			if(charFreq.containsKey(c)){
				charFreq.put(c, charFreq.get(c)+1);
			}
		}
		
		char c = preset.charAt(0);
		int maximum = charFreq.get(c);
		
		charFreq.
	}
	
	public String toString(){
		return "";
	}
}
