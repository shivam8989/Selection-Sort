package sorting;
import java.util.*;
public class Selectionsort {
    public static void printArray(int arr [] ){
        System.out.println();
        System.out.println("The sorted arrsy is ");
        for(int i =0 ; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0 ; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is");
        for(int i =0 ; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        for(int i =0; i<arr.length; i++){
            int samllest = i;
            for(int j =i+1; j<arr.length; j++){
                if(arr[samllest] >arr[j]){
                    samllest = j;
                }
            }
            int temp = arr[samllest];
            arr[samllest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
}
