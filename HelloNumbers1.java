public class HelloNumbers1 {
    public static void main(String[] args) {
        int x = 0;
		int sum = 0;
        while (x < 10) {
            sum = x + sum;
			System.out.print(sum + " ");
			x = x + 1;
        }
		System.out.print("\n");
		System.out.println(5 + "10");
		System.out.println(5 + 10);
    }
}
