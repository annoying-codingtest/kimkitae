import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		int[] numbers = new int[input];
		
		int sum = 0;
		
		int chabin = 0;
		
		for (int i =0; i<input; i++) {
			numbers[i] = scanner.nextInt();
			sum += numbers[i];
		}
		//산술평균
		sum =(int)Math.round((double)sum/(double)input);
		//Arrays를 이용하여 오름차순 정리
		Arrays.parallelSort(numbers);
		
		//최빈값 
		int[] arr= new int[8001];
		for(int i=0;i<input;i++) {
			arr[numbers[i]+4000]++;
		}
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
				chabin=i-4000;
			}
		}
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==max) {
				count++;
			}
			if(count>1) {
				chabin=i-4000;
				break;
			}
		}
		
		System.out.println(sum);
		System.out.println(numbers[(input/2)]);
		
		System.out.println(chabin);
		System.out.println(numbers[numbers.length-1]-numbers[0]);
		
	}

	
}
