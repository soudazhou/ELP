package Jiuzhang;

public class BinarySearch {

    public int binarySearchFirstOccurence(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int start = 0;
        int end = array.length - 1;
        int mid = 0;

        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (array[mid] == target) {
                end = mid;
            } else if (array[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (array[start] == target) {
            return start;
        }

        if(array[end] == target) {
            return end;
        }

        return -1;
    }

    public int binarySearchLastOccurence(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int start = 0;
        int end = array.length - 1;
        int mid = 0;

        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (array[mid] == target) {
                end = mid;
            } else if (array[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        /*check end first to get last occurences */
        if(array[end] == target) {
            return end;
        }

        if (array[start] == target) {
            return start;
        }


        return -1;
    }


    public int binarySearchAnyOccurence(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int start = 0;
        int end = array.length - 1;
        int mid = 0;

        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        /*check end first to get last occurences */
        if(array[end] == target) {
            return end;
        }

        if (array[start] == target) {
            return start;
        }

        return -1;
    }

    //http://www.lintcode.com/en/problem/search-for-a-range/
    public int[] searchRange(int[] A, int target) {
        if (A == null || A.length == 0) {
            return new int[]{-1, -1};
        }

        int start = 0;
        int end = A.length - 1;
        int mid = 0;
        int[] ans = new int[2];

        //search for left bound
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (A[mid] == target) {
                end = mid;
            } else if (A[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (A[start] == target) {
            ans[0] = start;
        } else if(A[end] == target) {
            ans[0] = end;
        } else {
            ans[0] = ans[1] = -1;
            return ans;
        }

     //search for right bound
        start = 0;
        end = A.length - 1;
        //search for left bound
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (A[mid] == target) {
                end = mid;
            } else if (A[mid] < target) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (A[end] == target) {
            ans[1] = end;
        } else if(A[start] == target) {
            ans[0] = start;
        } else {
            ans[0] = ans[1] = -1;
            return ans;
        }
        return ans;
    }
}
