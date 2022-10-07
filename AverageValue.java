import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AverageValue {

	public static void main(String[] args) {
		int elementNumber = 1;
		System.out.println("--- Average Value ---");
		List<Integer> list = new ArrayList<>();
		try (Scanner scanner = new Scanner(System.in)) {
			try {
				System.out.println("Number of list elements: ");
				elementNumber = scanner.nextInt();
				for (int i = 0; i < elementNumber; i++) {
					System.out.println(i + 1 + ". element: ");
					list.add(scanner.nextInt());
				}
			} catch (InputMismatchException e) {
				System.out.println("Not a number!");
			}
		}
		System.out.println("List average: " + listAverage(list));
	}

	public static Double listAverage(List<Integer> list) {
		return list.stream().mapToInt(element -> element).average().getAsDouble();
	}

}
