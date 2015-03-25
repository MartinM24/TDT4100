package patterns.observable;

import java.util.Scanner;

public class HighscoreListProgram implements HighscoreListListener{

	HighscoreList score;
	
	public void init(){
		score = new HighscoreList(5);
		score.addHighscoreListListener(this);
	}
	
	public void run(){
		Scanner sc = new Scanner(System.in);
		int res;
		do{
			res = sc.nextInt();
			score.addResult(res);
		}while(res!=-1);
		sc.close();
	}
	
	@Override
	public void listChanged(HighscoreList scoreList, int i) {
		System.out.println(scoreList);
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		HighscoreListProgram prog = new HighscoreListProgram();
		prog.init();
		prog.run();
	}
}
