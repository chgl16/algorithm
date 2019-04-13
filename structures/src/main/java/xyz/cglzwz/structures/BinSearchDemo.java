package xyz.cglzwz.structures;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class BinSearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int binSearch(int[] a, int start, int end, int key) {
		int mid = start + (end - start) / 2;
		
		if (a[start] > key || a[end] < key) {
			return -1;
		}
		
		if (a[mid] == key) {
			return mid;
		} else if (a[mid] > key) {
			return binSearch(a, start, mid - 1, key);
		} else {
			return binSearch(a, mid + 1, end, key);
		}
		
	}
	
	
	@Test
	public void test() {
		int[] a = new int[] {1, 2, 2, 5, 7};
		Arrays.sort(a);
		System.out.println(binSearch(a, 0, a.length - 1, 2));
		System.out.println(binSearch(a, 0, a.length - 1, 6));
	}

}


