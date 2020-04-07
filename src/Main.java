import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String [] args) {

		ArrayList<Integer> ArrayList1 = new ArrayList<>(Arrays.asList(100, 500, 900));
		ArrayList<Integer> ArrayList2 = new ArrayList<>(Arrays.asList(800, 600, 300));
		ArrayList<Integer> ArrayList3 = new ArrayList<>(Arrays.asList(400, 700, 200));

		ArrayOrganizer organizer = new ArrayOrganizer();

		ArrayList<Integer> resultList;

		resultList = organizer.concatAndSort(ArrayList1, ArrayList2, ArrayList3);

		System.out.println( "Result => " + resultList);

	}

}

