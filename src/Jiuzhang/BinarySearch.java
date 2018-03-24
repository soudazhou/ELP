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
}
