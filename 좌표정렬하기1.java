import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		int [][] number = new int[input][2];
		
		for ( int i =0; i<input; i++) {
			number[i][0] = scanner.nextInt();
			number[i][1] = scanner.nextInt();
		}
		Arrays.sort(number, new Comparator<int[]> () {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[0] == o2[0]) {
					return Integer.compare(o1[1],o2[1]);
				}
				else {
					return Integer.compare(o1[0], o2[0]);
				}
			}
		});
		
		for (int i=0; i<input; i++) {
			System.out.println(number[i][0]+" "+number[i][1]);
		}
	}
	}

