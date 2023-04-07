package odev;

import java.util.Scanner;

public class FindTheMaxMin {
	public static void main(String[] args) {
		int value;
		int count;
	    int min = Integer.MAX_VALUE;
	    int max = Integer.MIN_VALUE;
	    
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kaç sayı gireceksin? ");
		count = sc.nextInt();
		int[] arr = new int[count];
		
		for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". Enter a number: ");
            value = sc.nextInt();
            arr[i] = value;

            if (value < min) {
                min = value;
            }

            if (value > max) {
                max = value;
            }
        }
		//System.out.println("Girilen sayılar:" + arr);
		
		System.out.println("Girilen en küçük sayı: "+ min);
		
		System.out.println("Girilen en büyük sayı: "+ max);
		
	}
}
