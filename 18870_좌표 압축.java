import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int input = Integer.parseInt(br.readLine());
		int[] arr = new int[input];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		br.close();
		for (int i=0; i<input; i++) {
		arr[i] = Integer.parseInt(st.nextToken());	
		}
		HashMap<Integer, Integer> ha = new HashMap<Integer,Integer>();
		
		int copy[] = arr.clone();
		Arrays.parallelSort(copy);
		int idx= 0;
		
		for(int i =0; i<input ; i++) {
			if(!ha.containsKey(copy[i])) 
				ha.put(copy[i],idx++);
			}
			for (int s : arr) {
				sb.append(ha.get(s)).append(" ");
			}
		
		System.out.println(sb);
	}

}
