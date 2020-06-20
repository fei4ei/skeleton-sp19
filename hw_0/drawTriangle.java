public class drawTriangle{
	public static void drawTriangle(int N) {
		int col = 0;
		int row = 0;
		while (row < N) {
			while (col <= row) {
				System.out.print("*");
				col++;			
			}
			row++;
			col = 0;
			System.out.print("\n");
		}		
	}
	
	public static void main(String[] args){
		drawTriangle(10);
	}
}
