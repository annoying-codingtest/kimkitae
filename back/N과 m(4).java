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
		
		dfs(1, 0);
		System.out.println(sb.toString());
	}
	
	public static void dfs(int ss,int depth) {
		if( depth == m) { 
			for(int i =0; i<m; i++) {
				sb.append(arr[i]+" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=ss; i<=n;i++) {
			if(!flag[i]) {
				arr[depth] = i; // i가 사용안됫으면 사용
				dfs(i, depth+1);
			
			}
		}
	}
}
		
	
		 
		  
