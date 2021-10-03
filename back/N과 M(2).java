import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int n;
	public static int m;
	public static boolean[] flag;
	public static StringBuilder sb;
	public static int[] arr;
	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		flag = new boolean[n+1]; // 0부터 시작해서 +1
		sb = new StringBuilder();
		
		dfs(0);
		System.out.println(sb);
	}
	
	public static void dfs(int depth) {
		if( depth == m) { 
			for(int i =0; i<m; i++) {
				sb.append(arr[i]+" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=1; i<=n;i++) {
			if(!flag[i]) {
				arr[depth] = i; // i가 사용안됫으면 사용
				flag[i] = true;
				dfs(depth+1);
				for(int j=i+1 ; j<=n ;j++) {
					flag[j] = false;	
				}
			}
		}
	}
}
		
	
		 
		  
