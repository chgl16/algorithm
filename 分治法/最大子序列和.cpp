#include <iostream>
#include <algorithm>

using namespace std;

/*
 * @Lin 2018.5 
 * 使用分治法求最大子序列和
 * 三种情况：左边，右边，中间。如果是中间的情况从中间向两边分别计算maxLeftBorderSum，
 * maxRightBorderSum 再求两者和。分到一个，小于0的返回0
 * 复杂度 O(nlgn)
 */

int maxSubsquenceSum(int num[], int left, int right) {
	int maxLeftSum, maxRightSum;
	int maxLeftBorderSum, maxRightBorderSum;
	int leftBorderSum, rightBorderSum;  // 暂时保存计算值

	// 分到了单个元素
	if(left == right) {    
		if(num[left] > 0)
			return num[left];
		else
			return 0;
	}

    int mid = (left + right) / 2;
	// 计算出现在左右两边的最大和
	maxLeftSum = maxSubsquenceSum(num, left, mid);
	maxRightSum = maxSubsquenceSum(num, mid + 1, right);

	// 计算出现在中间的最大和	
	maxLeftBorderSum = 0, leftBorderSum = 0;
	for(int i = mid; i >= left; --i) {
		leftBorderSum += num[i];
		if(leftBorderSum > maxLeftBorderSum)
			maxLeftBorderSum = leftBorderSum;
	}


	maxRightBorderSum = 0, rightBorderSum = 0;
	for(int i = mid + 1; i <= right; ++i) {
		rightBorderSum += num[i];
		if(rightBorderSum > maxRightBorderSum)
			maxRightBorderSum = rightBorderSum;
	}

	return max(maxRightBorderSum + maxLeftBorderSum, max(maxLeftSum, maxRightSum));
}

int main() {

	int num[5] = {-3, 8, -6, 9, -1};
	cout << "maxSubsquenceSum = " << maxSubsquenceSum(num, 0, 4) << endl;  

	return 0;
}
