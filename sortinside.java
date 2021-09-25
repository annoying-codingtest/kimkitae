import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		
		Scanner scanner = new Scanner(System.in);
		
		String number =scanner.next();
		String[] arr = number.split("");
		
		//내림차순 정렬
		Arrays.sort(arr,Comparator.reverseOrder());
		
		
		for(String str:arr) {
			System.out.print(str);
		}
		
	}
}
