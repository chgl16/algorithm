package xyz.cglzwz.question_bank.sort;

public class QuickSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] n = new int[] {5, 2, 3, 9, 1};
		new QuickSort().quickSort(n, 0, n.length-1);
		for (int x : n) {
			System.out.println(x + " ");
		}
	}
	
	
	public void quickSort(int[] a, int left, int right) {
		int i = left;
		int j = right;
		int pivot = a[left];
		
		if (left >= right) {
			return;
		}
		
		// 右起扫描，过滤比枢轴大的
		while (j > i && a[j] > pivot) 
			j--;
		if (j > i) {
			// 直接复制右边第一个小于枢轴的元素给a[i]
			a[i] = a[j];
		}
		
		// 左起扫描，过滤比枢轴小的
		while (j > i && a[i] < pivot) 
			i++;
		
		if (j > i) {
			// 交换了
			a[j] = a[i];
		}
		
		// 基准值插入 i位置
		a[i] = pivot;
		
		quickSort(a, left, i - 1);
		quickSort(a, i + 1, right);
	}
	
	

}
