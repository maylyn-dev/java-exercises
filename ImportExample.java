import java.util.Random; // import tells us where to find random
public class ImportExample {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt(20)); // print a number between 0 and 9
	}
}
