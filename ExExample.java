import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExExample {
	
	private static int[] createArray(int size) throws MyArrayLenException {
		if (size < 0)
			throw new MyArrayLenException("Array size as to be non-negative");
		return new int[size];
	}
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean keepGoing = true;
		do {
			System.out.println("Please, pay attention," + " and give me a non-negative array size!");
			String str = br.readLine();
			int size = Integer.parseInt(str);
			try {
				int[] array = createArray(size);
				keepGoing = false;

			} catch (MyArrayLenException ex) {
				// deal with it, in here, let the user insert 
				// a new value
				keepGoing = true;
			} 
			// check condition for exiting the loop
		} while (keepGoing);
		System.out.println("Done with the loop");
	}
}
