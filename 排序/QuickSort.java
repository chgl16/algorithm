package xyz.cglzwz.question_bank;

public class QuickSort {

	public static void main(String[] args) {
		int[] s = new int[] {0, 2, 3, 9, 1};
		quickSort(s, 0, s.length-1);
		
		for (int x : s) {
			System.out.println(x);
		}
	}

	
	public static void quickSort(int[] a, int left, int right) {
		// 必须先比较，不然分分钟下标越界
		if (left >= right)
			return;
		
		int i = left;
		int j = right;
		// 取第一个数做轴枢
		int pivot = a[left];
		
		
		while (i < j) {
			// 从右往左扫描，过滤比轴枢大的
			while (i < j && a[j] >= pivot) j--;   
			//交换比枢轴小的记录到左端
			a[i] = a[j];
			// 从左往右扫描，过滤比轴枢小的
			while (i < j && a[i] <= pivot) i++;
			//交换比枢轴大的记录到右端
			a[j] = a[i];
		}
		
		// 插入轴枢，此时 i = j
		a[i] = pivot;
		
		quickSort(a, left, i - 1);
		quickSort(a, i + 1, right);
	}
}
