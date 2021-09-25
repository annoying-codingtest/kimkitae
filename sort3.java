import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int number= Integer.parseInt(br.readLine());
		int[] numbers = new int[number];
		
		for( int i =0; i<number ; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.parallelSort(numbers);
		// 오름차순 정렬

		for ( int i=0;i<number;i++) {
			bw.write(String.valueOf(numbers[i])+"\n");
		}
		br.close();
		bw.close();
		
		/*for (int s :numbers) {
			System.out.println(s);
		}    
		 왜 이걸쓰면 시간 초과 ? 
		 */
	}
}
