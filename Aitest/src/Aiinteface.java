import java.util.Scanner;

public class Aiinteface {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Hello: ");
		String input = scanner.nextLine();
		/*String[] parts = input.split(" ");
		String part1 = parts[0];
		String part2 = parts[1];
		System.out.println(part1+"==="+part2);*/
		Aipattern ai = new Aipattern();
		ai.setInput(input);
		System.out.println(ai.getRespond());
	}
}
