#include <iostream>

using namespace std;

/*
 * @Lin  2018.5.14
 * 线性法求最大子序列和
 * 复杂度 O(n)
 */

int maxSubsquenceAns(int num[], int len) {
	int thisSum = 0, maxSum = 0;
	for(int i = 0; i <  len; ++i) {
		thisSum += num[i];
		if(thisSum > maxSum)
			maxSum = thisSum;
		else if(thisSum < 0)
			thisSum = 0;
	}
	return maxSum;
}

int main() {
	int num[5] = {-3, 8, -6, 9, -1};
	cout << "maxSum = " << maxSubsquenceAns(num, 5) << endl;

	return 0;
}


