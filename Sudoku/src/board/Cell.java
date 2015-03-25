package board;

public class Cell {
	private char type;
	
	public Cell(char c){
		if(c==' '){
			c='.';
		}
		type = c;
	}
	
	public boolean isEmpty(){
		return type == '.';
	}
	
	public int getNumber(){
		return Integer.valueOf(type);
	}
}
