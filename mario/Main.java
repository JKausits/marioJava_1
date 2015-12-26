package mario;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		StringBuilder row = new StringBuilder();
		int height;
		
		
		do{
			height = getPyramidHeight();
		}while (height<=0 || height >=23);
		
		//initialize the first row
		for(int i = 0; i < height-1; i++){
			row.append(" ");
		}
		row.append("##");
		
		//removes one space from the front, and adds one hash to the end
		while(height>0){
			System.out.println(row);
			row.delete(0, 1);
			row.append("#");
			height -=1;
		}

	}
	
	//gets the users input for the height of the pyramid
	private static int getPyramidHeight(){
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the number of rows(0-23)?");
		int n = userInput.nextInt();
		userInput.close();
		return n;
	}

}
