import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=10000,i,j, sum=0;
	    int[] arr=new int[n];
	    int[] arr2=new int[100];
	    n=sc.nextInt();
	    for(i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	        for(j=0;j<arr[i];j++){
	            arr2[j]=sc.nextInt();
	        }
	        sum=+arr[i];
	    }
	    for(j=0;j<sum;j++){
	            System.out.println(arr2[j]+" ");
	    }
	}
}