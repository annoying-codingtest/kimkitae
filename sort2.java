import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int number = Integer.parseInt(bu.readLine());
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for (int i =0; i< number; i++) {
			numbers.add(Integer.parseInt(bu.readLine()));
		}
		Collections.sort(numbers);
		/* 1번 정렬문제처럼 Arrays를 이용할려했지만 시간복잡도가
		 * 달라서 시간초과 뜸, collections 함수를 이용할 때 배열이 사용이 안됨*/
		
		for ( int i =0; i<number; i++) {
			bw.write(String.valueOf(numbers.get(i)+ "\n"));
		}
		bu.close();
		bw.close();
	}
}
