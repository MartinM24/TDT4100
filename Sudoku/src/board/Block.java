package board;

public class Block {
	private Cell[][] cells;
	private int row;
	private int column;
	
	public Block(int row, int column, Cell[] presetCells){
		this.row = row;
		this.column = column;
		cells = new Cell[this.row][this.column];
		
	}
	
	public boolean isCorrect(){
		int[] test = new int[row*column];
		for(int i = 0; i < test.length ; i++){
			test[i] = 1;
		}
		for(int i = 0 ; i < row ; i++){
			for(int j = 0; j < column;j++){
				if (cells[i][j].isEmpty()){
					return false;
				}
				else if (test[cells[i][j].getNumber()]!=1){
					return false;
				}
				else{
					test[cells[i][j].getNumber()] = 0;
				}
			}
		}
		return true;
	}
	
	public void set(int row, int column, Cell cell){
		cells[row][column] = cell;
	}
	
	
}
