public class triangle{
	public static void main(String[] args){
		int col = 0;
		int row = 0;
		int SIZE = 5;
		while (row < SIZE) {
			while (col <= row) {
				System.out.print("*");
				col++;			
			}
			row++;
			col = 0;
			System.out.print("\n");
		}
	}
}