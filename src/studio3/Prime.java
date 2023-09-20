package studio3;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Please enter a number: ");
	    int n = input.nextInt();
	    int[] arr = new int[n];
	    for(int m = 0; m<n;m++){
	      arr[m]= m+1;
	    }
	    System.out.println(" ");
	    for(int i = 1; i<10; i++){
	      int mid = i;
	      if(arr[i]!=0){
	        for(int x = i; x<n; x=x+i+1){
	          if(x!=mid){
	            arr[x]=0;
	          }
	        }
	      }
	    }
	    for(int y = 1; y<arr.length; y++){
	      if(arr[y]!=0){
	        System.out.print(arr[y]+ ", ");
	      }
	    }
	}
}