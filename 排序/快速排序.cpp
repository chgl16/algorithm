#include <iostream>
#include <algorithm>

using namespace std;

int partition(int a[], int p, int r);

/*
 * @Lin  2018-5-30
 * 快排采用分治思想
 * T(n) = O(nlgn)
 *
 */

void quickSort(int a[], int p, int r) {   // p, r分别为起点和终端
	if(p < r) {
	    int q = partition(a, p, r);
	   	quickSort(a, p, q-1);   // 对做半段排序
		quickSort(a, q+1, r);   // 对右半段排序，轴q不需要进入排序
	}
}

/* 快排关键算法，以一个确定的基准元素a[p]对子数组a[p:r]进行划分 */
int partition(int a[], int p, int r) {
	int i = p, j = r + 1;
	int x = a[p];

	// 将 < x的元素交换到左边区域
	// 将 > x的元素交换到右边区域
	while(true) {
		while(a[++i]<x && i<r);
		while(a[--j] > x);
		if(i >= j) 
			break;
		swap(a[i], a[j]);
	}

	a[p] = a[j];
	a[j] = x;
	return j;
}

int main() {
	int a[5] = {5, 3, 4, 1, 2};
	quickSort(a, 0, 4);

	for(int i : a) {
		cout << i << " ";
	}
	cout << endl;
}
